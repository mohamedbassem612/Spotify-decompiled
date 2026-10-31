package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gr91 {
    public final void a(pfj0 pfj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        float f;
        boolean z;
        MessageTemplate messageTemplate;
        boolean z2;
        int i3;
        int i4;
        pfj0 pfj0Var2 = pfj0Var;
        iu30 iu30Var2 = iu30Var;
        MessageResponseToken messageResponseToken = pfj0Var2.a;
        kfj0 kfj0Var = pfj0Var2.b;
        Button button = kfj0Var.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1582469908);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(pfj0Var2) : x340Var.i(pfj0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = Boolean.valueOf(button == null);
                x340Var.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            int i5 = i2;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarF, jA, er31.b(8.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, button == null ? een.N0 : een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            AccessoryContent accessoryContent = kfj0Var.c;
            if (accessoryContent == null) {
                x340Var.i0(428573813);
                x340Var.r(false);
                z2 = false;
                messageTemplate = messageTemplateI;
                i3 = 32;
                z = true;
            } else {
                x340Var.i0(428573814);
                zov0 zov0Var = cbx.b(x340Var).g;
                if (button == null) {
                    x340Var.i0(2006273959);
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 48.0f;
                } else {
                    x340Var.i0(2006276167);
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 64.0f;
                }
                qim0 qim0VarN = anm1.N("messaging_snackbar_accessory_content", nim0Var);
                cvx cvxVar2 = cbx.b(x340Var).b;
                z = true;
                messageTemplate = messageTemplateI;
                float f2 = f;
                z2 = false;
                i3 = 32;
                y9j0.a(accessoryContent, messageTemplate, uyn1.B(qim0VarN, 0.0f, 0.0f, 16.0f, 0.0f, 11), null, f2, 24.0f, null, 0.0f, x340Var, AccessoryContent.$stable, 200);
                x340Var = x340Var;
                x340Var.r(false);
            }
            float f3 = zBooleanValue ? 0.7f : 1.0f;
            if (f3 <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            if (f3 > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            wnb0 wnb0Var = new wnb0(f3, z);
            int i6 = i3;
            MessageTemplate messageTemplate2 = messageTemplate;
            boolean z4 = z2;
            pfj0Var2 = pfj0Var;
            iu30Var2 = iu30Var;
            w2g0.c(wnb0Var, button == null ? een.g : graVar, apo.r(-68654124, new hh1(pfj0Var2, zBooleanValue, messageTemplate2, this, iu30Var), x340Var), x340Var, 3072, 4);
            x340Var.r(z);
            byte b = 17;
            if (button == null) {
                x340Var.i0(-1951264288);
                x340Var.r(z4);
                i4 = i6;
            } else {
                x340Var.i0(-1951264287);
                fux fuxVar = fux.c;
                Icon icon = button.getStyle().getIcon();
                long jP = v9p1.P(v9p1.E(messageResponseToken.getMessageData().getFormat().getTemplate(), x340Var), icon != null ? icon.getColor() : null);
                qim0 qim0VarA = h2c.a.a(anm1.N("messaging_snackbar_x_button", nim0Var), een.f);
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131953955));
                boolean zI = ((i5 & 112) == i6 ? z : z4) | x340Var.i(button);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new u5a(iu30Var2, button, b);
                    x340Var.s0(objT2);
                }
                x340 x340Var2 = x340Var;
                i4 = 32;
                y9j0.l(fuxVar, messageTemplate2, jslVar, qim0VarA, jP, 0.0f, (Function0) objT2, x340Var2, fux.d, 32);
                x340Var = x340Var2;
                x340Var.r(z4);
            }
            boolean z5 = (i5 & 112) == i4 ? z : z4;
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new v5a(iu30Var2, null, b);
                x340Var.s0(objT3);
            }
            qxd0.s(pfj0Var2, iu30Var2, (vu30) objT3, x340Var);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, pfj0Var2, iu30Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:98:0x0153  */
    public final void b(Button button, MessageTemplate messageTemplate, iu30 iu30Var, qim0 qim0Var, zzq0 zzq0Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        MessageTemplate messageTemplate2;
        qim0 qim0Var2;
        int i5;
        boolean z;
        boolean z2;
        qim0 qim0Var3;
        int i6;
        h311 h311VarV;
        boolean z3;
        int i7;
        boolean z4;
        Object objT;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(735487688);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            messageTemplate2 = messageTemplate;
            i4 |= x340Var.i(messageTemplate2) ? 32 : 16;
        } else {
            messageTemplate2 = messageTemplate;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if (x340Var.i(zzq0Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    i5 = i;
                    int i10 = x340Var.e(i5) ? 131072 : 65536;
                    i4 |= i10;
                } else {
                    i5 = i;
                }
                i4 |= i10;
            } else {
                i5 = i;
            }
            z = false;
            if ((74899 & i4) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i4 & 1, z2)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                        i5 = 5;
                    }
                } else {
                    x340Var.b0();
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                }
                qim0 qim0Var4 = qim0Var2;
                x340Var.s();
                gdx gdxVarA = yla.s(x340Var).a();
                qim0 qim0VarN = anm1.N("messaging_snackbar_primary_button", uyn1.z(0.0f, 0.0f, 2, qim0Var4));
                cr31 cr31VarB = er31.b(0.0f);
                if ((i4 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i7 = i4 & 14;
                if (i7 != 4 || ((i4 & 8) != 0 && x340Var.i(button))) {
                    z = true;
                }
                z4 = z3 | z;
                objT = x340Var.T();
                if (z4 || objT == fkj0.X) {
                    objT = new u5a(iu30Var, button, (byte) 18);
                    x340Var.s0(objT);
                }
                int i11 = i5;
                y9j0.p(button, messageTemplate2, qim0VarN, i11, gdxVarA, zzq0Var, null, cr31VarB, bjc0.a, (Function0) objT, x340Var, Button.$stable | i7 | (i4 & 112) | ((i4 >> 6) & 7168) | ((i4 << 3) & 458752));
                i6 = i11;
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                i6 = i5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lr90(this, button, messageTemplate, iu30Var, qim0Var3, zzq0Var, i6, i2, i3, (byte) 1);
            }
        }
        i4 |= 3072;
        qim0Var2 = qim0Var;
        if ((i2 & 24576) != 0) {
            if (x340Var.i(zzq0Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                i5 = i;
                if (x340Var.e(i5)) {
                }
                i4 |= i10;
            } else {
                i5 = i;
            }
            i4 |= i10;
        } else {
            i5 = i;
        }
        z = false;
        if ((74899 & i4) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i4 & 1, z2)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i5 = 5;
                }
            } else {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                    i5 = 5;
                }
            }
            qim0 qim0Var5 = qim0Var2;
            x340Var.s();
            gdx gdxVarA2 = yla.s(x340Var).a();
            qim0 qim0VarN2 = anm1.N("messaging_snackbar_primary_button", uyn1.z(0.0f, 0.0f, 2, qim0Var5));
            cr31 cr31VarB2 = er31.b(0.0f);
            if ((i4 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            i7 = i4 & 14;
            if (i7 != 4) {
                z = true;
            } else {
                z = true;
            }
            z4 = z3 | z;
            objT = x340Var.T();
            if (z4) {
                objT = new u5a(iu30Var, button, (byte) 18);
                x340Var.s0(objT);
            } else {
                objT = new u5a(iu30Var, button, (byte) 18);
                x340Var.s0(objT);
            }
            int i12 = i5;
            y9j0.p(button, messageTemplate2, qim0VarN2, i12, gdxVarA2, zzq0Var, null, cr31VarB2, bjc0.a, (Function0) objT, x340Var, Button.$stable | i7 | (i4 & 112) | ((i4 >> 6) & 7168) | ((i4 << 3) & 458752));
            i6 = i12;
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            i6 = i5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lr90(this, button, messageTemplate, iu30Var, qim0Var3, zzq0Var, i6, i2, i3, (byte) 1);
        }
    }
}
