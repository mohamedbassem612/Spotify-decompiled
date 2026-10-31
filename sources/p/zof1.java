package p;

import android.content.res.Resources;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zof1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dpf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zof1(dpf1 dpf1Var, byte b) {
        super(2);
        this.a = b;
        this.b = dpf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x014b  */
    public final Object invoke(Object obj, Object obj2) {
        String strS;
        String strE;
        String strUri;
        boolean z;
        String str;
        String strA0;
        int i;
        byte b = this.a;
        dpf1 dpf1Var = this.b;
        switch (b) {
            case 0:
                nof1 nof1Var = (nof1) obj;
                jof1 jof1Var = (jof1) obj2;
                fqa1 fqa1Var = jof1Var.e;
                vof1 vof1Var = jof1Var.b;
                Resources resources = dpf1Var.h;
                jo70 jo70Var = vof1Var.a;
                String strF0 = jo70Var.a;
                io70 io70Var = jo70Var.e;
                jo70 jo70Var2 = vof1Var.d;
                io70 io70Var2 = jo70Var2.e;
                ktl ktlVar = vof1Var.b.a;
                vbs vbsVar = dpf1Var.t;
                boolean z2 = vbsVar.a;
                ContextTrack contextTrack = jof1Var.a;
                boolean zT = l4o1.T(contextTrack);
                String str2 = null;
                ktl ktlVar2 = ktl.b;
                if (zT && ktlVar == ktlVar2) {
                    strS = o7h.y0(jo70Var2.d, ", ", (String) null, (String) null, smf1.h, 30);
                } else {
                    boolean z3 = vof1Var.c;
                    boolean z4 = vbsVar.c;
                    boolean z5 = z2 && vbsVar.b && l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI) == null && z3;
                    if (dpf1.f(jof1Var)) {
                        strS = dpf1Var.g(2131958987, o7h.y0(jo70Var.d, ", ", (String) null, (String) null, smf1.t, 30), io70Var2 != null ? io70Var2.a : null);
                        if (strS.length() <= 0) {
                            if (l4o1.P(contextTrack)) {
                                strS = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_TITLE);
                                if (strS == null) {
                                    strS = "";
                                }
                            } else {
                                strS = l4o1.l(contextTrack);
                            }
                        }
                    } else if (l4o1.U(contextTrack) && ktlVar == ktl.c) {
                        strS = io70Var2 != null ? io70Var2.a : null;
                        if (strS == null) {
                            strS = "";
                        }
                    } else {
                        j341 j341VarJ = cev0.J(jo70Var, ktlVar, z2 && z3, z4);
                        if (j341VarJ != null) {
                            strS = j341VarJ.a(new zof1(dpf1Var, (byte) 1));
                        } else {
                            strS = l0p1.s(jo70Var, ktlVar, z5 && z4);
                        }
                        if (strS.length() <= 0) {
                            if (l4o1.P(contextTrack)) {
                                strS = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_TITLE);
                                if (strS == null) {
                                    strS = "";
                                }
                            } else {
                                strS = l4o1.l(contextTrack);
                            }
                        }
                    }
                }
                boolean z6 = ktlVar == ktlVar2;
                boolean zEquals = l4o1.b0(contextTrack).equals(nof1Var.a());
                String str3 = io70Var != null ? io70Var.b : null;
                String str4 = io70Var2 != null ? io70Var2.b : null;
                if (dpf1.f(jof1Var)) {
                    strF0 = dpf1Var.g(2131958988, strF0, io70Var != null ? io70Var.a : null);
                    if (strF0.length() <= 0) {
                        strF0 = l4o1.f0(contextTrack);
                        if (strF0 == null) {
                            strF0 = "";
                        }
                    }
                } else if (strF0.length() <= 0) {
                    strF0 = l4o1.f0(contextTrack);
                    if (strF0 == null) {
                        strF0 = "";
                    }
                }
                eqa1 eqa1Var = eqa1.a;
                if (fqa1Var.equals(eqa1Var)) {
                    strE = strS;
                } else {
                    if (!(fqa1Var instanceof fqa1)) {
                        eg.o();
                        return null;
                    }
                    int i2 = fqa1Var.a;
                    String quantityString = resources.getQuantityString(2131820928, i2, Integer.valueOf(i2));
                    ira iraVarC = ira.c();
                    strE = iraVarC.e(quantityString);
                    if (ihc1.y0(strS)) {
                        strE.getClass();
                    } else {
                        strE = xcg1.i(strE, " • ", iraVarC.e(strS));
                    }
                }
                if (!fqa1Var.equals(eqa1Var)) {
                    if (!(fqa1Var instanceof fqa1)) {
                        eg.o();
                        return null;
                    }
                    fqa1 fqa1Var2 = fqa1Var;
                    int iC = l1d.C(fqa1Var2.b);
                    if (iC == 0) {
                        i = 2131820929;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        i = 2131820930;
                    }
                    int i3 = fqa1Var2.a;
                    String quantityString2 = resources.getQuantityString(i, i3, Integer.valueOf(i3));
                    strS = ihc1.y0(strS) ? quantityString2 : f4i1.f(quantityString2, ", ", strS);
                }
                boolean z7 = jof1Var.d;
                boolean z8 = l4o1.S(contextTrack) && dpf1Var.i.a();
                l4m l4mVar = jof1Var.c;
                String str5 = strE;
                boolean zL = l4o1.L(contextTrack);
                if (l4o1.T(contextTrack)) {
                    strUri = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI);
                } else if (l4o1.G(contextTrack)) {
                    strUri = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI);
                } else {
                    strUri = (l4o1.P(contextTrack) || l4o1.L(contextTrack)) ? contextTrack.uri() : l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI);
                }
                String str6 = strUri;
                String strA = nof1Var.a();
                if (!l4o1.U(contextTrack) || zEquals) {
                    if (u890.j(str3, "spotify:playlist:37i9dQZEVXhds8kU6ckEgw")) {
                        z = z8;
                        str = strA;
                    } else {
                        z = z8;
                        str = strA;
                        if (!nhc1.Y(contextTrack.uri(), "spotify:local", false)) {
                            if (z6 && l4o1.T(contextTrack)) {
                                str2 = str3;
                            } else if (z6) {
                                strA0 = l4o1.b0(contextTrack);
                            } else if (l4o1.U(contextTrack)) {
                                str2 = str4;
                            } else {
                                strA0 = l4o1.P(contextTrack) ? l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI) : (String) o7h.s0(l4o1.n(contextTrack));
                            }
                        }
                        str2 = strA0;
                    }
                    strA0 = "spotify:local-files";
                    str2 = strA0;
                } else {
                    z = z8;
                    str = strA;
                }
                return new mof1(strF0, str5, strS, z7, z, l4mVar, z6, fqa1Var, zL, str6, str2, str);
            default:
                return dpf1Var.h.getString(2131959046, (String) obj, (String) obj2);
        }
    }
}
