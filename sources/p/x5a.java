package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.Alignment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5a {
    public final void a(o8j0 o8j0Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        h311 h311VarV;
        q5a q5aVar;
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1664707435);
        int i2 = i | (x340Var.i(o8j0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 2048 : 1024);
        boolean z2 = true;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            g8j0 g8j0Var = o8j0Var.b;
            era eraVar = z ? een.P0 : een.Q0;
            if (!ButtonKt.hasVisibleLabel(g8j0Var.h) && !ButtonKt.hasVisibleLabel(g8j0Var.i)) {
                z2 = false;
            }
            if (g8j0Var.j != null) {
                x340Var.i0(688909187);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 20.0f;
            } else {
                x340Var.i0(689017687);
                x340Var.r(false);
                f = 0.0f;
            }
            float f2 = f;
            if (g8j0Var.k == null && z2) {
                x340Var.i0(689448525);
                x340Var.r(false);
                c4p1.a(apo.r(771538458, new q5a(this, o8j0Var, iu30Var, z, (byte) 2), x340Var), (qim0) null, j(o8j0Var, iu30Var), eraVar, 0.0f, (gdx) null, (lee1) null, 0.0f, "messaging_banner_scroll_content_tag", "messaging_banner_sticky_cta_tag", apo.r(-1465630301, new q5a(this, o8j0Var, iu30Var, z, (byte) 3), x340Var), false, 0, f2, x340Var, 905969670, 6, 6386);
            } else {
                x340Var.i0(689108331);
                c4p1.a(apo.r(583381791, new q5a(this, o8j0Var, iu30Var, z, (byte) 0), x340Var), (qim0) null, (List) null, (nl3) null, 0.0f, (gdx) null, (lee1) null, 0.0f, "messaging_banner_scroll_content_tag", (String) null, (vu30) null, false, 0, f2, x340Var, 100663302, 0, 7934);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    q5aVar = new q5a(this, o8j0Var, iu30Var, z, i, (byte) 1);
                }
            }
            h311VarV.d = q5aVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            q5aVar = new q5a(this, o8j0Var, iu30Var, z, i, (byte) 4);
            h311VarV.d = q5aVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:102:0x028d  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:120:0x031d  */
    /* JADX WARN: Code duplicated, block: B:121:0x032a  */
    /* JADX WARN: Code duplicated, block: B:123:0x033a  */
    /* JADX WARN: Code duplicated, block: B:125:0x034c  */
    /* JADX WARN: Code duplicated, block: B:129:0x035c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:134:0x037d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0380  */
    /* JADX WARN: Code duplicated, block: B:137:0x0384  */
    /* JADX WARN: Code duplicated, block: B:138:0x0387  */
    /* JADX WARN: Code duplicated, block: B:140:0x038a  */
    /* JADX WARN: Code duplicated, block: B:142:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:148:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:70:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:77:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x026e  */
    public final void b(o8j0 o8j0Var, iu30 iu30Var, boolean z, qim0 qim0Var, boolean z2, boolean z3, b0k b0kVar, int i, int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        boolean z6;
        qim0 qim0Var2;
        boolean z7;
        boolean z8;
        h311 h311VarV;
        boolean z9;
        g8j0 g8j0Var;
        MessageResponseToken messageResponseToken;
        qim0 qim0Var3;
        nl3 nl3Var;
        nl3 nl3Var2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        MessageResponseToken messageResponseToken2;
        HeaderContent headerContent;
        boolean z10;
        Signifier signifier;
        p3v p3vVar;
        float f;
        qim0 qim0Var4;
        EncoreFont fontOverride;
        lee1 lee1VarS;
        p3v p3vVar2;
        float f2;
        qim0 qim0Var5;
        a0e1 a0e1Var;
        int i7;
        x340 x340Var;
        EncoreFont fontOverride2;
        boolean z11;
        lee1 lee1VarS2;
        a0e1 a0e1Var2;
        nl3 nl3Var3;
        nl3 nl3Var4;
        qim0 qim0Var6;
        boolean z12;
        boolean z13;
        p3v p3vVar3;
        float f3;
        a0e1 a0e1Var3;
        int i8;
        nl3 nl3Var5 = een.Q0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-640851211);
        int i9 = (x340Var2.i(o8j0Var) ? 4 : 2) | i | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128);
        int i10 = i9 | 3072;
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                i10 |= x340Var2.h(z4) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    z5 = z3;
                    if (x340Var2.h(z5)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i10 |= i4;
                }
                if (x340Var2.g(this)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i6 = i10 | i5;
                if ((599187 & i6) != 599186) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (x340Var2.Y(i6 & 1, z6)) {
                    if (i11 != 0) {
                        z9 = true;
                    } else {
                        z9 = z4;
                    }
                    if (i3 != 0) {
                        z8 = true;
                    } else {
                        z8 = z5;
                    }
                    g8j0Var = o8j0Var.b;
                    messageResponseToken = o8j0Var.a;
                    qim0Var3 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    d36 d36Var = new d36(8.0f, false, new g21(een.Z, (byte) 28));
                    nl3Var = een.P0;
                    if (z) {
                        nl3Var2 = nl3Var;
                    } else {
                        nl3Var2 = null;
                    }
                    if (nl3Var2 == null) {
                        nl3Var2 = nl3Var5;
                    }
                    mbhVarA = jbh.a(d36Var, nl3Var2, x340Var2, 0);
                    iHashCode = Long.hashCode(x340Var2.T);
                    xos0VarM = x340Var2.m();
                    qim0VarE = zr7.E(x340Var2, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var2.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    messageResponseToken2 = messageResponseToken;
                    headerContent = g8j0Var.c;
                    MessageText messageText = g8j0Var.g;
                    MessageText messageText2 = g8j0Var.f;
                    if (headerContent != null) {
                        x340Var2.i0(-539473595);
                        MessageTemplate template = messageResponseToken2.getMessageData().getFormat().getTemplate();
                        float f4 = cbx.b(x340Var2).b.b;
                        p3vVar3 = new p3v(cbx.b(x340Var2).b.b);
                        if (z) {
                            p3vVar3 = null;
                        }
                        if (p3vVar3 != null) {
                            f3 = p3vVar3.a;
                        } else {
                            f3 = 0.0f;
                        }
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        qim0 qim0VarB = uyn1.B(qim0Var3, f3, 0.0f, f4, 8.0f, 2);
                        a0e1Var3 = new a0e1(3);
                        if (z) {
                            a0e1Var3 = null;
                        }
                        if (a0e1Var3 != null) {
                            i8 = a0e1Var3.a;
                        } else {
                            i8 = 5;
                        }
                        z10 = false;
                        messageResponseToken2 = messageResponseToken2;
                        y9j0.h(headerContent, template, qim0VarB, i8, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                        x340Var2.r(false);
                        qim0Var4 = qim0Var3;
                    } else {
                        z10 = false;
                        x340Var2.i0(-538842590);
                        signifier = g8j0Var.b;
                        if (signifier == null) {
                            x340Var2.i0(-538842591);
                            x340Var2.r(false);
                            qim0Var4 = qim0Var3;
                        } else {
                            x340Var2.i0(-538842590);
                            MessageTemplate template2 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                            float f5 = cbx.b(x340Var2).b.b;
                            p3vVar = new p3v(cbx.b(x340Var2).b.b);
                            if (z) {
                                p3vVar = null;
                            }
                            if (p3vVar != null) {
                                f = p3vVar.a;
                            } else {
                                f = 0.0f;
                            }
                            cvx cvxVar3 = cbx.b(x340Var2).b;
                            qim0Var4 = qim0Var3;
                            y9j0.o(signifier, template2, anm1.N("messaging_banner_signifier_tag", uyn1.B(qim0Var3, f, 0.0f, f5, 8.0f, 2)), 0, 0.0f, 0L, null, null, x340Var2, Signifier.$stable, 248);
                            x340Var2 = x340Var2;
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                    }
                    String text = messageText2.getText();
                    MessageTemplate messageTemplateI = p3d1.i(messageResponseToken2);
                    long jP = v9p1.P(v9p1.F(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var2), messageText2.getTextColor());
                    fontOverride = messageText2.getFontOverride();
                    if (fontOverride == null) {
                        x340Var2.i0(-537952209);
                        x340Var2.r(z10);
                        lee1VarS = null;
                    } else {
                        x340Var2.i0(-987184622);
                        lee1VarS = y9j0.s(fontOverride, x340Var2);
                        x340Var2.r(z10);
                    }
                    if (lee1VarS == null) {
                        x340Var2.i0(-987183315);
                        lee1VarS = cbx.d(x340Var2).h;
                    } else {
                        x340Var2.i0(-987185454);
                    }
                    x340Var2.r(z10);
                    float f6 = cbx.b(x340Var2).b.b;
                    p3vVar2 = new p3v(cbx.b(x340Var2).b.b);
                    if (z) {
                        p3vVar2 = null;
                    }
                    if (p3vVar2 != null) {
                        f2 = p3vVar2.a;
                    } else {
                        f2 = 0.0f;
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarN = anm1.N("messaging_banner_headline_tag", uyn1.B(qim0Var5, f2, 0.0f, f6, 0.0f, 10));
                    a0e1Var = new a0e1(3);
                    if (z) {
                        a0e1Var = null;
                    }
                    if (a0e1Var != null) {
                        i7 = a0e1Var.a;
                    } else {
                        i7 = 5;
                    }
                    lee1 lee1Var = lee1VarS;
                    x340Var = x340Var2;
                    bjc0 bjc0Var = bjc0.a;
                    y9j0.j(0, i7, 0, 832, jP, messageTemplateI, text, null, x340Var, null, bjc0Var, qim0VarN, lee1Var);
                    String text2 = messageText.getText();
                    MessageTemplate messageTemplateI2 = p3d1.i(messageResponseToken2);
                    long jP2 = v9p1.P(v9p1.D(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var), messageText.getTextColor());
                    fontOverride2 = messageText.getFontOverride();
                    if (fontOverride2 == null) {
                        x340Var.i0(-537152657);
                        z11 = false;
                        x340Var.r(false);
                        lee1VarS2 = null;
                    } else {
                        z11 = false;
                        x340Var.i0(-987158830);
                        lee1VarS2 = y9j0.s(fontOverride2, x340Var);
                        x340Var.r(false);
                    }
                    if (lee1VarS2 == null) {
                        x340Var.i0(-987157528);
                        lee1VarS2 = cbx.d(x340Var).j;
                    } else {
                        x340Var.i0(-987159543);
                    }
                    x340Var.r(z11);
                    lee1 lee1Var2 = lee1VarS2;
                    a0e1Var2 = new a0e1(3);
                    if (z) {
                        a0e1Var2 = null;
                    }
                    y9j0.c(0, a0e1Var2 != null ? a0e1Var2.a : 5, 0, 832, jP2, messageTemplateI2, text2, null, x340Var, null, bjc0Var, anm1.N("messaging_banner_body_tag", qim0Var5), lee1Var2);
                    x340Var2 = x340Var;
                    if (z) {
                        nl3Var3 = null;
                    }
                    if (nl3Var3 == null) {
                        nl3Var4 = nl3Var5;
                    } else {
                        nl3Var4 = nl3Var3;
                    }
                    if (z9 != 0) {
                        nl3Var3 = nl3Var;
                        nl3Var3 = nl3Var;
                        x340Var2.i0(-987145976);
                        c4p1.b(j(o8j0Var, iu30Var), qim0Var5, nl3Var4, 0.0f, (gdx) null, (lee1) null, 0, x340Var2, 48, 120);
                        qim0Var6 = qim0Var5;
                        x340Var2 = x340Var2;
                        z12 = false;
                    } else {
                        nl3Var3 = nl3Var;
                        nl3Var3 = nl3Var;
                        qim0Var6 = qim0Var5;
                        z12 = false;
                        x340Var2.i0(-536684029);
                    }
                    x340Var2.r(z12);
                    if (z8) {
                        x340Var2.i0(-987142666);
                        c(o8j0Var, iu30Var, z, x340Var2, (i6 & 14) | 8 | (i6 & 112) | (i6 & 896) | ((i6 >> 9) & 7168));
                        z13 = false;
                    } else {
                        z13 = false;
                        x340Var2.i0(-536598717);
                    }
                    x340Var2.r(z13);
                    x340Var2.r(true);
                    z7 = z9;
                    qim0Var2 = qim0Var6;
                } else {
                    x340Var2.b0();
                    qim0Var2 = qim0Var;
                    z7 = z4;
                    z8 = z5;
                }
                h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new r5a(this, o8j0Var, iu30Var, z, qim0Var2, z7, z8, i, i2);
                }
            }
            i10 |= 196608;
            z5 = z3;
            if (x340Var2.g(this)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i10 | i5;
            if ((599187 & i6) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (x340Var2.Y(i6 & 1, z6)) {
                if (i11 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i3 != 0) {
                    z8 = true;
                } else {
                    z8 = z5;
                }
                g8j0Var = o8j0Var.b;
                messageResponseToken = o8j0Var.a;
                qim0Var3 = nim0.a;
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                d36 d36Var2 = new d36(8.0f, false, new g21(een.Z, (byte) 28));
                nl3Var = een.P0;
                if (z) {
                    nl3Var2 = nl3Var;
                } else {
                    nl3Var2 = null;
                }
                if (nl3Var2 == null) {
                    nl3Var2 = nl3Var5;
                }
                mbhVarA = jbh.a(d36Var2, nl3Var2, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF2);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                messageResponseToken2 = messageResponseToken;
                headerContent = g8j0Var.c;
                MessageText messageText3 = g8j0Var.g;
                MessageText messageText4 = g8j0Var.f;
                if (headerContent != null) {
                    x340Var2.i0(-539473595);
                    MessageTemplate template3 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                    float f7 = cbx.b(x340Var2).b.b;
                    p3vVar3 = new p3v(cbx.b(x340Var2).b.b);
                    if (z) {
                        p3vVar3 = null;
                    }
                    if (p3vVar3 != null) {
                        f3 = p3vVar3.a;
                    } else {
                        f3 = 0.0f;
                    }
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    qim0 qim0VarB2 = uyn1.B(qim0Var3, f3, 0.0f, f7, 8.0f, 2);
                    a0e1Var3 = new a0e1(3);
                    if (z) {
                        a0e1Var3 = null;
                    }
                    if (a0e1Var3 != null) {
                        i8 = a0e1Var3.a;
                    } else {
                        i8 = 5;
                    }
                    z10 = false;
                    messageResponseToken2 = messageResponseToken2;
                    y9j0.h(headerContent, template3, qim0VarB2, i8, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                    x340Var2.r(false);
                    qim0Var4 = qim0Var3;
                } else {
                    z10 = false;
                    x340Var2.i0(-538842590);
                    signifier = g8j0Var.b;
                    if (signifier == null) {
                        x340Var2.i0(-538842591);
                        x340Var2.r(false);
                        qim0Var4 = qim0Var3;
                    } else {
                        x340Var2.i0(-538842590);
                        MessageTemplate template4 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                        float f8 = cbx.b(x340Var2).b.b;
                        p3vVar = new p3v(cbx.b(x340Var2).b.b);
                        if (z) {
                            p3vVar = null;
                        }
                        if (p3vVar != null) {
                            f = p3vVar.a;
                        } else {
                            f = 0.0f;
                        }
                        cvx cvxVar6 = cbx.b(x340Var2).b;
                        qim0Var4 = qim0Var3;
                        y9j0.o(signifier, template4, anm1.N("messaging_banner_signifier_tag", uyn1.B(qim0Var3, f, 0.0f, f8, 8.0f, 2)), 0, 0.0f, 0L, null, null, x340Var2, Signifier.$stable, 248);
                        x340Var2 = x340Var2;
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                }
                String text3 = messageText4.getText();
                MessageTemplate messageTemplateI3 = p3d1.i(messageResponseToken2);
                long jP3 = v9p1.P(v9p1.F(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var2), messageText4.getTextColor());
                fontOverride = messageText4.getFontOverride();
                if (fontOverride == null) {
                    x340Var2.i0(-537952209);
                    x340Var2.r(z10);
                    lee1VarS = null;
                } else {
                    x340Var2.i0(-987184622);
                    lee1VarS = y9j0.s(fontOverride, x340Var2);
                    x340Var2.r(z10);
                }
                if (lee1VarS == null) {
                    x340Var2.i0(-987183315);
                    lee1VarS = cbx.d(x340Var2).h;
                } else {
                    x340Var2.i0(-987185454);
                }
                x340Var2.r(z10);
                float f9 = cbx.b(x340Var2).b.b;
                p3vVar2 = new p3v(cbx.b(x340Var2).b.b);
                if (z) {
                    p3vVar2 = null;
                }
                if (p3vVar2 != null) {
                    f2 = p3vVar2.a;
                } else {
                    f2 = 0.0f;
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarN2 = anm1.N("messaging_banner_headline_tag", uyn1.B(qim0Var5, f2, 0.0f, f9, 0.0f, 10));
                a0e1Var = new a0e1(3);
                if (z) {
                    a0e1Var = null;
                }
                if (a0e1Var != null) {
                    i7 = a0e1Var.a;
                } else {
                    i7 = 5;
                }
                lee1 lee1Var3 = lee1VarS;
                x340Var = x340Var2;
                bjc0 bjc0Var2 = bjc0.a;
                y9j0.j(0, i7, 0, 832, jP3, messageTemplateI3, text3, null, x340Var, null, bjc0Var2, qim0VarN2, lee1Var3);
                String text4 = messageText3.getText();
                MessageTemplate messageTemplateI4 = p3d1.i(messageResponseToken2);
                long jP4 = v9p1.P(v9p1.D(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var), messageText3.getTextColor());
                fontOverride2 = messageText3.getFontOverride();
                if (fontOverride2 == null) {
                    x340Var.i0(-537152657);
                    z11 = false;
                    x340Var.r(false);
                    lee1VarS2 = null;
                } else {
                    z11 = false;
                    x340Var.i0(-987158830);
                    lee1VarS2 = y9j0.s(fontOverride2, x340Var);
                    x340Var.r(false);
                }
                if (lee1VarS2 == null) {
                    x340Var.i0(-987157528);
                    lee1VarS2 = cbx.d(x340Var).j;
                } else {
                    x340Var.i0(-987159543);
                }
                x340Var.r(z11);
                lee1 lee1Var4 = lee1VarS2;
                a0e1Var2 = new a0e1(3);
                if (z) {
                    a0e1Var2 = null;
                }
                y9j0.c(0, a0e1Var2 != null ? a0e1Var2.a : 5, 0, 832, jP4, messageTemplateI4, text4, null, x340Var, null, bjc0Var2, anm1.N("messaging_banner_body_tag", qim0Var5), lee1Var4);
                x340Var2 = x340Var;
                if (z) {
                    nl3Var3 = null;
                }
                if (nl3Var3 == null) {
                    nl3Var4 = nl3Var5;
                } else {
                    nl3Var4 = nl3Var3;
                }
                if (z9 != 0) {
                    nl3Var3 = nl3Var;
                    nl3Var3 = nl3Var;
                    x340Var2.i0(-987145976);
                    c4p1.b(j(o8j0Var, iu30Var), qim0Var5, nl3Var4, 0.0f, (gdx) null, (lee1) null, 0, x340Var2, 48, 120);
                    qim0Var6 = qim0Var5;
                    x340Var2 = x340Var2;
                    z12 = false;
                } else {
                    nl3Var3 = nl3Var;
                    nl3Var3 = nl3Var;
                    qim0Var6 = qim0Var5;
                    z12 = false;
                    x340Var2.i0(-536684029);
                }
                x340Var2.r(z12);
                if (z8) {
                    x340Var2.i0(-987142666);
                    c(o8j0Var, iu30Var, z, x340Var2, (i6 & 14) | 8 | (i6 & 112) | (i6 & 896) | ((i6 >> 9) & 7168));
                    z13 = false;
                } else {
                    z13 = false;
                    x340Var2.i0(-536598717);
                }
                x340Var2.r(z13);
                x340Var2.r(true);
                z7 = z9;
                qim0Var2 = qim0Var6;
            } else {
                x340Var2.b0();
                qim0Var2 = qim0Var;
                z7 = z4;
                z8 = z5;
            }
            h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new r5a(this, o8j0Var, iu30Var, z, qim0Var2, z7, z8, i, i2);
            }
        }
        i10 = i9 | 27648;
        z4 = z2;
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                z5 = z3;
                if (x340Var2.h(z5)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i10 |= i4;
            }
            if (x340Var2.g(this)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i10 | i5;
            if ((599187 & i6) != 599186) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (x340Var2.Y(i6 & 1, z6)) {
                if (i11 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i3 != 0) {
                    z8 = true;
                } else {
                    z8 = z5;
                }
                g8j0Var = o8j0Var.b;
                messageResponseToken = o8j0Var.a;
                qim0Var3 = nim0.a;
                qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                d36 d36Var3 = new d36(8.0f, false, new g21(een.Z, (byte) 28));
                nl3Var = een.P0;
                if (z) {
                    nl3Var2 = nl3Var;
                } else {
                    nl3Var2 = null;
                }
                if (nl3Var2 == null) {
                    nl3Var2 = nl3Var5;
                }
                mbhVarA = jbh.a(d36Var3, nl3Var2, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF3);
                hzj.A.getClass();
                if (x340Var2.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                messageResponseToken2 = messageResponseToken;
                headerContent = g8j0Var.c;
                MessageText messageText5 = g8j0Var.g;
                MessageText messageText6 = g8j0Var.f;
                if (headerContent != null) {
                    x340Var2.i0(-539473595);
                    MessageTemplate template5 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                    float f10 = cbx.b(x340Var2).b.b;
                    p3vVar3 = new p3v(cbx.b(x340Var2).b.b);
                    if (z) {
                        p3vVar3 = null;
                    }
                    if (p3vVar3 != null) {
                        f3 = p3vVar3.a;
                    } else {
                        f3 = 0.0f;
                    }
                    cvx cvxVar8 = cbx.b(x340Var2).b;
                    qim0 qim0VarB3 = uyn1.B(qim0Var3, f3, 0.0f, f10, 8.0f, 2);
                    a0e1Var3 = new a0e1(3);
                    if (z) {
                        a0e1Var3 = null;
                    }
                    if (a0e1Var3 != null) {
                        i8 = a0e1Var3.a;
                    } else {
                        i8 = 5;
                    }
                    z10 = false;
                    messageResponseToken2 = messageResponseToken2;
                    y9j0.h(headerContent, template5, qim0VarB3, i8, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                    x340Var2.r(false);
                    qim0Var4 = qim0Var3;
                } else {
                    z10 = false;
                    x340Var2.i0(-538842590);
                    signifier = g8j0Var.b;
                    if (signifier == null) {
                        x340Var2.i0(-538842591);
                        x340Var2.r(false);
                        qim0Var4 = qim0Var3;
                    } else {
                        x340Var2.i0(-538842590);
                        MessageTemplate template6 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                        float f11 = cbx.b(x340Var2).b.b;
                        p3vVar = new p3v(cbx.b(x340Var2).b.b);
                        if (z) {
                            p3vVar = null;
                        }
                        if (p3vVar != null) {
                            f = p3vVar.a;
                        } else {
                            f = 0.0f;
                        }
                        cvx cvxVar9 = cbx.b(x340Var2).b;
                        qim0Var4 = qim0Var3;
                        y9j0.o(signifier, template6, anm1.N("messaging_banner_signifier_tag", uyn1.B(qim0Var3, f, 0.0f, f11, 8.0f, 2)), 0, 0.0f, 0L, null, null, x340Var2, Signifier.$stable, 248);
                        x340Var2 = x340Var2;
                        x340Var2.r(false);
                    }
                    x340Var2.r(false);
                }
                String text5 = messageText6.getText();
                MessageTemplate messageTemplateI5 = p3d1.i(messageResponseToken2);
                long jP5 = v9p1.P(v9p1.F(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var2), messageText6.getTextColor());
                fontOverride = messageText6.getFontOverride();
                if (fontOverride == null) {
                    x340Var2.i0(-537952209);
                    x340Var2.r(z10);
                    lee1VarS = null;
                } else {
                    x340Var2.i0(-987184622);
                    lee1VarS = y9j0.s(fontOverride, x340Var2);
                    x340Var2.r(z10);
                }
                if (lee1VarS == null) {
                    x340Var2.i0(-987183315);
                    lee1VarS = cbx.d(x340Var2).h;
                } else {
                    x340Var2.i0(-987185454);
                }
                x340Var2.r(z10);
                float f12 = cbx.b(x340Var2).b.b;
                p3vVar2 = new p3v(cbx.b(x340Var2).b.b);
                if (z) {
                    p3vVar2 = null;
                }
                if (p3vVar2 != null) {
                    f2 = p3vVar2.a;
                } else {
                    f2 = 0.0f;
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarN3 = anm1.N("messaging_banner_headline_tag", uyn1.B(qim0Var5, f2, 0.0f, f12, 0.0f, 10));
                a0e1Var = new a0e1(3);
                if (z) {
                    a0e1Var = null;
                }
                if (a0e1Var != null) {
                    i7 = a0e1Var.a;
                } else {
                    i7 = 5;
                }
                lee1 lee1Var5 = lee1VarS;
                x340Var = x340Var2;
                bjc0 bjc0Var3 = bjc0.a;
                y9j0.j(0, i7, 0, 832, jP5, messageTemplateI5, text5, null, x340Var, null, bjc0Var3, qim0VarN3, lee1Var5);
                String text6 = messageText5.getText();
                MessageTemplate messageTemplateI6 = p3d1.i(messageResponseToken2);
                long jP6 = v9p1.P(v9p1.D(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var), messageText5.getTextColor());
                fontOverride2 = messageText5.getFontOverride();
                if (fontOverride2 == null) {
                    x340Var.i0(-537152657);
                    z11 = false;
                    x340Var.r(false);
                    lee1VarS2 = null;
                } else {
                    z11 = false;
                    x340Var.i0(-987158830);
                    lee1VarS2 = y9j0.s(fontOverride2, x340Var);
                    x340Var.r(false);
                }
                if (lee1VarS2 == null) {
                    x340Var.i0(-987157528);
                    lee1VarS2 = cbx.d(x340Var).j;
                } else {
                    x340Var.i0(-987159543);
                }
                x340Var.r(z11);
                lee1 lee1Var6 = lee1VarS2;
                a0e1Var2 = new a0e1(3);
                if (z) {
                    a0e1Var2 = null;
                }
                y9j0.c(0, a0e1Var2 != null ? a0e1Var2.a : 5, 0, 832, jP6, messageTemplateI6, text6, null, x340Var, null, bjc0Var3, anm1.N("messaging_banner_body_tag", qim0Var5), lee1Var6);
                x340Var2 = x340Var;
                if (z) {
                    nl3Var3 = null;
                }
                if (nl3Var3 == null) {
                    nl3Var4 = nl3Var5;
                } else {
                    nl3Var4 = nl3Var3;
                }
                if (z9 != 0) {
                    nl3Var3 = nl3Var;
                    nl3Var3 = nl3Var;
                    x340Var2.i0(-987145976);
                    c4p1.b(j(o8j0Var, iu30Var), qim0Var5, nl3Var4, 0.0f, (gdx) null, (lee1) null, 0, x340Var2, 48, 120);
                    qim0Var6 = qim0Var5;
                    x340Var2 = x340Var2;
                    z12 = false;
                } else {
                    nl3Var3 = nl3Var;
                    nl3Var3 = nl3Var;
                    qim0Var6 = qim0Var5;
                    z12 = false;
                    x340Var2.i0(-536684029);
                }
                x340Var2.r(z12);
                if (z8) {
                    x340Var2.i0(-987142666);
                    c(o8j0Var, iu30Var, z, x340Var2, (i6 & 14) | 8 | (i6 & 112) | (i6 & 896) | ((i6 >> 9) & 7168));
                    z13 = false;
                } else {
                    z13 = false;
                    x340Var2.i0(-536598717);
                }
                x340Var2.r(z13);
                x340Var2.r(true);
                z7 = z9;
                qim0Var2 = qim0Var6;
            } else {
                x340Var2.b0();
                qim0Var2 = qim0Var;
                z7 = z4;
                z8 = z5;
            }
            h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new r5a(this, o8j0Var, iu30Var, z, qim0Var2, z7, z8, i, i2);
            }
        }
        i10 |= 196608;
        z5 = z3;
        if (x340Var2.g(this)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        i6 = i10 | i5;
        if ((599187 & i6) != 599186) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (x340Var2.Y(i6 & 1, z6)) {
            if (i11 != 0) {
                z9 = true;
            } else {
                z9 = z4;
            }
            if (i3 != 0) {
                z8 = true;
            } else {
                z8 = z5;
            }
            g8j0Var = o8j0Var.b;
            messageResponseToken = o8j0Var.a;
            qim0Var3 = nim0.a;
            qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar10 = cbx.b(x340Var2).b;
            d36 d36Var4 = new d36(8.0f, false, new g21(een.Z, (byte) 28));
            nl3Var = een.P0;
            if (z) {
                nl3Var2 = nl3Var;
            } else {
                nl3Var2 = null;
            }
            if (nl3Var2 == null) {
                nl3Var2 = nl3Var5;
            }
            mbhVarA = jbh.a(d36Var4, nl3Var2, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF4);
            hzj.A.getClass();
            if (x340Var2.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            messageResponseToken2 = messageResponseToken;
            headerContent = g8j0Var.c;
            MessageText messageText7 = g8j0Var.g;
            MessageText messageText8 = g8j0Var.f;
            if (headerContent != null) {
                x340Var2.i0(-539473595);
                MessageTemplate template7 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                float f13 = cbx.b(x340Var2).b.b;
                p3vVar3 = new p3v(cbx.b(x340Var2).b.b);
                if (z) {
                    p3vVar3 = null;
                }
                if (p3vVar3 != null) {
                    f3 = p3vVar3.a;
                } else {
                    f3 = 0.0f;
                }
                cvx cvxVar11 = cbx.b(x340Var2).b;
                qim0 qim0VarB4 = uyn1.B(qim0Var3, f3, 0.0f, f13, 8.0f, 2);
                a0e1Var3 = new a0e1(3);
                if (z) {
                    a0e1Var3 = null;
                }
                if (a0e1Var3 != null) {
                    i8 = a0e1Var3.a;
                } else {
                    i8 = 5;
                }
                z10 = false;
                messageResponseToken2 = messageResponseToken2;
                y9j0.h(headerContent, template7, qim0VarB4, i8, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                x340Var2.r(false);
                qim0Var4 = qim0Var3;
            } else {
                z10 = false;
                x340Var2.i0(-538842590);
                signifier = g8j0Var.b;
                if (signifier == null) {
                    x340Var2.i0(-538842591);
                    x340Var2.r(false);
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var2.i0(-538842590);
                    MessageTemplate template8 = messageResponseToken2.getMessageData().getFormat().getTemplate();
                    float f14 = cbx.b(x340Var2).b.b;
                    p3vVar = new p3v(cbx.b(x340Var2).b.b);
                    if (z) {
                        p3vVar = null;
                    }
                    if (p3vVar != null) {
                        f = p3vVar.a;
                    } else {
                        f = 0.0f;
                    }
                    cvx cvxVar12 = cbx.b(x340Var2).b;
                    qim0Var4 = qim0Var3;
                    y9j0.o(signifier, template8, anm1.N("messaging_banner_signifier_tag", uyn1.B(qim0Var3, f, 0.0f, f14, 8.0f, 2)), 0, 0.0f, 0L, null, null, x340Var2, Signifier.$stable, 248);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                }
                x340Var2.r(false);
            }
            String text7 = messageText8.getText();
            MessageTemplate messageTemplateI7 = p3d1.i(messageResponseToken2);
            long jP7 = v9p1.P(v9p1.F(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var2), messageText8.getTextColor());
            fontOverride = messageText8.getFontOverride();
            if (fontOverride == null) {
                x340Var2.i0(-537952209);
                x340Var2.r(z10);
                lee1VarS = null;
            } else {
                x340Var2.i0(-987184622);
                lee1VarS = y9j0.s(fontOverride, x340Var2);
                x340Var2.r(z10);
            }
            if (lee1VarS == null) {
                x340Var2.i0(-987183315);
                lee1VarS = cbx.d(x340Var2).h;
            } else {
                x340Var2.i0(-987185454);
            }
            x340Var2.r(z10);
            float f15 = cbx.b(x340Var2).b.b;
            p3vVar2 = new p3v(cbx.b(x340Var2).b.b);
            if (z) {
                p3vVar2 = null;
            }
            if (p3vVar2 != null) {
                f2 = p3vVar2.a;
            } else {
                f2 = 0.0f;
            }
            qim0Var5 = qim0Var4;
            qim0 qim0VarN4 = anm1.N("messaging_banner_headline_tag", uyn1.B(qim0Var5, f2, 0.0f, f15, 0.0f, 10));
            a0e1Var = new a0e1(3);
            if (z) {
                a0e1Var = null;
            }
            if (a0e1Var != null) {
                i7 = a0e1Var.a;
            } else {
                i7 = 5;
            }
            lee1 lee1Var7 = lee1VarS;
            x340Var = x340Var2;
            bjc0 bjc0Var4 = bjc0.a;
            y9j0.j(0, i7, 0, 832, jP7, messageTemplateI7, text7, null, x340Var, null, bjc0Var4, qim0VarN4, lee1Var7);
            String text8 = messageText7.getText();
            MessageTemplate messageTemplateI8 = p3d1.i(messageResponseToken2);
            long jP8 = v9p1.P(v9p1.D(messageResponseToken2.getMessageData().getFormat().getTemplate(), x340Var), messageText7.getTextColor());
            fontOverride2 = messageText7.getFontOverride();
            if (fontOverride2 == null) {
                x340Var.i0(-537152657);
                z11 = false;
                x340Var.r(false);
                lee1VarS2 = null;
            } else {
                z11 = false;
                x340Var.i0(-987158830);
                lee1VarS2 = y9j0.s(fontOverride2, x340Var);
                x340Var.r(false);
            }
            if (lee1VarS2 == null) {
                x340Var.i0(-987157528);
                lee1VarS2 = cbx.d(x340Var).j;
            } else {
                x340Var.i0(-987159543);
            }
            x340Var.r(z11);
            lee1 lee1Var8 = lee1VarS2;
            a0e1Var2 = new a0e1(3);
            if (z) {
                a0e1Var2 = null;
            }
            y9j0.c(0, a0e1Var2 != null ? a0e1Var2.a : 5, 0, 832, jP8, messageTemplateI8, text8, null, x340Var, null, bjc0Var4, anm1.N("messaging_banner_body_tag", qim0Var5), lee1Var8);
            x340Var2 = x340Var;
            if (z) {
                nl3Var3 = null;
            }
            if (nl3Var3 == null) {
                nl3Var4 = nl3Var5;
            } else {
                nl3Var4 = nl3Var3;
            }
            if (z9 != 0) {
                nl3Var3 = nl3Var;
                nl3Var3 = nl3Var;
                x340Var2.i0(-987145976);
                c4p1.b(j(o8j0Var, iu30Var), qim0Var5, nl3Var4, 0.0f, (gdx) null, (lee1) null, 0, x340Var2, 48, 120);
                qim0Var6 = qim0Var5;
                x340Var2 = x340Var2;
                z12 = false;
            } else {
                nl3Var3 = nl3Var;
                nl3Var3 = nl3Var;
                qim0Var6 = qim0Var5;
                z12 = false;
                x340Var2.i0(-536684029);
            }
            x340Var2.r(z12);
            if (z8) {
                x340Var2.i0(-987142666);
                c(o8j0Var, iu30Var, z, x340Var2, (i6 & 14) | 8 | (i6 & 112) | (i6 & 896) | ((i6 >> 9) & 7168));
                z13 = false;
            } else {
                z13 = false;
                x340Var2.i0(-536598717);
            }
            x340Var2.r(z13);
            x340Var2.r(true);
            z7 = z9;
            qim0Var2 = qim0Var6;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
            z7 = z4;
            z8 = z5;
        }
        h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new r5a(this, o8j0Var, iu30Var, z, qim0Var2, z7, z8, i, i2);
        }
    }

    public final void c(o8j0 o8j0Var, iu30 iu30Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2104520855);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Disclaimer disclaimer = o8j0Var.b.l;
            if (disclaimer == null) {
                x340Var.i0(-2142975765);
                x340Var.r(false);
            } else {
                x340Var.i0(-2142975764);
                MessageTemplate messageTemplateI = p3d1.i(o8j0Var.a);
                a0e1 a0e1Var = new a0e1(3);
                if (z) {
                    a0e1Var = null;
                }
                int i3 = a0e1Var != null ? a0e1Var.a : 5;
                boolean zI = x340Var.i(disclaimer) | ((i2 & 112) == 32);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new s5a(disclaimer, iu30Var, b);
                    x340Var.s0(objT);
                }
                y9j0.f(disclaimer, messageTemplateI, null, null, bjc0.a, 0, i3, null, (Function0) objT, null, x340Var, Disclaimer.$stable, 684);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(this, o8j0Var, iu30Var, z, i, (byte) 6);
        }
    }

    public final void d(o8j0 o8j0Var, iu30 iu30Var, qim0 qim0Var, h8a h8aVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1484307517);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 8211) != 8210)) {
            e(o8j0Var, iu30Var, x340Var, ((i2 >> 6) & 896) | (i2 & 14) | 8 | (i2 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t5a(this, o8j0Var, iu30Var, qim0Var, h8aVar, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r28v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    public final void e(o8j0 o8j0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x5a x5aVar;
        Object obj;
        qim0 qim0Var;
        Function0 function0;
        llj lljVar;
        vu30 vu30Var;
        String str;
        m4c m4cVar;
        ?? r1;
        char c;
        m4c m4cVar2;
        gbx gbxVar;
        boolean z;
        Object obj2;
        boolean z2;
        o8j0 o8j0Var2 = o8j0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(459855564);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var2) : x340Var.i(o8j0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            x5aVar = this;
            i2 |= x340Var.g(x5aVar) ? 256 : 128;
        } else {
            x5aVar = this;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            g8j0 g8j0Var = o8j0Var2.b;
            AccessoryContent accessoryContent = g8j0Var.d;
            MessageResponseToken messageResponseToken = o8j0Var2.a;
            Object objT = x340Var.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                if (g8j0Var.a == Alignment.LEADING || (accessoryContent != null && accessoryContent.isValid())) {
                    obj = objT;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                x340Var.s0(boolValueOf);
                obj = boolValueOf;
            }
            obj = objT;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            String strO0 = cwl1.o0(x340Var, 2131953954);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z3) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar4);
            nko1.F(x340Var);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            if (accessoryContent == null) {
                x340Var.i0(447988257);
                x340Var.r(false);
                r1 = 0;
                lljVar = lljVar4;
                vu30Var = vu30Var2;
                str = strO0;
                m4cVar = m4cVar3;
                qim0Var = qim0Var2;
                function0 = function1;
            } else {
                x340Var.i0(447988258);
                MessageTemplate template = messageResponseToken.getMessageData().getFormat().getTemplate();
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarN = anm1.N("messaging_banner_accessory_content_tag", uyn1.B(qim0Var2, 0.0f, 0.0f, 12.0f, 0.0f, 11));
                zov0 zov0Var = cbx.b(x340Var).g;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                cua cuaVar = cbx.b(x340Var).f;
                qim0Var = qim0Var2;
                function0 = function1;
                lljVar = lljVar4;
                vu30Var = vu30Var2;
                str = strO0;
                m4cVar = m4cVar3;
                r1 = 0;
                y9j0.a(accessoryContent, template, qim0VarN, null, 64.0f, 24.0f, null, 4.0f, x340Var, AccessoryContent.$stable, 72);
                x340Var.r(false);
            }
            wnb0 wnb0Var = new wnb0(1.0f, true);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r1);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            Button button = g8j0Var.k;
            if (button == null) {
                x340Var.i0(1734105012);
                x340Var.r((boolean) r1);
                m4cVar2 = m4cVar;
                c = ' ';
                gbxVar = null;
            } else {
                x340Var.i0(1734105013);
                c = ' ';
                int i3 = (x340Var.i(button) ? 1 : 0) | ((i2 & 112) == 32 ? 1 : r1);
                Object objT2 = x340Var.T();
                m4cVar2 = m4cVar;
                Object obj3 = objT2;
                if (i3 != 0 || objT2 == m4cVar2) {
                    u5a u5aVar = new u5a(iu30Var, button, r1);
                    x340Var.s0(u5aVar);
                    obj3 = u5aVar;
                }
                gbx gbxVar2 = new gbx(new y50(str), (Function0) obj3);
                x340Var.r((boolean) r1);
                gbxVar = gbxVar2;
            }
            vzq0.a.getClass();
            ?? r28 = r1;
            o8j0Var2 = o8j0Var;
            m4c m4cVar4 = m4cVar2;
            cwl1.b(anm1.N("messaging_banner_content_button_tag", qim0Var), (tl3) null, (hw61) null, (pgx) null, uzq0.b, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-246713013, new tf(x5aVar, o8j0Var2, iu30Var, zBooleanValue, (byte) 4), x340Var), x340Var, 0, 48, 1518);
            x340Var = x340Var;
            Button button2 = g8j0Var.j;
            if (button2 == null) {
                x340Var.i0(1734545398);
                x340Var.r((boolean) r28);
                z = true;
            } else {
                x340Var.i0(1734545399);
                fux fuxVar = fux.c;
                MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
                jsl jslVar = new jsl(cwl1.o0(x340Var, 2131953955));
                Icon icon = button2.getStyle().getIcon();
                long jP = v9p1.P(v9p1.E(messageResponseToken.getMessageData().getFormat().getTemplate(), x340Var), icon != null ? icon.getColor() : null);
                qim0 qim0VarA = h2c.a.a(anm1.N("messaging_banner_x_button_tag", qim0Var), een.f);
                yla.s(x340Var);
                yla.s(x340Var);
                qim0 qim0VarC = eqr0.C(qim0VarA, 16.0f, -16.0f);
                boolean z4 = ((i2 & 112) == 32 ? true : r28 == true ? 1 : 0) | (x340Var.i(button2) ? 1 : 0);
                Object objT3 = x340Var.T();
                if (z4 != 0 || objT3 == m4cVar4) {
                    z = true;
                    u5a u5aVar2 = new u5a(iu30Var, button2, true ? 1 : 0);
                    x340Var.s0(u5aVar2);
                    obj2 = u5aVar2;
                } else {
                    z = true;
                    obj2 = objT3;
                }
                y9j0.l(fuxVar, messageTemplateI, jslVar, qim0VarC, jP, 0.0f, (Function0) obj2, x340Var, fux.d, 32);
                x340Var.r((boolean) r28);
            }
            x340Var.r(z);
            x340Var.r(z);
            boolean z5 = (i2 & 112) == 32 ? z : r28 == true ? 1 : 0;
            Object objT4 = x340Var.T();
            Object obj4 = objT4;
            if (z5 || objT4 == m4cVar4) {
                v5a v5aVar = new v5a(iu30Var, null, r28 == true ? (byte) 1 : (byte) 0);
                x340Var.s0(v5aVar);
                obj4 = v5aVar;
            }
            qxd0.s(o8j0Var2, iu30Var, (vu30) obj4, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, o8j0Var2, iu30Var, i, (byte) 25);
        }
    }

    public final void f(o8j0 o8j0Var, iu30 iu30Var, qim0 qim0Var, h8a h8aVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(203439486);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 8211) != 8210)) {
            e(o8j0Var, iu30Var, x340Var, ((i2 >> 6) & 896) | (i2 & 14) | 8 | (i2 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t5a(this, o8j0Var, iu30Var, qim0Var, h8aVar, i, (byte) 1);
        }
    }

    public final void g(Button button, n8j0 n8j0Var, o8j0 o8j0Var, iu30 iu30Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1575825095);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(n8j0Var) : x340Var.i(n8j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            z8j0 z8j0Var = new z8j0(yla.s(x340Var), 14);
            MessageTemplate messageTemplateI = p3d1.i(o8j0Var.a);
            qim0 qim0VarN = anm1.N(str, nim0.a);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(n8j0Var)));
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z77(iu30Var, n8j0Var, (byte) 22);
                x340Var.s0(objT);
            }
            y9j0.e(button, messageTemplateI, qim0VarN, z8j0Var, z8j0Var, bjc0.a, (Function0) objT, x340Var, Button.$stable | (i2 & 14), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(this, button, n8j0Var, o8j0Var, iu30Var, str, i, (byte) 7);
        }
    }

    public final void h(o8j0 o8j0Var, iu30 iu30Var, qim0 qim0Var, h8a h8aVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(559948488);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 8211) != 8210)) {
            e(o8j0Var, iu30Var, x340Var, ((i2 >> 6) & 896) | (i2 & 14) | 8 | (i2 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t5a(this, o8j0Var, iu30Var, qim0Var, h8aVar, i, (byte) 2);
        }
    }

    public final void i(o8j0 o8j0Var, iu30 iu30Var, qim0 qim0Var, h8a h8aVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-670460340);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(o8j0Var) : x340Var.i(o8j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 8211) != 8210)) {
            e(o8j0Var, iu30Var, x340Var, ((i2 >> 6) & 896) | (i2 & 14) | 8 | (i2 & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t5a(this, o8j0Var, iu30Var, qim0Var, h8aVar, i, (byte) 3);
        }
    }

    public final smc0 j(o8j0 o8j0Var, iu30 iu30Var) {
        smc0 smc0VarN = k4p1.n();
        g8j0 g8j0Var = o8j0Var.b;
        Button button = g8j0Var.h;
        if (button != null) {
            smc0VarN.add(new w51(button.getStyle().getText(), IconKt.isValid(button.getStyle().getIcon()), new j2i(621464881, new w5a(this, button, o8j0Var, iu30Var, (byte) 0), true)));
        }
        Button button2 = g8j0Var.i;
        if (button2 != null) {
            smc0VarN.add(new w51(button2.getStyle().getText(), IconKt.isValid(button2.getStyle().getIcon()), new j2i(-1715913246, new w5a(this, button2, o8j0Var, iu30Var, (byte) 1), true)));
        }
        return k4p1.k(smc0VarN);
    }
}
