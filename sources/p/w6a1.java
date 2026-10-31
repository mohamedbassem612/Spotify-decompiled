package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w6a1 implements tyq {
    public final d0r a;
    public final njm b;
    public final hvp0 c;
    public final a7a1 d;
    public final nm1 e;
    public final o3r f;
    public final js20 g;
    public final eih1 h;
    public final psw i;

    public w6a1(d0r d0rVar, njm njmVar, hvp0 hvp0Var, bv40 bv40Var, a7a1 a7a1Var) {
        this.a = d0rVar;
        this.b = njmVar;
        this.c = hvp0Var;
        this.d = a7a1Var;
        this.e = new nm1(njmVar, d0rVar, bv40Var);
        jd11 jd11Var = rc11.a;
        this.f = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 1, y5a1.f, new j4r(y5a1.d), y5a1.g), new l4r(new xv00(jd11Var.b(f7a1.class)), 1, y5a1.h, new j4r(y5a1.e), y5a1.i), yd81.Z0);
        this.g = z0o1.j(new dr91((Object) this, (byte) 9), new nsm0(2, this, w6a1.class, "mapToState", "mapToState(Lcom/spotify/songdna/elements/collaboratormapelement/song/SongCollaboratorMapElement$Props;Lcom/spotify/songdna/elements/collaboratormapelement/song/SongCollaboratorMapElement$ExternalState;)Lcom/spotify/songdna/elements/collaboratormapelement/song/SongCollaboratorMapElement$State;", 0, (byte) 27), null, 12);
        this.h = new eih1();
        j2i j2iVar = new j2i(397398460, new u491(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.a;
    }

    public final void f(String str, c380 c380Var, t6a1 t6a1Var, vzq0 vzq0Var, long j, b0k b0kVar, int i) {
        b0k b0kVar2;
        p3v p3vVar;
        vu30 vu30Var;
        qim0 qim0VarC;
        boolean z;
        m4c m4cVar = fkj0.X;
        e2x0 e2x0Var = e2x0.Q0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-781752047);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(t6a1Var) ? 256 : 128) | (b0kVar3.i(vzq0Var) ? 2048 : 1024) | (b0kVar3.f(j) ? 16384 : 8192) | (b0kVar3.i(this) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = t6a1Var instanceof s6a1;
            if (z2) {
                p3vVar = new p3v(((s6a1) t6a1Var).a);
            } else {
                if (!u890.j(t6a1Var, e2x0Var)) {
                    eg.o();
                    return;
                }
                p3vVar = null;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (z2) {
                vu30Var = null;
                qim0VarC = u291.z(nim0Var, (fra) null, 3);
            } else {
                vu30Var = null;
                if (!u890.j(t6a1Var, e2x0Var)) {
                    eg.o();
                    return;
                }
                qim0VarC = u291.c(nim0Var, 1.0f);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarC);
            if (this.d.f) {
                b0kVar3.i0(-1861521087);
                boolean zI = b0kVar3.i(this);
                Object objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    objT = new wh91(this, (byte) 5);
                    b0kVar3.s0(objT);
                }
                z = false;
                b0kVar3.r(false);
                vu30Var = (vu30) objT;
            } else {
                z = false;
                b0kVar3.i0(-1861368009);
                b0kVar3.r(false);
            }
            boolean z3 = ((i2 & 14) == 4 ? true : z) | ((57344 & i2) == 16384);
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new se00(str, j);
                b0kVar3.s0(objT2);
            }
            p3v p3vVar2 = p3vVar;
            vu30 vu30Var2 = vu30Var;
            b0kVar2 = b0kVar3;
            q3p1.d(this.a, this.c, c380Var, this.e, (iu30) objT2, vzq0Var, qim0VarThen, p3vVar2, vu30Var2, b0kVar2, ((i2 << 3) & 896) | 4096 | (458752 & (i2 << 6)));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r6a1(this, str, c380Var, t6a1Var, vzq0Var, j, i);
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
