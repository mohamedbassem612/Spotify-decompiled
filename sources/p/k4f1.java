package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipAlignment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k4f1 {
    public final void a(zfj0 zfj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        zfj0 zfj0Var2;
        MessageTemplate messageTemplate;
        gex0 gex0Var;
        b0k b0kVar2;
        int i3;
        boolean z;
        MessageTemplate messageTemplate2;
        Button button;
        qim0 qim0Var;
        iu30 iu30Var2 = iu30Var;
        pl3 pl3Var = een.Z;
        pl3 pl3Var2 = een.N0;
        vfj0 vfj0Var = zfj0Var.b;
        Button button2 = vfj0Var.d;
        TooltipAlignment tooltipAlignment = vfj0Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-294110739);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(zfj0Var) : b0kVar3.i(zfj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(this) ? 256 : 128;
        }
        int i4 = i2;
        if (b0kVar3.Y(i4 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0Var2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarJ, cbx.a(b0kVar3).a.a.a(), er31.b(0.0f));
            TooltipAlignment tooltipAlignment2 = TooltipAlignment.HORIZONTAL;
            pl3 pl3Var3 = tooltipAlignment == tooltipAlignment2 ? pl3Var2 : pl3Var;
            gex0 gex0Var2 = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var2, pl3Var3, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            MessageTemplate messageTemplateI = p3d1.i(zfj0Var.a);
            AccessoryContent accessoryContent = vfj0Var.c;
            if (accessoryContent == null) {
                b0kVar3.i0(676056104);
                b0kVar3.r(false);
                gex0Var = gex0Var2;
                i3 = 0;
                b0kVar2 = b0kVar3;
                messageTemplate = messageTemplateI;
            } else {
                b0kVar3.i0(676056105);
                zov0 zov0Var = cbx.b(b0kVar3).g;
                zov0 zov0Var2 = cbx.b(b0kVar3).g;
                qim0 qim0VarN = anm1.N("messaging_tooltip_accessory_content_tag", qim0Var2);
                cvx cvxVar = cbx.b(b0kVar3).b;
                messageTemplate = messageTemplateI;
                gex0Var = gex0Var2;
                y9j0.a(accessoryContent, messageTemplate, uyn1.B(qim0VarN, 0.0f, 0.0f, 12.0f, 0.0f, 11), null, 64.0f, 16.0f, null, 0.0f, b0kVar3, AccessoryContent.$stable, 200);
                b0kVar2 = b0kVar3;
                i3 = 0;
                b0kVar2.r(false);
            }
            jw31 jw31VarA2 = ew31.a(gex0Var, tooltipAlignment == tooltipAlignment2 ? pl3Var2 : pl3Var, b0kVar2, i3);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0Var2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            float f = tooltipAlignment == tooltipAlignment2 ? 0.7f : 1.0f;
            pw31 pw31Var = pw31.a;
            qim0 qim0VarA = pw31Var.a(f, qim0Var2, false);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(6.0f, false, new g21(pl3Var, (byte) 28)), een.P0, b0kVar2, 0);
            TooltipAlignment tooltipAlignment3 = tooltipAlignment2;
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            Header header = vfj0Var.b;
            bjc0 bjc0Var = bjc0.a;
            if (header == null) {
                b0kVar2.i0(1795734142);
                b0kVar2.r(false);
                b0kVar3 = b0kVar2;
            } else {
                b0kVar2.i0(1795734143);
                b0k b0kVar4 = b0kVar2;
                y9j0.g(header, messageTemplate, anm1.N("messaging_tooltip_header_tag", qim0Var2), 5, bjc0Var, b0kVar4, Header.$stable);
                b0kVar3 = b0kVar4;
                b0kVar3.r(false);
            }
            b0kVar3.i0(-773347120);
            MessageText messageText = vfj0Var.a;
            MessageTemplate messageTemplate3 = messageTemplate;
            y9j0.c(0, 5, 0, 832, v9p1.P(v9p1.D(messageTemplate, b0kVar3), messageText.getTextColor()), messageTemplate3, messageText.getText(), null, b0kVar3, null, bjc0Var, anm1.N("messaging_tooltip_body_tag", qim0Var2), cbx.d(b0kVar3).j);
            b0kVar3.r(false);
            int i5 = 3670016;
            if (tooltipAlignment == TooltipAlignment.STACKED_VERTICAL) {
                b0kVar3.i0(-773330159);
                if (button2 == null) {
                    b0kVar3.i0(1796568848);
                    b0kVar3.r(false);
                    z = false;
                    messageTemplate2 = messageTemplate3;
                    button = button2;
                    qim0Var = qim0Var2;
                } else {
                    b0kVar3.i0(1796568849);
                    qim0Var = qim0Var2;
                    z = false;
                    messageTemplate2 = messageTemplate3;
                    button = button2;
                    b(button, messageTemplate2, iu30Var, null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), 0, b0kVar3, Button.$stable | ((i4 << 3) & 896) | ((i4 << 12) & 3670016), 40);
                    b0kVar3.r(false);
                }
                b0kVar3.r(z);
            } else {
                z = false;
                messageTemplate2 = messageTemplate3;
                button = button2;
                i4 = i4;
                i5 = 3670016;
                tooltipAlignment3 = tooltipAlignment3;
                qim0Var = qim0Var2;
                b0kVar3.i0(1796832535);
                b0kVar3.r(false);
            }
            b0kVar3.r(true);
            if (tooltipAlignment == tooltipAlignment3) {
                b0kVar3.i0(-787002569);
                if (button == null) {
                    b0kVar3.i0(1372724138);
                    b0kVar3.r(z);
                    iu30Var2 = iu30Var;
                } else {
                    b0kVar3.i0(1372724139);
                    qim0 qim0VarE4 = pw31Var.e(pw31Var.a(0.3f, qim0Var, z), pl3Var2);
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    cvx cvxVar4 = cbx.b(b0kVar3).b;
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    iu30Var2 = iu30Var;
                    b(button, messageTemplate2, iu30Var2, qim0VarE4, new zzq0(4.0f, 8.0f, 0.0f, 8.0f), 6, b0kVar3, Button.$stable | ((i4 << 3) & 896) | ((i4 << 12) & i5), 0);
                    b0kVar3.r(z);
                }
                b0kVar3.r(z);
            } else {
                iu30Var2 = iu30Var;
                b0kVar3.i0(1373320269);
                b0kVar3.r(z);
            }
            b0kVar3.r(true);
            boolean z3 = (i4 & 112) == 32 ? true : z;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new v5a(iu30Var2, null, (byte) 18);
                b0kVar3.s0(objT);
            }
            zfj0Var2 = zfj0Var;
            qxd0.s(zfj0Var2, iu30Var2, (vu30) objT, b0kVar3);
            b0kVar3.r(true);
        } else {
            zfj0Var2 = zfj0Var;
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(this, zfj0Var2, iu30Var2, i, (byte) 17);
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
        x340Var.k0(227912353);
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
                qim0 qim0VarN = anm1.N("messaging_tooltip_primary_button_tag", uyn1.z(0.0f, 0.0f, 2, qim0Var4));
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
                    objT = new u5a(iu30Var, button, (byte) 19);
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
                h311VarV.d = new lr90(this, button, messageTemplate, iu30Var, qim0Var3, zzq0Var, i6, i2, i3, (byte) 2);
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
            qim0 qim0VarN2 = anm1.N("messaging_tooltip_primary_button_tag", uyn1.z(0.0f, 0.0f, 2, qim0Var5));
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
                objT = new u5a(iu30Var, button, (byte) 19);
                x340Var.s0(objT);
            } else {
                objT = new u5a(iu30Var, button, (byte) 19);
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
            h311VarV.d = new lr90(this, button, messageTemplate, iu30Var, qim0Var3, zzq0Var, i6, i2, i3, (byte) 2);
        }
    }
}
