package com.mycompany.jogodavelha2022;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author PAGLIARI
 */
public class Principal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	int qtde;
	int jogador;
	static int pos[][] = new int[3][3];
	JButton b[] = new JButton[9];
	String ganhador;
	String jogador1;
	String jogador2;
	private String mododejogo;

	// teste
//	int nivelDificuldade;
//
//	public int getNivelDificuldade() {
//		return nivelDificuldade;
//	}
//
//	public void setNivelDificuldade(int nivelDificuldade) {
//		this.nivelDificuldade = nivelDificuldade;
//	}

	public String getMododejogo() {
		return mododejogo;
	}

	public void setMododejogo(String mododejogo) {
		this.mododejogo = mododejogo;
	}

	// setando os botoes
	public Principal() {
		initComponents();
		qtde = 1;
		jogador = 1;
		b[0] = Botao1;
		b[1] = Botao2;
		b[2] = Botao3;
		b[3] = Botao4;
		b[4] = Botao5;
		b[5] = Botao6;
		b[6] = Botao7;
		b[7] = Botao8;
		b[8] = Botao9;

	}

	// realiza a jogada, fazendo a jogada do player e em seguida a do bot
	public void jogada(JButton b, int x, int y) {
		b.setEnabled(false);
		for (int i = 10; i <= 10; ++i) {
			if (jogador == 1) {
				pos[x][y] = 1;
				b.setText("X");
				ganhador = jogador1;
				jogadaBot(b, y, y);
				checarjogada(1);
				checarjogadaBot();
			} else if (jogador == 2) {
				ganhador = "Computador";
				checarjogada(2);
				checarjogadaBot();
			}
		}
		qtde++;
	}

	// jogada 1 contra 1
	public void jogada1V1(JButton b, int x, int y) {
		b.setEnabled(false);
		if (jogador == 1) {
			pos[x][y] = 1;
			b.setText("X");
			checarjogada(2);
			jogador = 2;
			ganhador = jogador2;
		} else {
			pos[x][y] = 2;
			b.setText("0");
			checarjogada(2);
			jogador = 1;
			ganhador = jogador1;
		}
		qtde++;
	}

	// realiza as jogadas do bot, tambem pode ser implementado la em baixo nos
	// proprios botoes.
	public boolean jogadaBot(JButton b2, int x, int y) {
		// b1
		if (Botao1.getText().equals("X") && Botao4.getText().equals("")) {
			Botao4.setEnabled(false);
			Botao4.setText("0");
		}
		// b2
		{
			if (Botao2.getText().equals("X") && Botao3.getText().equals("")) {
				Botao3.setEnabled(false);
				Botao3.setText("0");
			} else if (Botao2.getText().equals("X") && Botao3.getText().equals("X") && Botao8.getText().equals("")) {
				Botao8.setEnabled(false);
				Botao8.setText("0");
			}
		}
		// b3
		{
			if (Botao3.getText().equals("X") && Botao2.getText().equals("")) {
				Botao2.setEnabled(false);
				Botao2.setText("0");
			} else if (Botao3.getText().equals("X") && Botao4.getText().equals("X") && Botao6.getText().equals("")) {
				Botao6.setEnabled(false);
				Botao6.setText("0");
			} else if (Botao3.getText().equals("X") && Botao4.getText().equals("X") && Botao6.getText().equals("X")
					&& Botao9.getText().equals("")) {
				Botao9.setEnabled(false);
				Botao9.setText("0");
			}
		}
		// b4
		{
			if (Botao4.getText().equals("X") && Botao5.getText().equals("")) {
				Botao5.setEnabled(false);
				Botao5.setText("0");

			} else if (Botao4.getText().equals("X") && Botao5.getText().equals("X") && Botao1.getText().equals("")) {
				Botao1.setEnabled(false);
				Botao1.setText("0");
			}
		}
		// b5
		{
			if (Botao5.getText().equals("X") && Botao1.getText().equals("")) {
				Botao1.setEnabled(false);
				Botao1.setText("0");
			} else if (Botao5.getText().equals("X") && Botao7.getText().equals("X") && Botao3.getText().equals("")&& Botao3.getText().equals("X")) {
				Botao3.setEnabled(false);
				Botao3.setText("0");
			} else if (Botao5.getText().equals("X") && Botao7.getText().equals("X") && Botao3.getText().equals("") && Botao1.getText().equals("")) {
				Botao1.setEnabled(false);
				Botao1.setText("0");
			}
			// b6
		}
		{
			if (Botao6.getText().equals("X") && Botao7.getText().equals("")) {
				Botao7.setEnabled(false);
				Botao7.setText("0");
			} else if (Botao6.getText().equals("X") && Botao7.getText().equals("") && Botao4.getText().equals("")) {
				Botao4.setEnabled(false);
				Botao4.setText("0");
			}
		}
		// b7
		if (Botao7.getText().equals("X") && Botao8.getText().equals("")) {
			Botao8.setEnabled(false);
			Botao8.setText("0");
		}
		// b8
		{

			if (Botao8.getText() == "X" && Botao9.getText() == "") {
				Botao9.setEnabled(false);
				Botao9.setText("0");
			} else if (Botao8.getText().equals("X") && Botao9.getText().equals("X") && Botao5.getText().equals("")) {
				Botao5.setEnabled(false);
				Botao5.setText("0");
			}
//		else if (Botao8.getText() == "X" && Botao2.getText() == ""){
//			Botao2.setText("X");
//			
//		}

//		// b9
		}
		if (Botao9.getText().equals("X") && Botao6.getText().equals("")) {
			Botao6.setEnabled(false);
			Botao6.setText("0");
		}

		qtde++;
		return rootPaneCheckingEnabled;
	}

// checa jogada do player
	public void checarjogada(int i) {
		if (vitoria(jogador) == true) {
			JOptionPane.showMessageDialog(null, ganhador + " " + "Venceu!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
			fimjogo();
		}
	}

	// checa jogada do bot
	public void checarjogadaBot() {
		if (vitoriaBot(jogador) == true) {
			JOptionPane.showMessageDialog(null, " Computador Venceu!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
			fimjogo();
		}
	}

	// verifica se player ganhou
	public boolean vitoria(int x) {
		for (int i = 0; i < pos.length; i++) {
			if (pos[i][0] == x && pos[i][1] == x && pos[i][2] == x) {
				return true;
			}
			if (pos[0][i] == x && pos[1][i] == x && pos[2][i] == x) {
				return true;
			}
		}
		if (pos[0][0] == x && pos[1][1] == x && pos[2][2] == x) {
			return true;
		}
		if (pos[0][2] == x && pos[1][1] == x && pos[2][0] == x) {
			return true;
		}

		//
		return false;
	}

	// verifica se o bot ganhou
	public boolean vitoriaBot(int x) {
		for (int i = 0; i < pos.length; i++) {
			// verifica horizontais do bot
			if (Botao7.getText() == "0" && Botao8.getText() == "0" && Botao9.getText() == "0") {
				return true;
			}
			if (Botao4.getText() == "0" && Botao5.getText() == "0" && Botao6.getText() == "0") {
				return true;
			}
			if (Botao1.getText() == "0" && Botao2.getText() == "0" && Botao3.getText() == "0") {
				return true;
			}
		}
		// verifica verticais do bot
		if (Botao1.getText() == "0" && Botao4.getText() == "0" && Botao7.getText() == "0") {
			return true;
		}
		if (Botao2.getText() == "0" && Botao5.getText() == "0" && Botao8.getText() == "0") {
			return true;
		}
		if (Botao3.getText() == "0" && Botao6.getText() == "0" && Botao9.getText() == "0") {
			return true;
		}

		// verifica diagonais do bot
		if (Botao1.getText().equals("0") && Botao5.getText() == "0" && Botao9.getText() == "0") {
			return true;
		}
		if (Botao3.getText() == "0" && Botao5.getText() == "0" && Botao7.getText() == "0") {
			return true;
		}

		//
		return false;
	}

	// finaliza o jogo, desativa os botões
	public void fimjogo() {
		for (int i = 0; i < 9; i++) {
			b[i].setEnabled(false);
		}
	}

	// inicia, ativando os botoes e setando eles como vazios
	public void limpar() {
		for (int i = 0; i < 9; i++) {
			b[i].setEnabled(true);
			b[i].setText("");
		}
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				pos[x][y] = 0;
			}
		}
		jogador = 1;
		jogador1 = "";
		jogador2 = "";
		ganhador = "";
// teste de dificuldade
//		if (nivelDificuldade == 1) {
//			System.out.println("Modo selecionado : Facil");
//
//		}
//		if (nivelDificuldade == 2) {
//			System.out.println("Modo selecionado : Medio");
//
//		}
//		if (nivelDificuldade == 3) {
//			System.out.println("Modo selecionado : Dificil");
//		}

	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jComboBox1 = new javax.swing.JComboBox<>();
		Botao1 = new javax.swing.JButton();
		Botao2 = new javax.swing.JButton();
		Botao3 = new javax.swing.JButton();
		Botao4 = new javax.swing.JButton();
		Botao5 = new javax.swing.JButton();
		Botao6 = new javax.swing.JButton();
		Botao7 = new javax.swing.JButton();
		Botao8 = new javax.swing.JButton();
		Botao9 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton10 = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		OpcaoFacil = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		OpcaoOpcao = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		OpcaoSair = new javax.swing.JMenu();

		jMenuItem1.setText("jMenuItem1");

		jMenuItem2.setText("jMenuItem2");

		jMenuItem3.setText("jMenuItem3");

		jComboBox1.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 0, 0));

		Botao1.setEnabled(false);
		Botao1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao1ActionPerformed(evt);
			}
		});

		Botao2.setEnabled(false);
		Botao2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao2ActionPerformed(evt);
			}
		});

		Botao3.setEnabled(false);
		Botao3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao3ActionPerformed(evt);
			}
		});

		Botao4.setEnabled(false);
		Botao4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao4ActionPerformed(evt);
			}
		});

		Botao5.setEnabled(false);
		Botao5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao5ActionPerformed(evt);
			}
		});

		Botao6.setEnabled(false);
		Botao6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao6ActionPerformed(evt);
			}
		});

		Botao7.setEnabled(false);
		Botao7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao7ActionPerformed(evt);
			}
		});

		Botao8.setEnabled(false);
		Botao8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao8ActionPerformed(evt);
			}
		});

		Botao9.setEnabled(false);
		Botao9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Botao9ActionPerformed(evt);
			}
		});

		jLabel1.setText("jLabel1");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setText("Para Iniciar o Jogo Aperte CTRL + 8 !");
		jScrollPane1.setViewportView(jTextArea1);

		jButton10.setText("jButton10");

		OpcaoFacil.setText("Contra Computador");
		OpcaoFacil.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				OpcaoFacilStateChanged(evt);
			}
		});
		OpcaoFacil.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OpcaoFacilActionPerformed(evt);
			}
		});

		jLabel2.setText("Multiplayer");

		jButton1.setText("2 Jogadores (1v1)");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel3.setText("SinglePlayer");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(OpcaoFacil, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(103, 103, 103)
												.addComponent(jLabel4).addGap(0, 0, Short.MAX_VALUE))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41)
												.addComponent(jLabel2))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(14, 14, 14)
												.addComponent(jButton1)))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel3)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(29, Short.MAX_VALUE)
						.addComponent(jLabel4).addGap(12, 12, 12).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(OpcaoFacil)
						.addGap(69, 69, 69).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton1)
						.addGap(82, 82, 82)));

		OpcaoOpcao.setText("Opção");
		OpcaoOpcao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				OpcaoOpcaoActionPerformed(evt);
			}
		});

		jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8,
				java.awt.event.InputEvent.CTRL_DOWN_MASK));
		jMenuItem4.setMnemonic('N');
		jMenuItem4.setText("1v1");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		OpcaoOpcao.add(jMenuItem4);

		jMenuBar1.add(OpcaoOpcao);

		OpcaoSair.setText("Sair");
		OpcaoSair.addMenuListener(new javax.swing.event.MenuListener() {
			public void menuCanceled(javax.swing.event.MenuEvent evt) {
			}

			public void menuDeselected(javax.swing.event.MenuEvent evt) {
			}

			public void menuSelected(javax.swing.event.MenuEvent evt) {
				OpcaoSairMenuSelected(evt);
			}
		});
		jMenuBar1.add(OpcaoSair);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(Botao7, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(Botao2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao5, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(Botao3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao6, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(Botao4, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Botao5, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(7, 7, 7)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(Botao9, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Botao7, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 89,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(7, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao1, 0, 0);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao1, 0, 0);
		}
	}

	private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao2, 0, 1);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao2, 0, 1);
		}
	}

	private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao3, 0, 2);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao3, 0, 2);
		}
	}

	private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao4, 1, 0);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao4, 1, 0);
		}
	}

	private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao5, 1, 1);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao5, 1, 1);
		}
	}

	private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao6, 1, 2);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao6, 1, 2);
		}
	}

	private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao7, 2, 0);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao7, 2, 0);
		}
	}

	private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao8, 2, 1);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao8, 2, 1);
		}
	}

	private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {
		if (getMododejogo() == "1V1") {
			jogada1V1(Botao9, 2, 2);
		} else if (getMododejogo() == "BOT") {
			jogada(Botao9, 2, 2);
		}
	}

	private void OpcaoSairMenuSelected(javax.swing.event.MenuEvent evt) {
		System.exit(0);
	}

	private void OpcaoOpcaoActionPerformed(java.awt.event.ActionEvent evt) {
		jogador1 = JOptionPane.showInputDialog("Digite o Nome do Jogador Humano:");
		setMododejogo("BOT");
		limpar();
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		jogador1 = JOptionPane.showInputDialog("Digite o Nome do Jogador Humano:");
		setMododejogo("BOT");
		limpar();
	}

	private void OpcaoFacilActionPerformed(java.awt.event.ActionEvent evt) {
		jogador1 = JOptionPane.showInputDialog("Digite o Nome do Jogador Humano:");
		setMododejogo("BOT");
		limpar();

//		setNivelDificuldade(1);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		setMododejogo("1V1");
		limpar();
		jogador1 = JOptionPane.showInputDialog("Digite o Nome do Primeiro Jogador:");
		jogador2 = JOptionPane.showInputDialog("Digite o Nome do Segundo Jogador:");
	}

	private void OpcaoFacilStateChanged(javax.swing.event.ChangeEvent evt) {

	}

	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Principal().setVisible(true);
			}
		});
	}

	// declarando as variaveis
	private javax.swing.JButton Botao1;
	private javax.swing.JButton Botao2;
	private javax.swing.JButton Botao3;
	private javax.swing.JButton Botao4;
	private javax.swing.JButton Botao5;
	private javax.swing.JButton Botao6;
	private javax.swing.JButton Botao7;
	private javax.swing.JButton Botao8;
	private javax.swing.JButton Botao9;
	private javax.swing.JButton OpcaoFacil;
	private javax.swing.JMenu OpcaoOpcao;
	private javax.swing.JMenu OpcaoSair;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JComboBox<String> jComboBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration
}