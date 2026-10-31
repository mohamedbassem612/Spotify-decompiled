package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fyc implements o1i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public fyc(bcl1 bcl1Var, bih1 bih1Var) {
        this.a = (byte) 1;
        this.b = bcl1Var;
        this.c = bih1Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((eyc) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((oje) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((o8l1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, "call_to_action_sheet_button", null, ((eyc) z0iVar).e, 4));
            case 1:
                return new x0i(new w0i(o0iVar.e, "chapter_navigation_list_button", null, null, 12));
            default:
                return new x0i(new w0i(o0iVar.e, "end_of_feed_layout", ((o8l1) z0iVar).e, null, 8));
        }
    }

    public void c(eyc eycVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-929652102);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(eycVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str = eycVar.a;
            hux huxVar = eycVar.b;
            String str2 = eycVar.d;
            boolean zI = ((i2 & 14) == 4) | x340Var.i(this);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zI | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new d1c(eycVar, this, o0iVar, (byte) 5);
                x340Var.s0(objT);
            }
            qpn1.a(((i2 << 6) & 57344) | 64, str, str2, (Function0) objT, x340Var, huxVar, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, eycVar, o0iVar, qim0Var, (byte) 11);
        }
    }

    public void d(oje ojeVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-545838508);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(ojeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(o0iVar) : x340Var2.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        boolean z = true;
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarR = u291.r(qim0Var, 32.0f);
            boolean zI = x340Var2.i(this);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !x340Var2.i(o0iVar))) {
                z = false;
            }
            boolean zI2 = zI | z | x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new d1c(this, o0iVar, ven0Var, (byte) 9);
                x340Var2.s0(objT2);
            }
            cwl1.b(qim0VarR, (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, apo.r(453602237, new dwd(ojeVar, (byte) 5), x340Var2), x340Var2, 0, 48, 1534);
            x340Var = x340Var2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-327883386);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q((Object) null);
                    x340Var.s0(objT3);
                }
                ven0 ven0Var2 = (ven0) objT3;
                scx scxVarM = pno1.m(x340Var);
                boolean zI3 = x340Var.i(this) | x340Var.i(ven0Var2) | x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new d1c(this, ven0Var2, ven0Var, (byte) 10);
                    x340Var.s0(objT4);
                }
                x74.f((Function0) objT4, scxVarM, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(2027274362, new jb1(this, o0iVar, ven0Var2, ojeVar, scxVarM, (byte) 6), x340Var), x340Var, 0, 48, 2044);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-326092082);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, ojeVar, o0iVar, qim0Var, (byte) 17);
        }
    }

    public void e(o8l1 o8l1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z;
        o8l1 o8l1Var2 = o8l1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-517257605);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(o8l1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 112;
            lyg.k((cce) this.c, o0iVar, o8l1Var2, qim0Var2, x340Var, 64 | i3 | ((i2 << 6) & 896) | ((i2 << 3) & 7168));
            boolean zI = x340Var.i(this);
            if (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                o8l1Var2 = o8l1Var2;
                o8l1Var2 = o8l1Var2;
                z = true;
            } else {
                o8l1Var2 = o8l1Var2;
                o8l1Var2 = o8l1Var2;
                z = false;
            }
            int i4 = i2 & 14;
            boolean z2 = zI | z | (i4 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new jyi1(this, o0iVar, o8l1Var2, (byte) 9);
                x340Var.s0(objT);
            }
            oto1.c(o8l1Var2, o0iVar, (iu30) objT, x340Var, i4 | 64 | i3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, o8l1Var2, o0iVar, qim0Var, (byte) 3);
        }
    }

    public /* synthetic */ fyc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }
}
