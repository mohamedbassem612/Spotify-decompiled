package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent$Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconKt;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ImageStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class y9j0 {
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    public static final void a(AccessoryContent accessoryContent, MessageTemplate messageTemplate, qim0 qim0Var, qim0 qim0Var2, float f, float f2, ecx ecxVar, float f3, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        qim0 qim0Var3;
        int i5;
        boolean z;
        qim0 qim0Var4;
        float f4;
        ecx ecxVar2;
        float f5;
        qim0 qim0Var5;
        h311 h311VarV;
        qim0 qim0Var6;
        qim0 qim0Var7;
        float f6;
        ecx ecxVarA;
        float f7;
        float f8;
        qim0 qim0Var8;
        ecx ecxVar3;
        float f9;
        int i6;
        boolean zI;
        int i7;
        int i8;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1766497772);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(accessoryContent) : x340Var.i(accessoryContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                i3 |= x340Var.i(qim0Var) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    qim0Var3 = qim0Var2;
                    if (x340Var.i(qim0Var3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) != 0) {
                    if (x340Var.d(f)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                if ((i & 196608) != 0) {
                    if ((i2 & 32) == 0 || !x340Var.d(f2)) {
                        i7 = 65536;
                    } else {
                        i7 = 131072;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    if ((i2 & 64) != 0) {
                        i6 = 524288;
                    } else {
                        if ((i & 2097152) == 0) {
                            zI = x340Var.g(ecxVar);
                        } else {
                            zI = x340Var.i(ecxVar);
                        }
                        if (zI) {
                            i6 = 1048576;
                        } else {
                            i6 = 524288;
                        }
                    }
                    i3 |= i6;
                }
                if ((i & 12582912) != 0) {
                    i3 |= ((i2 & 128) == 0 || !x340Var.d(f3)) ? 4194304 : 8388608;
                }
                if ((i3 & 4793491) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        qim0Var6 = nim0.a;
                        if (i9 != 0) {
                            qim0Var7 = qim0Var6;
                        } else {
                            qim0Var7 = qim0Var;
                        }
                        if (i4 != 0) {
                            qim0Var3 = qim0Var6;
                        }
                        if ((i2 & 32) != 0) {
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(x340Var).g;
                            i3 &= -458753;
                            f6 = 16.0f;
                        } else {
                            f6 = f2;
                        }
                        if ((i2 & 64) != 0) {
                            cbx.a.getClass();
                            ecxVarA = uwr.a();
                            i3 &= -3670017;
                        } else {
                            ecxVarA = ecxVar;
                        }
                        if ((i2 & 128) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cua cuaVar = cbx.b(x340Var).f;
                            i3 &= -29360129;
                            f7 = 4.0f;
                            ecxVar3 = ecxVarA;
                            f8 = f6;
                            qim0Var8 = qim0Var7;
                        } else {
                            f7 = f3;
                            f8 = f6;
                            qim0Var8 = qim0Var7;
                            ecxVar3 = ecxVarA;
                        }
                    } else {
                        x340Var.b0();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        qim0Var8 = qim0Var;
                        f8 = f2;
                        ecxVar3 = ecxVar;
                        f7 = f3;
                    }
                    x340Var.s();
                    if (!(accessoryContent instanceof AccessoryContent.Empty) || (accessoryContent instanceof AccessoryContent.NotSet)) {
                        f9 = f8;
                        x340Var.i0(-498629388);
                        x340Var.r(false);
                    } else {
                        boolean z2 = accessoryContent instanceof AccessoryContent.Icon;
                        isl islVar = isl.a;
                        n4k n4kVar = hmb0.t1;
                        if (z2) {
                            x340Var.i0(-498579137);
                            qim0 qim0VarN = anm1.N("messaging_accessory_content_tag", qim0Var8);
                            float f10 = f8;
                            gfh0 gfh0VarC = t1c.c(een.h, false);
                            int i10 = i3;
                            int iHashCode = Long.hashCode(x340Var.T);
                            xos0 xos0VarM = x340Var.m();
                            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC, x340Var, lljVar4);
                            nko1.H(xos0VarM, x340Var, lljVar3);
                            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE, x340Var, lljVar);
                            AccessoryContent.Icon icon = (AccessoryContent.Icon) accessoryContent;
                            k(icon.getIcon(), messageTemplate, null, f10, islVar, v9p1.P(v9p1.B(messageTemplate, x340Var), icon.getIcon().getColor()), x340Var, Icon.$stable | 24576 | (i10 & 112) | ((i10 >> 6) & 7168), 4);
                            f9 = f10;
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            f9 = f8;
                            int i11 = i3;
                            if (!(accessoryContent instanceof AccessoryContent.Image)) {
                                throw p3d1.k(x340Var, 1092291943, false);
                            }
                            x340Var.i0(-498079944);
                            qim0 qim0VarN2 = anm1.N("messaging_accessory_content_tag", qim0Var8);
                            gfh0 gfh0VarC2 = t1c.c(een.d, false);
                            int iHashCode2 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM2 = x340Var.m();
                            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN2);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC2, x340Var, lljVar4);
                            nko1.H(xos0VarM2, x340Var, lljVar3);
                            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE2, x340Var, lljVar);
                            int i12 = i11 >> 6;
                            m(((AccessoryContent.Image) accessoryContent).getAccessoryImage(), qim0Var3, islVar, f, ecxVar3, f7, x340Var, AccessoryImage.$stable | 384 | (i12 & 112) | ((i11 >> 3) & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                    }
                    qim0Var4 = qim0Var8;
                    f4 = f9;
                    ecxVar2 = ecxVar3;
                    f5 = f7;
                } else {
                    x340Var.b0();
                    qim0Var4 = qim0Var;
                    f4 = f2;
                    ecxVar2 = ecxVar;
                    f5 = f3;
                }
                qim0Var5 = qim0Var3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new g9j0(accessoryContent, messageTemplate, qim0Var4, qim0Var5, f, f4, ecxVar2, f5, i, i2);
                }
            }
            i3 |= 3072;
            qim0Var3 = qim0Var2;
            if ((i & 24576) != 0) {
                if (x340Var.d(f)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i & 196608) != 0) {
                if ((i2 & 32) == 0) {
                    i7 = 65536;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) != 0) {
                    i6 = 524288;
                } else {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(ecxVar);
                    } else {
                        zI = x340Var.i(ecxVar);
                    }
                    if (zI) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                }
                i3 |= i6;
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & 128) == 0 || !x340Var.d(f3)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    qim0Var6 = nim0.a;
                    if (i9 != 0) {
                        qim0Var7 = qim0Var6;
                    } else {
                        qim0Var7 = qim0Var;
                    }
                    if (i4 != 0) {
                        qim0Var3 = qim0Var6;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var2 = cbx.b(x340Var).g;
                        i3 &= -458753;
                        f6 = 16.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -3670017;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i2 & 128) != 0) {
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        i3 &= -29360129;
                        f7 = 4.0f;
                        ecxVar3 = ecxVarA;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                    } else {
                        f7 = f3;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                        ecxVar3 = ecxVarA;
                    }
                } else {
                    qim0Var6 = nim0.a;
                    if (i9 != 0) {
                        qim0Var7 = qim0Var6;
                    } else {
                        qim0Var7 = qim0Var;
                    }
                    if (i4 != 0) {
                        qim0Var3 = qim0Var6;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar5 = cbx.a;
                        zov0 zov0Var3 = cbx.b(x340Var).g;
                        i3 &= -458753;
                        f6 = 16.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -3670017;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i2 & 128) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cua cuaVar3 = cbx.b(x340Var).f;
                        i3 &= -29360129;
                        f7 = 4.0f;
                        ecxVar3 = ecxVarA;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                    } else {
                        f7 = f3;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                        ecxVar3 = ecxVarA;
                    }
                }
                x340Var.s();
                if (accessoryContent instanceof AccessoryContent.Empty) {
                    f9 = f8;
                    x340Var.i0(-498629388);
                    x340Var.r(false);
                } else {
                    f9 = f8;
                    x340Var.i0(-498629388);
                    x340Var.r(false);
                }
                qim0Var4 = qim0Var8;
                f4 = f9;
                ecxVar2 = ecxVar3;
                f5 = f7;
            } else {
                x340Var.b0();
                qim0Var4 = qim0Var;
                f4 = f2;
                ecxVar2 = ecxVar;
                f5 = f3;
            }
            qim0Var5 = qim0Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new g9j0(accessoryContent, messageTemplate, qim0Var4, qim0Var5, f, f4, ecxVar2, f5, i, i2);
            }
        }
        i3 |= 384;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                qim0Var3 = qim0Var2;
                if (x340Var.i(qim0Var3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) != 0) {
                if (x340Var.d(f)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((i & 196608) != 0) {
                if ((i2 & 32) == 0) {
                    i7 = 65536;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                if ((i2 & 64) != 0) {
                    i6 = 524288;
                } else {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(ecxVar);
                    } else {
                        zI = x340Var.i(ecxVar);
                    }
                    if (zI) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                }
                i3 |= i6;
            }
            if ((i & 12582912) != 0) {
                i3 |= ((i2 & 128) == 0 || !x340Var.d(f3)) ? 4194304 : 8388608;
            }
            if ((i3 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    qim0Var6 = nim0.a;
                    if (i9 != 0) {
                        qim0Var7 = qim0Var6;
                    } else {
                        qim0Var7 = qim0Var;
                    }
                    if (i4 != 0) {
                        qim0Var3 = qim0Var6;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar7 = cbx.a;
                        zov0 zov0Var4 = cbx.b(x340Var).g;
                        i3 &= -458753;
                        f6 = 16.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -3670017;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i2 & 128) != 0) {
                        uwr uwrVar8 = cbx.a;
                        cua cuaVar4 = cbx.b(x340Var).f;
                        i3 &= -29360129;
                        f7 = 4.0f;
                        ecxVar3 = ecxVarA;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                    } else {
                        f7 = f3;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                        ecxVar3 = ecxVarA;
                    }
                } else {
                    qim0Var6 = nim0.a;
                    if (i9 != 0) {
                        qim0Var7 = qim0Var6;
                    } else {
                        qim0Var7 = qim0Var;
                    }
                    if (i4 != 0) {
                        qim0Var3 = qim0Var6;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar9 = cbx.a;
                        zov0 zov0Var5 = cbx.b(x340Var).g;
                        i3 &= -458753;
                        f6 = 16.0f;
                    } else {
                        f6 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -3670017;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i2 & 128) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cua cuaVar5 = cbx.b(x340Var).f;
                        i3 &= -29360129;
                        f7 = 4.0f;
                        ecxVar3 = ecxVarA;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                    } else {
                        f7 = f3;
                        f8 = f6;
                        qim0Var8 = qim0Var7;
                        ecxVar3 = ecxVarA;
                    }
                }
                x340Var.s();
                if (accessoryContent instanceof AccessoryContent.Empty) {
                    f9 = f8;
                    x340Var.i0(-498629388);
                    x340Var.r(false);
                } else {
                    f9 = f8;
                    x340Var.i0(-498629388);
                    x340Var.r(false);
                }
                qim0Var4 = qim0Var8;
                f4 = f9;
                ecxVar2 = ecxVar3;
                f5 = f7;
            } else {
                x340Var.b0();
                qim0Var4 = qim0Var;
                f4 = f2;
                ecxVar2 = ecxVar;
                f5 = f3;
            }
            qim0Var5 = qim0Var3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new g9j0(accessoryContent, messageTemplate, qim0Var4, qim0Var5, f, f4, ecxVar2, f5, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var3 = qim0Var2;
        if ((i & 24576) != 0) {
            if (x340Var.d(f)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i & 196608) != 0) {
            if ((i2 & 32) == 0) {
                i7 = 65536;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((i & 1572864) == 0) {
            if ((i2 & 64) != 0) {
                i6 = 524288;
            } else {
                if ((i & 2097152) == 0) {
                    zI = x340Var.g(ecxVar);
                } else {
                    zI = x340Var.i(ecxVar);
                }
                if (zI) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
            }
            i3 |= i6;
        }
        if ((i & 12582912) != 0) {
            i3 |= ((i2 & 128) == 0 || !x340Var.d(f3)) ? 4194304 : 8388608;
        }
        if ((i3 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                qim0Var6 = nim0.a;
                if (i9 != 0) {
                    qim0Var7 = qim0Var6;
                } else {
                    qim0Var7 = qim0Var;
                }
                if (i4 != 0) {
                    qim0Var3 = qim0Var6;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar11 = cbx.a;
                    zov0 zov0Var6 = cbx.b(x340Var).g;
                    i3 &= -458753;
                    f6 = 16.0f;
                } else {
                    f6 = f2;
                }
                if ((i2 & 64) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -3670017;
                } else {
                    ecxVarA = ecxVar;
                }
                if ((i2 & 128) != 0) {
                    uwr uwrVar12 = cbx.a;
                    cua cuaVar6 = cbx.b(x340Var).f;
                    i3 &= -29360129;
                    f7 = 4.0f;
                    ecxVar3 = ecxVarA;
                    f8 = f6;
                    qim0Var8 = qim0Var7;
                } else {
                    f7 = f3;
                    f8 = f6;
                    qim0Var8 = qim0Var7;
                    ecxVar3 = ecxVarA;
                }
            } else {
                qim0Var6 = nim0.a;
                if (i9 != 0) {
                    qim0Var7 = qim0Var6;
                } else {
                    qim0Var7 = qim0Var;
                }
                if (i4 != 0) {
                    qim0Var3 = qim0Var6;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar13 = cbx.a;
                    zov0 zov0Var7 = cbx.b(x340Var).g;
                    i3 &= -458753;
                    f6 = 16.0f;
                } else {
                    f6 = f2;
                }
                if ((i2 & 64) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -3670017;
                } else {
                    ecxVarA = ecxVar;
                }
                if ((i2 & 128) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cua cuaVar7 = cbx.b(x340Var).f;
                    i3 &= -29360129;
                    f7 = 4.0f;
                    ecxVar3 = ecxVarA;
                    f8 = f6;
                    qim0Var8 = qim0Var7;
                } else {
                    f7 = f3;
                    f8 = f6;
                    qim0Var8 = qim0Var7;
                    ecxVar3 = ecxVarA;
                }
            }
            x340Var.s();
            if (accessoryContent instanceof AccessoryContent.Empty) {
                f9 = f8;
                x340Var.i0(-498629388);
                x340Var.r(false);
            } else {
                f9 = f8;
                x340Var.i0(-498629388);
                x340Var.r(false);
            }
            qim0Var4 = qim0Var8;
            f4 = f9;
            ecxVar2 = ecxVar3;
            f5 = f7;
        } else {
            x340Var.b0();
            qim0Var4 = qim0Var;
            f4 = f2;
            ecxVar2 = ecxVar;
            f5 = f3;
        }
        qim0Var5 = qim0Var3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g9j0(accessoryContent, messageTemplate, qim0Var4, qim0Var5, f, f4, ecxVar2, f5, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:118:0x0182  */
    /* JADX WARN: Code duplicated, block: B:120:0x0191  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void b(int i, int i2, int i3, int i4, MessageTemplate messageTemplate, MessageText messageText, String str, b0k b0kVar, iu30 iu30Var, djc0 djc0Var, qim0 qim0Var, lee1 lee1Var) {
        int i5;
        qim0 qim0Var2;
        int i6;
        int i7;
        iu30 iu30Var2;
        int i8;
        int i9;
        String str2;
        int i10;
        boolean z;
        MessageTemplate messageTemplate2;
        b0k b0kVar2;
        qim0 qim0Var3;
        int i11;
        iu30 iu30Var3;
        String str3;
        int i12;
        h311 h311VarV;
        h9j0 h9j0Var;
        int i13;
        int i14;
        EncoreFont fontOverride;
        lee1 lee1VarS;
        int i15;
        int i16;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1550574884);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? b0kVar3.g(messageText) : b0kVar3.i(messageText) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(messageTemplate) ? 32 : 16;
        }
        int i17 = i4 & 4;
        if (i17 == 0) {
            if ((i3 & 384) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                if (b0kVar3.i(djc0Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i5 |= i16;
            }
            if ((i3 & 24576) != 0) {
                if (b0kVar3.i(lee1Var)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i5 |= i15;
            }
            if ((196608 & i3) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i3) == 0) {
                if ((i4 & 64) == 0) {
                    i6 = i2;
                    int i18 = b0kVar3.e(i6) ? 1048576 : 524288;
                    i5 |= i18;
                } else {
                    i6 = i2;
                }
                i5 |= i18;
            } else {
                i6 = i2;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
                if ((12582912 & i3) == 0) {
                    iu30Var2 = iu30Var;
                    if (b0kVar3.i(iu30Var2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    if ((100663296 & i3) == 0) {
                        str2 = str;
                        if (b0kVar3.g(str2)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i5 |= i10;
                    }
                    if ((i5 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i5 & 1, z)) {
                        b0kVar3.d0();
                        if ((i3 & 1) != 0 || b0kVar3.E()) {
                            if (i17 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            i13 = i5 & (-458753);
                            if ((i4 & 64) != 0) {
                                i13 = i5 & (-4128769);
                                i6 = 3;
                            }
                            if (i7 != 0) {
                                iu30Var2 = null;
                            }
                            if (i9 != 0) {
                                i11 = i6;
                                iu30Var3 = iu30Var2;
                                i14 = 2;
                                str3 = "messaging_body_tag";
                            } else {
                                i11 = i6;
                                iu30Var3 = iu30Var2;
                                str3 = str2;
                                i14 = 2;
                            }
                        } else {
                            b0kVar3.b0();
                            i13 = i5 & (-458753);
                            if ((i4 & 64) != 0) {
                                i13 = i5 & (-4128769);
                            }
                            i14 = i;
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                        }
                        b0kVar3.s();
                        if (messageText.getText().length() == 0) {
                            h311VarV = b0kVar3.v();
                            if (h311VarV != null) {
                                return;
                            } else {
                                h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                            }
                        } else {
                            messageTemplate2 = messageTemplate;
                            String text = messageText.getText();
                            long jP = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                            fontOverride = messageText.getFontOverride();
                            if (fontOverride == null) {
                                b0kVar3.i0(803717386);
                                b0kVar3.r(false);
                                lee1VarS = null;
                            } else {
                                b0kVar3.i0(-251168297);
                                lee1VarS = s(fontOverride, b0kVar3);
                                b0kVar3.r(false);
                            }
                            if (lee1VarS == null) {
                                lee1VarS = lee1Var;
                            }
                            b0kVar2 = b0kVar3;
                            q(text, jP, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                            qim0Var3 = qim0Var2;
                            i12 = i14;
                        }
                        h311VarV.d = h9j0Var;
                    }
                    messageTemplate2 = messageTemplate;
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    i11 = i6;
                    iu30Var3 = iu30Var2;
                    str3 = str2;
                    i12 = i;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                        h311VarV.d = h9j0Var;
                    }
                }
                i5 |= 100663296;
                str2 = str;
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String text2 = messageText.getText();
                        long jP2 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(803717386);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-251168297);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        b0kVar2 = b0kVar3;
                        q(text2, jP2, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                iu30Var3 = iu30Var2;
                str3 = str2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 12582912;
            iu30Var2 = iu30Var;
            i9 = i4 & 256;
            if (i9 != 0) {
                if ((100663296 & i3) == 0) {
                    str2 = str;
                    if (b0kVar3.g(str2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String text3 = messageText.getText();
                        long jP3 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(803717386);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-251168297);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        b0kVar2 = b0kVar3;
                        q(text3, jP3, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                iu30Var3 = iu30Var2;
                str3 = str2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 100663296;
            str2 = str;
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String text4 = messageText.getText();
                    long jP4 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(803717386);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-251168297);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    b0kVar2 = b0kVar3;
                    q(text4, jP4, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            iu30Var3 = iu30Var2;
            str3 = str2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 3072) != 0) {
            if (b0kVar3.i(djc0Var)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i5 |= i16;
        }
        if ((i3 & 24576) != 0) {
            if (b0kVar3.i(lee1Var)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        }
        if ((196608 & i3) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i3) == 0) {
            if ((i4 & 64) == 0) {
                i6 = i2;
                if (b0kVar3.e(i6)) {
                }
                i5 |= i18;
            } else {
                i6 = i2;
            }
            i5 |= i18;
        } else {
            i6 = i2;
        }
        i7 = i4 & 128;
        if (i7 != 0) {
            if ((12582912 & i3) == 0) {
                iu30Var2 = iu30Var;
                if (b0kVar3.i(iu30Var2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i5 |= i8;
            }
            i9 = i4 & 256;
            if (i9 != 0) {
                if ((100663296 & i3) == 0) {
                    str2 = str;
                    if (b0kVar3.g(str2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            i14 = 2;
                            str3 = "messaging_body_tag";
                        } else {
                            i11 = i6;
                            iu30Var3 = iu30Var2;
                            str3 = str2;
                            i14 = 2;
                        }
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String text5 = messageText.getText();
                        long jP5 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(803717386);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-251168297);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        b0kVar2 = b0kVar3;
                        q(text5, jP5, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                iu30Var3 = iu30Var2;
                str3 = str2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 100663296;
            str2 = str;
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String text6 = messageText.getText();
                    long jP6 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(803717386);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-251168297);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    b0kVar2 = b0kVar3;
                    q(text6, jP6, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            iu30Var3 = iu30Var2;
            str3 = str2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 12582912;
        iu30Var2 = iu30Var;
        i9 = i4 & 256;
        if (i9 != 0) {
            if ((100663296 & i3) == 0) {
                str2 = str;
                if (b0kVar3.g(str2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        i14 = 2;
                        str3 = "messaging_body_tag";
                    } else {
                        i11 = i6;
                        iu30Var3 = iu30Var2;
                        str3 = str2;
                        i14 = 2;
                    }
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String text7 = messageText.getText();
                    long jP7 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(803717386);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-251168297);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    b0kVar2 = b0kVar3;
                    q(text7, jP7, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            iu30Var3 = iu30Var2;
            str3 = str2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 100663296;
        str2 = str;
        if ((i5 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i5 & 1, z)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0) {
                if (i17 != 0) {
                    qim0Var2 = nim0.a;
                }
                i13 = i5 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i5 & (-4128769);
                    i6 = 3;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                if (i9 != 0) {
                    i11 = i6;
                    iu30Var3 = iu30Var2;
                    i14 = 2;
                    str3 = "messaging_body_tag";
                } else {
                    i11 = i6;
                    iu30Var3 = iu30Var2;
                    str3 = str2;
                    i14 = 2;
                }
            } else {
                if (i17 != 0) {
                    qim0Var2 = nim0.a;
                }
                i13 = i5 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i5 & (-4128769);
                    i6 = 3;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                if (i9 != 0) {
                    i11 = i6;
                    iu30Var3 = iu30Var2;
                    i14 = 2;
                    str3 = "messaging_body_tag";
                } else {
                    i11 = i6;
                    iu30Var3 = iu30Var2;
                    str3 = str2;
                    i14 = 2;
                }
            }
            b0kVar3.s();
            if (messageText.getText().length() == 0) {
                h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    return;
                } else {
                    h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, djc0Var, lee1Var, i14, i11, iu30Var3, str3, i3, i4, (byte) 0);
                }
            } else {
                messageTemplate2 = messageTemplate;
                String text8 = messageText.getText();
                long jP8 = v9p1.P(v9p1.D(messageTemplate2, b0kVar3), messageText.getTextColor());
                fontOverride = messageText.getFontOverride();
                if (fontOverride == null) {
                    b0kVar3.i0(803717386);
                    b0kVar3.r(false);
                    lee1VarS = null;
                } else {
                    b0kVar3.i0(-251168297);
                    lee1VarS = s(fontOverride, b0kVar3);
                    b0kVar3.r(false);
                }
                if (lee1VarS == null) {
                    lee1VarS = lee1Var;
                }
                b0kVar2 = b0kVar3;
                q(text8, jP8, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var3, str3, b0kVar2, (i13 & 234881024) | (i13 & 7168) | ((i13 << 9) & 458752) | (3670016 & i13) | (29360128 & i13), 0);
                qim0Var3 = qim0Var2;
                i12 = i14;
            }
            h311VarV.d = h9j0Var;
        }
        messageTemplate2 = messageTemplate;
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        qim0Var3 = qim0Var2;
        i11 = i6;
        iu30Var3 = iu30Var2;
        str3 = str2;
        i12 = i;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, djc0Var, lee1Var, i12, i11, iu30Var3, str3, i3, i4, (byte) 1);
            h311VarV.d = h9j0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Code duplicated, block: B:93:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, int i3, int i4, long j, MessageTemplate messageTemplate, String str, String str2, b0k b0kVar, iu30 iu30Var, djc0 djc0Var, qim0 qim0Var, lee1 lee1Var) {
        qim0 qim0Var2;
        int i5;
        long j2;
        lee1 lee1Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        iu30 iu30Var2;
        int i10;
        int i11;
        int i12;
        boolean z;
        String str3;
        qim0 qim0Var3;
        long j3;
        lee1 lee1Var3;
        iu30 iu30Var3;
        int i13;
        h311 h311VarV;
        i9j0 i9j0Var;
        qim0 qim0Var4;
        long jD;
        lee1 lee1Var4;
        iu30 iu30Var4;
        String str4;
        iu30 iu30Var5;
        int i14;
        lee1 lee1Var5;
        int i15;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1513881945);
        int i16 = i3 | (x340Var.g(str) ? 4 : 2) | (x340Var.i(messageTemplate) ? 32 : 16);
        int i17 = i4 & 4;
        if (i17 != 0) {
            i5 = i16 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i16 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if ((i4 & 8) == 0) {
            j2 = j;
            int i18 = x340Var.f(j2) ? 2048 : 1024;
            int i19 = i5 | i18;
            if ((i4 & 16) == 0) {
                lee1Var2 = lee1Var;
                int i20 = x340Var.i(lee1Var2) ? 16384 : 8192;
                int i21 = i19 | i20;
                if (x340Var.i(djc0Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                int i22 = i21 | i6 | 524288;
                if (x340Var.e(i2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i8 = i22 | i7;
                i9 = i4 & 256;
                if (i9 != 0) {
                    i11 = i8 | 100663296;
                    iu30Var2 = iu30Var;
                } else {
                    iu30Var2 = iu30Var;
                    if (x340Var.i(iu30Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i11 = i8 | i10;
                }
                i12 = i11 | 805306368;
                if ((i12 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    x340Var.d0();
                    if ((i3 & 1) != 0 || x340Var.E()) {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i4 & 8) != 0) {
                            jD = v9p1.D(messageTemplate, x340Var);
                            i12 &= -7169;
                        } else {
                            jD = j2;
                        }
                        if ((i4 & 16) != 0) {
                            uwr uwrVar = cbx.a;
                            lee1Var4 = cbx.d(x340Var).j;
                            i12 &= -57345;
                        } else {
                            lee1Var4 = lee1Var2;
                        }
                        int i23 = i12 & (-3670017);
                        if (i9 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        str4 = "messaging_body_tag";
                        iu30Var5 = iu30Var4;
                        long j4 = jD;
                        i14 = i23;
                        lee1Var5 = lee1Var4;
                        i15 = 2;
                        j2 = j4;
                    } else {
                        x340Var.b0();
                        if ((i4 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i12 &= -57345;
                        }
                        str4 = str2;
                        i14 = i12 & (-3670017);
                        qim0Var4 = qim0Var2;
                        lee1Var5 = lee1Var2;
                        iu30Var5 = iu30Var2;
                        i15 = i;
                    }
                    x340Var.s();
                    if (str.length() == 0) {
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var5, djc0Var, i15, i2, iu30Var5, str4, i3, i4, (byte) 0);
                        }
                    } else {
                        long j5 = j2;
                        iu30 iu30Var6 = iu30Var5;
                        String str5 = str4;
                        lee1 lee1Var6 = lee1Var5;
                        int i24 = i15;
                        int i25 = i14 >> 6;
                        int i26 = (i14 & 14) | (i25 & 112) | (i25 & 896) | (i25 & 7168) | ((i14 << 9) & 458752);
                        int i27 = i14 >> 3;
                        qim0 qim0Var5 = qim0Var4;
                        q(str, j5, lee1Var6, djc0Var, i24, qim0Var5, i2, iu30Var6, str5, x340Var, i26 | (3670016 & i27) | (i27 & 29360128) | 100663296, 0);
                        lee1Var3 = lee1Var6;
                        qim0Var3 = qim0Var5;
                        i13 = i24;
                        j3 = j5;
                        str3 = str5;
                        iu30Var3 = iu30Var6;
                    }
                    h311VarV.d = i9j0Var;
                }
                x340Var.b0();
                str3 = str2;
                qim0Var3 = qim0Var2;
                j3 = j2;
                lee1Var3 = lee1Var2;
                iu30Var3 = iu30Var2;
                i13 = i;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var3, djc0Var, i13, i2, iu30Var3, str3, i3, i4, (byte) 1);
                    h311VarV.d = i9j0Var;
                }
            }
            lee1Var2 = lee1Var;
            int i28 = i19 | i20;
            if (x340Var.i(djc0Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            int i29 = i28 | i6 | 524288;
            if (x340Var.e(i2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i8 = i29 | i7;
            i9 = i4 & 256;
            if (i9 != 0) {
                i11 = i8 | 100663296;
                iu30Var2 = iu30Var;
            } else {
                iu30Var2 = iu30Var;
                if (x340Var.i(iu30Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i11 = i8 | i10;
            }
            i12 = i11 | 805306368;
            if ((i12 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        jD = v9p1.D(messageTemplate, x340Var);
                        i12 &= -7169;
                    } else {
                        jD = j2;
                    }
                    if ((i4 & 16) != 0) {
                        uwr uwrVar2 = cbx.a;
                        lee1Var4 = cbx.d(x340Var).j;
                        i12 &= -57345;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    int i210 = i12 & (-3670017);
                    if (i9 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    str4 = "messaging_body_tag";
                    iu30Var5 = iu30Var4;
                    long j6 = jD;
                    i14 = i210;
                    lee1Var5 = lee1Var4;
                    i15 = 2;
                    j2 = j6;
                } else {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        jD = v9p1.D(messageTemplate, x340Var);
                        i12 &= -7169;
                    } else {
                        jD = j2;
                    }
                    if ((i4 & 16) != 0) {
                        uwr uwrVar3 = cbx.a;
                        lee1Var4 = cbx.d(x340Var).j;
                        i12 &= -57345;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    int i211 = i12 & (-3670017);
                    if (i9 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    str4 = "messaging_body_tag";
                    iu30Var5 = iu30Var4;
                    long j7 = jD;
                    i14 = i211;
                    lee1Var5 = lee1Var4;
                    i15 = 2;
                    j2 = j7;
                }
                x340Var.s();
                if (str.length() == 0) {
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var5, djc0Var, i15, i2, iu30Var5, str4, i3, i4, (byte) 0);
                    }
                } else {
                    long j8 = j2;
                    iu30 iu30Var7 = iu30Var5;
                    String str6 = str4;
                    lee1 lee1Var7 = lee1Var5;
                    int i212 = i15;
                    int i213 = i14 >> 6;
                    int i214 = (i14 & 14) | (i213 & 112) | (i213 & 896) | (i213 & 7168) | ((i14 << 9) & 458752);
                    int i215 = i14 >> 3;
                    qim0 qim0Var6 = qim0Var4;
                    q(str, j8, lee1Var7, djc0Var, i212, qim0Var6, i2, iu30Var7, str6, x340Var, i214 | (3670016 & i215) | (i215 & 29360128) | 100663296, 0);
                    lee1Var3 = lee1Var7;
                    qim0Var3 = qim0Var6;
                    i13 = i212;
                    j3 = j8;
                    str3 = str6;
                    iu30Var3 = iu30Var7;
                }
                h311VarV.d = i9j0Var;
            }
            x340Var.b0();
            str3 = str2;
            qim0Var3 = qim0Var2;
            j3 = j2;
            lee1Var3 = lee1Var2;
            iu30Var3 = iu30Var2;
            i13 = i;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var3, djc0Var, i13, i2, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = i9j0Var;
            }
        }
        j2 = j;
        int i110 = i5 | i18;
        if ((i4 & 16) == 0) {
            lee1Var2 = lee1Var;
            if (x340Var.i(lee1Var2)) {
            }
            int i216 = i110 | i20;
            if (x340Var.i(djc0Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            int i217 = i216 | i6 | 524288;
            if (x340Var.e(i2)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i8 = i217 | i7;
            i9 = i4 & 256;
            if (i9 != 0) {
                i11 = i8 | 100663296;
                iu30Var2 = iu30Var;
            } else {
                iu30Var2 = iu30Var;
                if (x340Var.i(iu30Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i11 = i8 | i10;
            }
            i12 = i11 | 805306368;
            if ((i12 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                x340Var.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        jD = v9p1.D(messageTemplate, x340Var);
                        i12 &= -7169;
                    } else {
                        jD = j2;
                    }
                    if ((i4 & 16) != 0) {
                        uwr uwrVar4 = cbx.a;
                        lee1Var4 = cbx.d(x340Var).j;
                        i12 &= -57345;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    int i218 = i12 & (-3670017);
                    if (i9 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    str4 = "messaging_body_tag";
                    iu30Var5 = iu30Var4;
                    long j9 = jD;
                    i14 = i218;
                    lee1Var5 = lee1Var4;
                    i15 = 2;
                    j2 = j9;
                } else {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        jD = v9p1.D(messageTemplate, x340Var);
                        i12 &= -7169;
                    } else {
                        jD = j2;
                    }
                    if ((i4 & 16) != 0) {
                        uwr uwrVar5 = cbx.a;
                        lee1Var4 = cbx.d(x340Var).j;
                        i12 &= -57345;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    int i219 = i12 & (-3670017);
                    if (i9 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    str4 = "messaging_body_tag";
                    iu30Var5 = iu30Var4;
                    long j10 = jD;
                    i14 = i219;
                    lee1Var5 = lee1Var4;
                    i15 = 2;
                    j2 = j10;
                }
                x340Var.s();
                if (str.length() == 0) {
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var5, djc0Var, i15, i2, iu30Var5, str4, i3, i4, (byte) 0);
                    }
                } else {
                    long j11 = j2;
                    iu30 iu30Var8 = iu30Var5;
                    String str7 = str4;
                    lee1 lee1Var8 = lee1Var5;
                    int i2110 = i15;
                    int i2111 = i14 >> 6;
                    int i2112 = (i14 & 14) | (i2111 & 112) | (i2111 & 896) | (i2111 & 7168) | ((i14 << 9) & 458752);
                    int i2113 = i14 >> 3;
                    qim0 qim0Var7 = qim0Var4;
                    q(str, j11, lee1Var8, djc0Var, i2110, qim0Var7, i2, iu30Var8, str7, x340Var, i2112 | (3670016 & i2113) | (i2113 & 29360128) | 100663296, 0);
                    lee1Var3 = lee1Var8;
                    qim0Var3 = qim0Var7;
                    i13 = i2110;
                    j3 = j11;
                    str3 = str7;
                    iu30Var3 = iu30Var8;
                }
                h311VarV.d = i9j0Var;
            }
            x340Var.b0();
            str3 = str2;
            qim0Var3 = qim0Var2;
            j3 = j2;
            lee1Var3 = lee1Var2;
            iu30Var3 = iu30Var2;
            i13 = i;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var3, djc0Var, i13, i2, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = i9j0Var;
            }
        }
        lee1Var2 = lee1Var;
        int i2114 = i110 | i20;
        if (x340Var.i(djc0Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i2115 = i2114 | i6 | 524288;
        if (x340Var.e(i2)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        i8 = i2115 | i7;
        i9 = i4 & 256;
        if (i9 != 0) {
            i11 = i8 | 100663296;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            if (x340Var.i(iu30Var2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i11 = i8 | i10;
        }
        i12 = i11 | 805306368;
        if ((i12 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i12 & 1, z)) {
            x340Var.d0();
            if ((i3 & 1) != 0) {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    jD = v9p1.D(messageTemplate, x340Var);
                    i12 &= -7169;
                } else {
                    jD = j2;
                }
                if ((i4 & 16) != 0) {
                    uwr uwrVar6 = cbx.a;
                    lee1Var4 = cbx.d(x340Var).j;
                    i12 &= -57345;
                } else {
                    lee1Var4 = lee1Var2;
                }
                int i2116 = i12 & (-3670017);
                if (i9 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                str4 = "messaging_body_tag";
                iu30Var5 = iu30Var4;
                long j12 = jD;
                i14 = i2116;
                lee1Var5 = lee1Var4;
                i15 = 2;
                j2 = j12;
            } else {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    jD = v9p1.D(messageTemplate, x340Var);
                    i12 &= -7169;
                } else {
                    jD = j2;
                }
                if ((i4 & 16) != 0) {
                    uwr uwrVar7 = cbx.a;
                    lee1Var4 = cbx.d(x340Var).j;
                    i12 &= -57345;
                } else {
                    lee1Var4 = lee1Var2;
                }
                int i2117 = i12 & (-3670017);
                if (i9 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                str4 = "messaging_body_tag";
                iu30Var5 = iu30Var4;
                long j13 = jD;
                i14 = i2117;
                lee1Var5 = lee1Var4;
                i15 = 2;
                j2 = j13;
            }
            x340Var.s();
            if (str.length() == 0) {
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    return;
                } else {
                    i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var5, djc0Var, i15, i2, iu30Var5, str4, i3, i4, (byte) 0);
                }
            } else {
                long j14 = j2;
                iu30 iu30Var9 = iu30Var5;
                String str8 = str4;
                lee1 lee1Var9 = lee1Var5;
                int i2118 = i15;
                int i2119 = i14 >> 6;
                int i21110 = (i14 & 14) | (i2119 & 112) | (i2119 & 896) | (i2119 & 7168) | ((i14 << 9) & 458752);
                int i21111 = i14 >> 3;
                qim0 qim0Var8 = qim0Var4;
                q(str, j14, lee1Var9, djc0Var, i2118, qim0Var8, i2, iu30Var9, str8, x340Var, i21110 | (3670016 & i21111) | (i21111 & 29360128) | 100663296, 0);
                lee1Var3 = lee1Var9;
                qim0Var3 = qim0Var8;
                i13 = i2118;
                j3 = j14;
                str3 = str8;
                iu30Var3 = iu30Var9;
            }
            h311VarV.d = i9j0Var;
        }
        x340Var.b0();
        str3 = str2;
        qim0Var3 = qim0Var2;
        j3 = j2;
        lee1Var3 = lee1Var2;
        iu30Var3 = iu30Var2;
        i13 = i;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var3, djc0Var, i13, i2, iu30Var3, str3, i3, i4, (byte) 1);
            h311VarV.d = i9j0Var;
        }
    }

    public static final void d(Button button, MessageTemplate messageTemplate, hdx hdxVar, gdx gdxVar, vzq0 vzq0Var, long j, qim0 qim0Var, int i, String str, djc0 djc0Var, Function0 function0, b0k b0kVar, int i2, int i3) {
        int i4;
        hdx hdxVar2;
        vzq0 vzq0Var2;
        int i5;
        int i6;
        j9j0 j9j0Var;
        h311 h311Var;
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-681296226);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            hdxVar2 = hdxVar;
            i4 |= x340Var.i(hdxVar2) ? 256 : 128;
        } else {
            hdxVar2 = hdxVar;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(gdxVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i4 |= x340Var.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 = i;
            i4 |= x340Var.e(i5) ? 8388608 : 4194304;
        } else {
            i5 = i;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var.g(str) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var.i(djc0Var) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i6 = i3 | (x340Var.i(function0) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (x340Var.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (ihc1.y0(button.getStyle().getText())) {
                h311 h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                }
                j9j0Var = new j9j0(button, messageTemplate, hdxVar2, gdxVar, vzq0Var2, j, qim0Var, i5, str, djc0Var, function0, i2, i3, (byte) 0);
                h311Var = h311VarV;
            } else {
                if (IconKt.isValid(button.getStyle().getIcon())) {
                    x340Var.i0(1520079757);
                    j2iVarR = apo.r(1949435419, new rvg0(button, messageTemplate, gdxVar, (byte) 19), x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1520230943);
                    x340Var.r(false);
                    j2iVarR = null;
                }
                boolean z = button.getStyle().getButtonIconAlignment() == ButtonIconAlignment.TRAILING;
                gbx gbxVar = new gbx(z50.c, function0);
                j2i j2iVar = !z ? j2iVarR : null;
                j2i j2iVar2 = z ? j2iVarR : null;
                int i8 = i7 << 6;
                foo1.c(gbxVar, hdxVar, anm1.N(str, qim0Var), (max) null, gdxVar, vzq0Var, (idn0) null, (ga80) null, j2iVar, j2iVar2, apo.r(-1761366017, new md60(button, j, djc0Var, i, (byte) 1), x340Var), x340Var, ((i7 >> 3) & 112) | (458752 & i8) | (i8 & 3670016), 48, 408);
            }
            h311Var.d = j9j0Var;
        }
        x340Var.b0();
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            j9j0Var = new j9j0(button, messageTemplate, hdxVar, gdxVar, vzq0Var, j, qim0Var, i, str, djc0Var, function0, i2, i3, (byte) 1);
            h311Var = h311VarV2;
            h311Var.d = j9j0Var;
        }
    }

    public static final void e(Button button, MessageTemplate messageTemplate, qim0 qim0Var, z8j0 z8j0Var, z8j0 z8j0Var2, djc0 djc0Var, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        MessageTemplate messageTemplate2;
        z8j0 z8j0Var3;
        z8j0 z8j0Var4;
        djc0 zic0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2026424754);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            messageTemplate2 = messageTemplate;
            i3 |= x340Var.i(messageTemplate2) ? 32 : 16;
        } else {
            messageTemplate2 = messageTemplate;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                z8j0Var3 = z8j0Var;
                int i4 = x340Var.i(z8j0Var3) ? 2048 : 1024;
                i3 |= i4;
            } else {
                z8j0Var3 = z8j0Var;
            }
            i3 |= i4;
        } else {
            z8j0Var3 = z8j0Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                z8j0Var4 = z8j0Var2;
                int i5 = x340Var.i(z8j0Var4) ? 16384 : 8192;
                i3 |= i5;
            } else {
                z8j0Var4 = z8j0Var2;
            }
            i3 |= i5;
        } else {
            z8j0Var4 = z8j0Var2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                zic0Var = djc0Var;
                int i6 = x340Var.i(zic0Var) ? 131072 : 65536;
                i3 |= i6;
            } else {
                zic0Var = djc0Var;
            }
            i3 |= i6;
        } else {
            zic0Var = djc0Var;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var.i(function0) ? 1048576 : 524288;
        }
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 8) != 0) {
                    z8j0Var3 = new z8j0(null, 15);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    z8j0Var4 = new z8j0(yla.r(x340Var), 14);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    zic0Var = new zic0(1);
                    i3 &= -458753;
                }
            } else {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
            z8j0 z8j0Var5 = z8j0Var3;
            djc0 djc0Var2 = zic0Var;
            int i7 = i3;
            z8j0 z8j0Var6 = z8j0Var4;
            x340Var.s();
            if (button.getStyle().getButtonType() != ButtonType.PRIMARY) {
                x340Var.i0(-840012289);
                gdx gdxVarR = z8j0Var6.a;
                if (gdxVarR == null) {
                    x340Var.i0(1774020120);
                    gdxVarR = yla.r(x340Var);
                } else {
                    x340Var.i0(1774018477);
                }
                x340Var.r(false);
                byte b = z8j0Var6.b;
                vzq0 vzq0Var = z8j0Var6.c;
                if (vzq0Var == null) {
                    vzq0Var = gdxVarR.a;
                }
                hw61 hw61Var = z8j0Var6.d;
                int i8 = Button.$stable | (i7 & 14) | (i7 & 112) | (i7 & 896);
                int i9 = i7 << 9;
                p(button, messageTemplate2, qim0Var, b, gdxVarR, vzq0Var, null, hw61Var, djc0Var2, function0, x340Var, (234881024 & i9) | i8 | (i9 & 1879048192));
                x340Var.r(false);
            } else {
                x340Var.i0(-839545212);
                gdx gdxVarR2 = z8j0Var5.a;
                if (gdxVarR2 == null) {
                    x340Var.i0(1774035160);
                    gdxVarR2 = yla.r(x340Var);
                } else {
                    x340Var.i0(1774033548);
                }
                x340Var.r(false);
                byte b2 = z8j0Var5.b;
                vzq0 vzq0Var2 = z8j0Var5.c;
                if (vzq0Var2 == null) {
                    vzq0Var2 = gdxVarR2.a;
                }
                n(button, messageTemplate, qim0Var, b2, gdxVarR2, vzq0Var2, null, null, djc0Var2, z8j0Var5.d, function0, x340Var, (234881024 & (i7 << 9)) | Button.$stable | (i7 & 14) | (i7 & 112) | (i7 & 896), 14 & (i7 >> 18));
                x340Var = x340Var;
                x340Var.r(false);
            }
            zic0Var = djc0Var2;
            z8j0Var4 = z8j0Var6;
            z8j0Var3 = z8j0Var5;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(button, messageTemplate, qim0Var, z8j0Var3, z8j0Var4, zic0Var, function0, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:179:0x0223  */
    /* JADX WARN: Code duplicated, block: B:210:0x0316  */
    /* JADX WARN: Code duplicated, block: B:213:0x032d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0340  */
    /* JADX WARN: Code duplicated, block: B:217:0x0353 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Instruction removed from duplicated block: B:88:0x00fe, please report this as an issue */
    public static final void f(Disclaimer disclaimer, MessageTemplate messageTemplate, qim0 qim0Var, lee1 lee1Var, djc0 djc0Var, int i, int i2, iu30 iu30Var, Function0 function0, String str, b0k b0kVar, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        lee1 lee1Var2;
        djc0 djc0Var2;
        int i6;
        int i7;
        iu30 iu30Var2;
        int i8;
        int i9;
        boolean z;
        b0k b0kVar2;
        int i10;
        iu30 iu30Var3;
        qim0 qim0Var3;
        lee1 lee1Var3;
        int i11;
        String str2;
        h311 h311VarV;
        k9j0 k9j0Var;
        qim0 qim0Var4;
        lee1 lee1Var4;
        int i12;
        int i13;
        int i14;
        int i15;
        lee1 lee1Var5;
        int i16;
        int i17;
        boolean z2;
        Object objT;
        MessageText text;
        String str3;
        boolean z3;
        Object objT2;
        Button linkButton;
        ButtonStyle style;
        iu30 iu30Var4;
        boolean z4;
        String actionUrl;
        ButtonStyle style2;
        ClickAction clickAction;
        int i18;
        int i19;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1422990406);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? b0kVar3.g(disclaimer) : b0kVar3.i(disclaimer) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(messageTemplate) ? 32 : 16;
        }
        int i20 = i4 & 4;
        if (i20 == 0) {
            if ((i3 & 384) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    lee1Var2 = lee1Var;
                    int i21 = b0kVar3.i(lee1Var2) ? 2048 : 1024;
                    i5 |= i21;
                } else {
                    lee1Var2 = lee1Var;
                }
                i5 |= i21;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((i3 & 24576) == 0) {
                djc0Var2 = djc0Var;
                if (b0kVar3.i(djc0Var2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i5 |= i19;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((196608 & i3) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i3) == 0) {
                if ((i4 & 64) == 0) {
                    i6 = i2;
                    int i22 = b0kVar3.e(i6) ? 1048576 : 524288;
                    i5 |= i22;
                } else {
                    i6 = i2;
                }
                i5 |= i22;
            } else {
                i6 = i2;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
                i5 |= 12582912;
                iu30Var2 = iu30Var;
            } else {
                iu30Var2 = iu30Var;
                if ((i3 & 12582912) == 0) {
                    if (b0kVar3.i(iu30Var2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i5 |= i8;
                }
            }
            if ((i3 & 100663296) == 0) {
                if (b0kVar3.i(function0)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i5 |= i18;
            }
            i9 = i5 | 805306368;
            if ((i9 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i9 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0 || b0kVar3.E()) {
                    if (i20 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        lee1Var4 = cbx.d(b0kVar3).m;
                        i9 &= -7169;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    i12 = i9 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i9 & (-4128769);
                        i14 = 3;
                    } else {
                        i13 = i12;
                        i14 = i6;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    str2 = "messaging_disclaimer_tag";
                    int i23 = i14;
                    i15 = i13;
                    qim0Var3 = qim0Var4;
                    lee1Var5 = lee1Var4;
                    iu30Var3 = iu30Var2;
                    i11 = i23;
                    i16 = 2;
                } else {
                    b0kVar3.b0();
                    if ((i4 & 8) != 0) {
                        i9 &= -7169;
                    }
                    int i24 = i9 & (-458753);
                    if ((i4 & 64) != 0) {
                        i24 = i9 & (-4128769);
                    }
                    i16 = i;
                    i15 = i24;
                    iu30Var3 = iu30Var2;
                    qim0Var3 = qim0Var2;
                    lee1Var5 = lee1Var2;
                    i11 = i6;
                    str2 = str;
                }
                b0kVar3.s();
                i17 = i15 & 14;
                if (i17 != 4 || ((i15 & 8) != 0 && b0kVar3.g(disclaimer))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2 || objT == m4cVar) {
                    text = disclaimer.getText();
                    if (text != null) {
                        objT = text.getText();
                    } else {
                        objT = null;
                    }
                    b0kVar3.s0(objT);
                }
                str3 = (String) objT;
                if (i17 != 4 || ((i15 & 8) != 0 && b0kVar3.g(disclaimer))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT2 = b0kVar3.T();
                if (z3 || objT2 == m4cVar) {
                    linkButton = disclaimer.getLinkButton();
                    if (linkButton != null || (style = linkButton.getStyle()) == null) {
                        objT2 = null;
                    } else {
                        objT2 = style.getText();
                    }
                    b0kVar3.s0(objT2);
                }
                String str4 = (String) objT2;
                if ((str3 != null || str3.length() == 0) && (str4 == null || str4.length() == 0)) {
                    iu30Var4 = iu30Var3;
                    h311VarV = b0kVar3.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        k9j0Var = new k9j0(disclaimer, messageTemplate, qim0Var3, lee1Var5, djc0Var, i16, i11, iu30Var4, function0, str2, i3, i4, (byte) 0);
                    }
                } else {
                    ye5 ye5VarO = kk0.o(-1694157956, b0kVar3);
                    if (str3 != null && str3.length() > 0) {
                        ye5VarO.g(str3);
                    }
                    if (str4 == null || str4.length() <= 0) {
                        z4 = false;
                        b0kVar3.i0(2086420084);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(2085855016);
                        if (str3 == null) {
                            ye5VarO.g(" ");
                        } else {
                            Character chValueOf = str3.length() == 0 ? null : Character.valueOf(str3.charAt(str3.length() - 1));
                            if (chValueOf == null || chValueOf.charValue() != ' ') {
                                ye5VarO.g(" ");
                            }
                        }
                        Button linkButton2 = disclaimer.getLinkButton();
                        if (linkButton2 == null || (clickAction = linkButton2.getClickAction()) == null || (actionUrl = clickAction.getActionUrl()) == null) {
                            actionUrl = "";
                        }
                        Button linkButton3 = disclaimer.getLinkButton();
                        zma1 zma1Var = new zma1(v9p1.P(cbx.a(b0kVar3).b.b, (linkButton3 == null || (style2 = linkButton3.getStyle()) == null) ? null : style2.getTextColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
                        boolean z5 = (i15 & 234881024) == 67108864;
                        Object objT3 = b0kVar3.T();
                        if (z5 || objT3 == m4cVar) {
                            objT3 = new hii0(function0, (byte) 1);
                            b0kVar3.s0(objT3);
                        }
                        vhg.c(ye5VarO, str4, actionUrl, zma1Var, (iu30) objT3);
                        z4 = false;
                        b0kVar3.r(false);
                    }
                    af5 af5VarP = ye5VarO.p();
                    b0kVar3.r(z4);
                    MessageText text2 = disclaimer.getText();
                    int i25 = i15 >> 6;
                    lee1 lee1Var6 = lee1Var5;
                    b0kVar2 = b0kVar3;
                    uwo1.d(af5VarP, v9p1.P(cbx.a(b0kVar3).b.b, text2 != null ? text2.getTextColor() : null), anm1.N(str2, qim0Var3), lee1Var6, new a0e1(i11), iu30Var3, i16, false, djc0Var2, 0, (qx8) null, (cqs0) null, b0kVar2, (i15 & 7168) | (57344 & i25) | (i25 & 458752) | ((i15 << 12) & 234881024), 0, 3712);
                    lee1Var3 = lee1Var6;
                    i10 = i16;
                }
                h311VarV.d = k9j0Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            i10 = i;
            iu30Var3 = iu30Var2;
            qim0Var3 = qim0Var2;
            lee1Var3 = lee1Var2;
            i11 = i6;
            str2 = str;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                k9j0Var = new k9j0(disclaimer, messageTemplate, qim0Var3, lee1Var3, djc0Var, i10, i11, iu30Var3, function0, str2, i3, i4, (byte) 1);
                h311VarV.d = k9j0Var;
            }
        }
        i5 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                lee1Var2 = lee1Var;
                if (b0kVar3.i(lee1Var2)) {
                }
                i5 |= i21;
            } else {
                lee1Var2 = lee1Var;
            }
            i5 |= i21;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i3 & 24576) == 0) {
            djc0Var2 = djc0Var;
            if (b0kVar3.i(djc0Var2)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i5 |= i19;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((196608 & i3) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i3) == 0) {
            if ((i4 & 64) == 0) {
                i6 = i2;
                if (b0kVar3.e(i6)) {
                }
                i5 |= i22;
            } else {
                i6 = i2;
            }
            i5 |= i22;
        } else {
            i6 = i2;
        }
        i7 = i4 & 128;
        if (i7 != 0) {
            i5 |= 12582912;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            if ((i3 & 12582912) == 0) {
                if (b0kVar3.i(iu30Var2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i5 |= i8;
            }
        }
        if ((i3 & 100663296) == 0) {
            if (b0kVar3.i(function0)) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i5 |= i18;
        }
        i9 = i5 | 805306368;
        if ((i9 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i9 & 1, z)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0) {
                if (i20 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    uwr uwrVar2 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).m;
                    i9 &= -7169;
                } else {
                    lee1Var4 = lee1Var2;
                }
                i12 = i9 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i9 & (-4128769);
                    i14 = 3;
                } else {
                    i13 = i12;
                    i14 = i6;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                str2 = "messaging_disclaimer_tag";
                int i26 = i14;
                i15 = i13;
                qim0Var3 = qim0Var4;
                lee1Var5 = lee1Var4;
                iu30Var3 = iu30Var2;
                i11 = i26;
                i16 = 2;
            } else {
                if (i20 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).m;
                    i9 &= -7169;
                } else {
                    lee1Var4 = lee1Var2;
                }
                i12 = i9 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i9 & (-4128769);
                    i14 = 3;
                } else {
                    i13 = i12;
                    i14 = i6;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                str2 = "messaging_disclaimer_tag";
                int i27 = i14;
                i15 = i13;
                qim0Var3 = qim0Var4;
                lee1Var5 = lee1Var4;
                iu30Var3 = iu30Var2;
                i11 = i27;
                i16 = 2;
            }
            b0kVar3.s();
            i17 = i15 & 14;
            if (i17 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            objT = b0kVar3.T();
            if (z2) {
                text = disclaimer.getText();
                if (text != null) {
                    objT = text.getText();
                } else {
                    objT = null;
                }
                b0kVar3.s0(objT);
            } else {
                text = disclaimer.getText();
                if (text != null) {
                    objT = text.getText();
                } else {
                    objT = null;
                }
                b0kVar3.s0(objT);
            }
            str3 = (String) objT;
            if (i17 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            objT2 = b0kVar3.T();
            if (z3) {
                linkButton = disclaimer.getLinkButton();
                if (linkButton != null) {
                    objT2 = null;
                } else {
                    objT2 = null;
                }
                b0kVar3.s0(objT2);
            } else {
                linkButton = disclaimer.getLinkButton();
                if (linkButton != null) {
                    objT2 = null;
                } else {
                    objT2 = null;
                }
                b0kVar3.s0(objT2);
            }
            String str5 = (String) objT2;
            if (str3 != null) {
                iu30Var4 = iu30Var3;
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    k9j0Var = new k9j0(disclaimer, messageTemplate, qim0Var3, lee1Var5, djc0Var, i16, i11, iu30Var4, function0, str2, i3, i4, (byte) 0);
                }
            } else {
                iu30Var4 = iu30Var3;
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    k9j0Var = new k9j0(disclaimer, messageTemplate, qim0Var3, lee1Var5, djc0Var, i16, i11, iu30Var4, function0, str2, i3, i4, (byte) 0);
                }
            }
            h311VarV.d = k9j0Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        i10 = i;
        iu30Var3 = iu30Var2;
        qim0Var3 = qim0Var2;
        lee1Var3 = lee1Var2;
        i11 = i6;
        str2 = str;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            k9j0Var = new k9j0(disclaimer, messageTemplate, qim0Var3, lee1Var3, djc0Var, i10, i11, iu30Var3, function0, str2, i3, i4, (byte) 1);
            h311VarV.d = k9j0Var;
        }
    }

    public static final void g(Header header, MessageTemplate messageTemplate, qim0 qim0Var, int i, djc0 djc0Var, b0k b0kVar, int i2) {
        int i3;
        nim0 nim0Var;
        boolean z;
        MessageTemplate messageTemplate2 = messageTemplate;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(488511715);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(header) : x340Var.i(header) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(messageTemplate2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(djc0Var) ? 16384 : 8192;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarN = anm1.N("messaging_header_content_tag", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var2);
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
            if (IconKt.isValid(header.getIcon())) {
                x340Var.i0(-1079164767);
                Icon icon = header.getIcon();
                icon.getClass();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                nim0Var = nim0Var2;
                z = false;
                k(icon, messageTemplate2, null, 16.0f, null, v9p1.P(v9p1.G(messageTemplate2, x340Var), header.getIcon().getColor()), x340Var, Icon.$stable | (i4 & 112), 20);
                messageTemplate2 = messageTemplate2;
                x340Var.r(false);
            } else {
                nim0Var = nim0Var2;
                z = false;
                x340Var.i0(-1078880311);
                x340Var.r(false);
            }
            if (!IconKt.isValid(header.getIcon()) || ihc1.y0(header.getText().getText())) {
                x340Var.i0(-1078726551);
                x340Var.r(z);
            } else {
                x340Var.i0(-1078810158);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                ywx0.n(nim0Var, 4.0f, x340Var, z);
            }
            if (ihc1.y0(header.getText().getText())) {
                x340Var.i0(-1078354551);
                x340Var.r(z);
            } else {
                x340Var.i0(-1078673603);
                String text = header.getText().getText();
                long jP = v9p1.P(v9p1.F(messageTemplate2, x340Var), header.getText().getTextColor());
                uwr uwrVar3 = cbx.a;
                q(text, jP, cbx.d(x340Var).k, djc0Var, 2, null, i, null, null, x340Var, ((i4 >> 3) & 7168) | ((i4 << 9) & 3670016), 416);
                x340Var.r(z);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(header, messageTemplate2, qim0Var, i, djc0Var, i2, (byte) 15);
        }
    }

    public static final void h(HeaderContent headerContent, MessageTemplate messageTemplate, qim0 qim0Var, int i, djc0 djc0Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        djc0 zic0Var;
        boolean z;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1672229429);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(headerContent) : x340Var.i(headerContent) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                int i6 = x340Var.e(i5) ? 2048 : 1024;
                i4 |= i6;
            } else {
                i5 = i;
            }
            i4 |= i6;
        } else {
            i5 = i;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                zic0Var = djc0Var;
                int i7 = x340Var.i(zic0Var) ? 16384 : 8192;
                i4 |= i7;
            } else {
                zic0Var = djc0Var;
            }
            i4 |= i7;
        } else {
            zic0Var = djc0Var;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i5 = 3;
                }
                if ((i3 & 16) != 0) {
                    zic0Var = new zic0(1);
                    i4 &= -57345;
                }
            } else {
                x340Var.b0();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            }
            djc0 djc0Var2 = zic0Var;
            int i8 = i5;
            x340Var.s();
            qim0 qim0VarN = anm1.N("messaging_header_content_tag", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (headerContent instanceof HeaderContent.HeaderText) {
                x340Var.i0(139861799);
                HeaderContent.HeaderText headerText = (HeaderContent.HeaderText) headerContent;
                if (ihc1.y0(headerText.getText().getText())) {
                    x340Var.i0(140274781);
                    x340Var.r(false);
                } else {
                    x340Var.i0(139911523);
                    String text = headerText.getText().getText();
                    long jP = v9p1.P(v9p1.F(messageTemplate, x340Var), headerText.getText().getTextColor());
                    uwr uwrVar = cbx.a;
                    q(text, jP, cbx.d(x340Var).k, djc0Var2, 2, null, i8, null, null, x340Var, ((i4 >> 3) & 7168) | ((i4 << 9) & 3670016), 416);
                    x340Var.r(false);
                }
                x340Var.r(false);
                z = true;
            } else {
                if (headerContent instanceof HeaderContent.Signifier) {
                    x340Var.i0(140337773);
                    HeaderContent.Signifier signifier = (HeaderContent.Signifier) headerContent;
                    if (ihc1.y0(signifier.getSignifier().getText())) {
                        z2 = false;
                        x340Var.i0(140867997);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(140403524);
                        Signifier signifier2 = signifier.getSignifier();
                        uwr uwrVar2 = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        z2 = false;
                        o(signifier2, messageTemplate, null, i8, 16.0f, v9p1.P(v9p1.G(messageTemplate, x340Var), signifier.getSignifier().getTextColor()), djc0Var2, cbx.d(x340Var).k, x340Var, ((i4 << 6) & 3670016) | Signifier.$stable | (i4 & 112) | (i4 & 7168), 4);
                        x340Var.r(false);
                    }
                    x340Var.r(z2);
                } else if (headerContent instanceof HeaderContent$Header) {
                    x340Var.i0(140917194);
                    g(((HeaderContent$Header) headerContent).getHeader(), messageTemplate, nim0.a, i8, djc0Var2, x340Var, Header.$stable | 384 | (i4 & 112) | (i4 & 7168) | (i4 & 57344));
                    x340Var.r(false);
                } else {
                    if (!(headerContent instanceof HeaderContent.NotSet)) {
                        throw p3d1.k(x340Var, 143058030, false);
                    }
                    x340Var.i0(141154747);
                    x340Var.r(false);
                }
                z = true;
            }
            x340Var.r(z);
            i5 = i8;
            zic0Var = djc0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kih(headerContent, messageTemplate, qim0Var, i5, zic0Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x0183  */
    /* JADX WARN: Code duplicated, block: B:121:0x0192  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ea A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    public static final void i(int i, int i2, int i3, int i4, MessageTemplate messageTemplate, MessageText messageText, String str, b0k b0kVar, iu30 iu30Var, djc0 djc0Var, qim0 qim0Var, lee1 lee1Var) {
        int i5;
        qim0 qim0Var2;
        djc0 djc0Var2;
        int i6;
        int i7;
        String str2;
        int i8;
        int i9;
        iu30 iu30Var2;
        int i10;
        boolean z;
        MessageTemplate messageTemplate2;
        b0k b0kVar2;
        qim0 qim0Var3;
        int i11;
        String str3;
        iu30 iu30Var3;
        int i12;
        h311 h311VarV;
        h9j0 h9j0Var;
        int i13;
        String str4;
        int i14;
        EncoreFont fontOverride;
        lee1 lee1VarS;
        int i15;
        int i16;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1064193992);
        if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? b0kVar3.g(messageText) : b0kVar3.i(messageText) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.i(messageTemplate) ? 32 : 16;
        }
        int i17 = i4 & 4;
        if (i17 == 0) {
            if ((i3 & 384) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 3072) != 0) {
                if (b0kVar3.i(lee1Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i5 |= i16;
            }
            if ((i3 & 24576) == 0) {
                djc0Var2 = djc0Var;
                if (b0kVar3.i(djc0Var2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i5 |= i15;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((196608 & i3) == 0) {
                i5 |= 65536;
            }
            if ((1572864 & i3) == 0) {
                if ((i4 & 64) == 0) {
                    i6 = i2;
                    int i18 = b0kVar3.e(i6) ? 1048576 : 524288;
                    i5 |= i18;
                } else {
                    i6 = i2;
                }
                i5 |= i18;
            } else {
                i6 = i2;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
                if ((12582912 & i3) == 0) {
                    str2 = str;
                    if (b0kVar3.g(str2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    if ((100663296 & i3) == 0) {
                        iu30Var2 = iu30Var;
                        if (b0kVar3.i(iu30Var2)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i5 |= i10;
                    }
                    if ((i5 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (b0kVar3.Y(i5 & 1, z)) {
                        b0kVar3.d0();
                        if ((i3 & 1) != 0 || b0kVar3.E()) {
                            if (i17 != 0) {
                                qim0Var2 = nim0.a;
                            }
                            i13 = i5 & (-458753);
                            if ((i4 & 64) != 0) {
                                i13 = i5 & (-4128769);
                                i6 = 3;
                            }
                            if (i7 != 0) {
                                str2 = "messaging_headline_tag";
                            }
                            i11 = i6;
                            str4 = str2;
                            if (i9 != 0) {
                                iu30Var2 = null;
                            }
                            i14 = 2;
                        } else {
                            b0kVar3.b0();
                            i13 = i5 & (-458753);
                            if ((i4 & 64) != 0) {
                                i13 = i5 & (-4128769);
                            }
                            i14 = i;
                            i11 = i6;
                            str4 = str2;
                        }
                        b0kVar3.s();
                        if (messageText.getText().length() == 0) {
                            h311VarV = b0kVar3.v();
                            if (h311VarV != null) {
                                return;
                            } else {
                                h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                            }
                        } else {
                            messageTemplate2 = messageTemplate;
                            String str5 = str4;
                            iu30 iu30Var4 = iu30Var2;
                            String text = messageText.getText();
                            int i19 = i13 >> 3;
                            long jP = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                            fontOverride = messageText.getFontOverride();
                            if (fontOverride == null) {
                                b0kVar3.i0(2045992918);
                                b0kVar3.r(false);
                                lee1VarS = null;
                            } else {
                                b0kVar3.i0(-488189557);
                                lee1VarS = s(fontOverride, b0kVar3);
                                b0kVar3.r(false);
                            }
                            if (lee1VarS == null) {
                                lee1VarS = lee1Var;
                            }
                            int i20 = (64512 & i19) | ((i13 << 9) & 458752) | (3670016 & i13) | (i19 & 29360128);
                            b0kVar2 = b0kVar3;
                            q(text, jP, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var4, str5, b0kVar2, ((i13 << 3) & 234881024) | i20, 0);
                            iu30Var3 = iu30Var4;
                            str3 = str5;
                            qim0Var3 = qim0Var2;
                            i12 = i14;
                        }
                        h311VarV.d = h9j0Var;
                    }
                    messageTemplate2 = messageTemplate;
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    qim0Var3 = qim0Var2;
                    i11 = i6;
                    str3 = str2;
                    iu30Var3 = iu30Var2;
                    i12 = i;
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                        h311VarV.d = h9j0Var;
                    }
                }
                i5 |= 100663296;
                iu30Var2 = iu30Var;
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String str6 = str4;
                        iu30 iu30Var5 = iu30Var2;
                        String text2 = messageText.getText();
                        int i110 = i13 >> 3;
                        long jP2 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(2045992918);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-488189557);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        int i21 = (64512 & i110) | ((i13 << 9) & 458752) | (3670016 & i13) | (i110 & 29360128);
                        b0kVar2 = b0kVar3;
                        q(text2, jP2, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var5, str6, b0kVar2, ((i13 << 3) & 234881024) | i21, 0);
                        iu30Var3 = iu30Var5;
                        str3 = str6;
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                str3 = str2;
                iu30Var3 = iu30Var2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 12582912;
            str2 = str;
            i9 = i4 & 256;
            if (i9 != 0) {
                if ((100663296 & i3) == 0) {
                    iu30Var2 = iu30Var;
                    if (b0kVar3.i(iu30Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String str7 = str4;
                        iu30 iu30Var6 = iu30Var2;
                        String text3 = messageText.getText();
                        int i111 = i13 >> 3;
                        long jP3 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(2045992918);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-488189557);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        int i22 = (64512 & i111) | ((i13 << 9) & 458752) | (3670016 & i13) | (i111 & 29360128);
                        b0kVar2 = b0kVar3;
                        q(text3, jP3, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var6, str7, b0kVar2, ((i13 << 3) & 234881024) | i22, 0);
                        iu30Var3 = iu30Var6;
                        str3 = str7;
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                str3 = str2;
                iu30Var3 = iu30Var2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 100663296;
            iu30Var2 = iu30Var;
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String str8 = str4;
                    iu30 iu30Var7 = iu30Var2;
                    String text4 = messageText.getText();
                    int i112 = i13 >> 3;
                    long jP4 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(2045992918);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-488189557);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    int i23 = (64512 & i112) | ((i13 << 9) & 458752) | (3670016 & i13) | (i112 & 29360128);
                    b0kVar2 = b0kVar3;
                    q(text4, jP4, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var7, str8, b0kVar2, ((i13 << 3) & 234881024) | i23, 0);
                    iu30Var3 = iu30Var7;
                    str3 = str8;
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            str3 = str2;
            iu30Var3 = iu30Var2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 3072) != 0) {
            if (b0kVar3.i(lee1Var)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i5 |= i16;
        }
        if ((i3 & 24576) == 0) {
            djc0Var2 = djc0Var;
            if (b0kVar3.i(djc0Var2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i5 |= i15;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((196608 & i3) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i3) == 0) {
            if ((i4 & 64) == 0) {
                i6 = i2;
                if (b0kVar3.e(i6)) {
                }
                i5 |= i18;
            } else {
                i6 = i2;
            }
            i5 |= i18;
        } else {
            i6 = i2;
        }
        i7 = i4 & 128;
        if (i7 != 0) {
            if ((12582912 & i3) == 0) {
                str2 = str;
                if (b0kVar3.g(str2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i5 |= i8;
            }
            i9 = i4 & 256;
            if (i9 != 0) {
                if ((100663296 & i3) == 0) {
                    iu30Var2 = iu30Var;
                    if (b0kVar3.i(iu30Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    } else {
                        if (i17 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        i13 = i5 & (-458753);
                        if ((i4 & 64) != 0) {
                            i13 = i5 & (-4128769);
                            i6 = 3;
                        }
                        if (i7 != 0) {
                            str2 = "messaging_headline_tag";
                        }
                        i11 = i6;
                        str4 = str2;
                        if (i9 != 0) {
                            iu30Var2 = null;
                        }
                        i14 = 2;
                    }
                    b0kVar3.s();
                    if (messageText.getText().length() == 0) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                        }
                    } else {
                        messageTemplate2 = messageTemplate;
                        String str9 = str4;
                        iu30 iu30Var8 = iu30Var2;
                        String text5 = messageText.getText();
                        int i113 = i13 >> 3;
                        long jP5 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                        fontOverride = messageText.getFontOverride();
                        if (fontOverride == null) {
                            b0kVar3.i0(2045992918);
                            b0kVar3.r(false);
                            lee1VarS = null;
                        } else {
                            b0kVar3.i0(-488189557);
                            lee1VarS = s(fontOverride, b0kVar3);
                            b0kVar3.r(false);
                        }
                        if (lee1VarS == null) {
                            lee1VarS = lee1Var;
                        }
                        int i24 = (64512 & i113) | ((i13 << 9) & 458752) | (3670016 & i13) | (i113 & 29360128);
                        b0kVar2 = b0kVar3;
                        q(text5, jP5, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var8, str9, b0kVar2, ((i13 << 3) & 234881024) | i24, 0);
                        iu30Var3 = iu30Var8;
                        str3 = str9;
                        qim0Var3 = qim0Var2;
                        i12 = i14;
                    }
                    h311VarV.d = h9j0Var;
                }
                messageTemplate2 = messageTemplate;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                i11 = i6;
                str3 = str2;
                iu30Var3 = iu30Var2;
                i12 = i;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                    h311VarV.d = h9j0Var;
                }
            }
            i5 |= 100663296;
            iu30Var2 = iu30Var;
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String str10 = str4;
                    iu30 iu30Var9 = iu30Var2;
                    String text6 = messageText.getText();
                    int i114 = i13 >> 3;
                    long jP6 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(2045992918);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-488189557);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    int i25 = (64512 & i114) | ((i13 << 9) & 458752) | (3670016 & i13) | (i114 & 29360128);
                    b0kVar2 = b0kVar3;
                    q(text6, jP6, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var9, str10, b0kVar2, ((i13 << 3) & 234881024) | i25, 0);
                    iu30Var3 = iu30Var9;
                    str3 = str10;
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            str3 = str2;
            iu30Var3 = iu30Var2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 12582912;
        str2 = str;
        i9 = i4 & 256;
        if (i9 != 0) {
            if ((100663296 & i3) == 0) {
                iu30Var2 = iu30Var;
                if (b0kVar3.i(iu30Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                } else {
                    if (i17 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    i13 = i5 & (-458753);
                    if ((i4 & 64) != 0) {
                        i13 = i5 & (-4128769);
                        i6 = 3;
                    }
                    if (i7 != 0) {
                        str2 = "messaging_headline_tag";
                    }
                    i11 = i6;
                    str4 = str2;
                    if (i9 != 0) {
                        iu30Var2 = null;
                    }
                    i14 = 2;
                }
                b0kVar3.s();
                if (messageText.getText().length() == 0) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                    }
                } else {
                    messageTemplate2 = messageTemplate;
                    String str11 = str4;
                    iu30 iu30Var10 = iu30Var2;
                    String text7 = messageText.getText();
                    int i115 = i13 >> 3;
                    long jP7 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                    fontOverride = messageText.getFontOverride();
                    if (fontOverride == null) {
                        b0kVar3.i0(2045992918);
                        b0kVar3.r(false);
                        lee1VarS = null;
                    } else {
                        b0kVar3.i0(-488189557);
                        lee1VarS = s(fontOverride, b0kVar3);
                        b0kVar3.r(false);
                    }
                    if (lee1VarS == null) {
                        lee1VarS = lee1Var;
                    }
                    int i26 = (64512 & i115) | ((i13 << 9) & 458752) | (3670016 & i13) | (i115 & 29360128);
                    b0kVar2 = b0kVar3;
                    q(text7, jP7, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var10, str11, b0kVar2, ((i13 << 3) & 234881024) | i26, 0);
                    iu30Var3 = iu30Var10;
                    str3 = str11;
                    qim0Var3 = qim0Var2;
                    i12 = i14;
                }
                h311VarV.d = h9j0Var;
            }
            messageTemplate2 = messageTemplate;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            i11 = i6;
            str3 = str2;
            iu30Var3 = iu30Var2;
            i12 = i;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
                h311VarV.d = h9j0Var;
            }
        }
        i5 |= 100663296;
        iu30Var2 = iu30Var;
        if ((i5 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i5 & 1, z)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0) {
                if (i17 != 0) {
                    qim0Var2 = nim0.a;
                }
                i13 = i5 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i5 & (-4128769);
                    i6 = 3;
                }
                if (i7 != 0) {
                    str2 = "messaging_headline_tag";
                }
                i11 = i6;
                str4 = str2;
                if (i9 != 0) {
                    iu30Var2 = null;
                }
                i14 = 2;
            } else {
                if (i17 != 0) {
                    qim0Var2 = nim0.a;
                }
                i13 = i5 & (-458753);
                if ((i4 & 64) != 0) {
                    i13 = i5 & (-4128769);
                    i6 = 3;
                }
                if (i7 != 0) {
                    str2 = "messaging_headline_tag";
                }
                i11 = i6;
                str4 = str2;
                if (i9 != 0) {
                    iu30Var2 = null;
                }
                i14 = 2;
            }
            b0kVar3.s();
            if (messageText.getText().length() == 0) {
                h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    return;
                } else {
                    h9j0Var = new h9j0(messageText, messageTemplate, qim0Var2, lee1Var, djc0Var2, i14, i11, str4, iu30Var2, i3, i4, (byte) 2);
                }
            } else {
                messageTemplate2 = messageTemplate;
                String str12 = str4;
                iu30 iu30Var11 = iu30Var2;
                String text8 = messageText.getText();
                int i116 = i13 >> 3;
                long jP8 = v9p1.P(v9p1.F(messageTemplate2, b0kVar3), messageText.getTextColor());
                fontOverride = messageText.getFontOverride();
                if (fontOverride == null) {
                    b0kVar3.i0(2045992918);
                    b0kVar3.r(false);
                    lee1VarS = null;
                } else {
                    b0kVar3.i0(-488189557);
                    lee1VarS = s(fontOverride, b0kVar3);
                    b0kVar3.r(false);
                }
                if (lee1VarS == null) {
                    lee1VarS = lee1Var;
                }
                int i27 = (64512 & i116) | ((i13 << 9) & 458752) | (3670016 & i13) | (i116 & 29360128);
                b0kVar2 = b0kVar3;
                q(text8, jP8, lee1VarS, djc0Var, i14, qim0Var2, i11, iu30Var11, str12, b0kVar2, ((i13 << 3) & 234881024) | i27, 0);
                iu30Var3 = iu30Var11;
                str3 = str12;
                qim0Var3 = qim0Var2;
                i12 = i14;
            }
            h311VarV.d = h9j0Var;
        }
        messageTemplate2 = messageTemplate;
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        qim0Var3 = qim0Var2;
        i11 = i6;
        str3 = str2;
        iu30Var3 = iu30Var2;
        i12 = i;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h9j0Var = new h9j0(messageText, messageTemplate2, qim0Var3, lee1Var, djc0Var, i12, i11, str3, iu30Var3, i3, i4, (byte) 3);
            h311VarV.d = h9j0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:82:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void j(int i, int i2, int i3, int i4, long j, MessageTemplate messageTemplate, String str, String str2, b0k b0kVar, iu30 iu30Var, djc0 djc0Var, qim0 qim0Var, lee1 lee1Var) {
        qim0 qim0Var2;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        iu30 iu30Var2;
        int i12;
        int i13;
        boolean z;
        int i14;
        String str3;
        iu30 iu30Var3;
        x340 x340Var;
        qim0 qim0Var3;
        long j3;
        h311 h311VarV;
        i9j0 i9j0Var;
        qim0 qim0Var4;
        long jF;
        iu30 iu30Var4;
        int i15;
        String str4;
        x340 x340Var2;
        int i16;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1437429933);
        int i17 = i3 | (x340Var3.g(str) ? 4 : 2) | (x340Var3.i(messageTemplate) ? 32 : 16);
        int i18 = i4 & 4;
        if (i18 != 0) {
            i5 = i17 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i17 | (x340Var3.i(qim0Var2) ? 256 : 128);
        }
        if ((i4 & 8) == 0) {
            j2 = j;
            int i19 = x340Var3.f(j2) ? 2048 : 1024;
            int i20 = i5 | i19;
            if (x340Var3.i(lee1Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            int i21 = i20 | i6;
            if (x340Var3.i(djc0Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            int i22 = i21 | i7 | 524288;
            if (x340Var3.e(i2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i9 = i22 | i8;
            i10 = i9 | 100663296;
            i11 = i4 & 512;
            if (i11 != 0) {
                i13 = i9 | 905969664;
                iu30Var2 = iu30Var;
            } else {
                iu30Var2 = iu30Var;
                if (x340Var3.i(iu30Var2)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i13 = i10 | i12;
            }
            if ((i13 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var3.Y(i13 & 1, z)) {
                x340Var3.d0();
                if ((i3 & 1) != 0 || x340Var3.E()) {
                    if (i18 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i4 & 8) != 0) {
                        jF = v9p1.F(messageTemplate, x340Var3);
                        i13 &= -7169;
                    } else {
                        jF = j2;
                    }
                    int i23 = i13 & (-3670017);
                    if (i11 != 0) {
                        iu30Var2 = null;
                    }
                    iu30Var4 = iu30Var2;
                    i15 = i23;
                    str4 = "messaging_headline_tag";
                    j2 = jF;
                    x340Var2 = x340Var3;
                    i16 = 2;
                } else {
                    x340Var3.b0();
                    if ((i4 & 8) != 0) {
                        i13 &= -7169;
                    }
                    iu30Var4 = iu30Var2;
                    i15 = i13 & (-3670017);
                    qim0Var4 = qim0Var2;
                    x340Var2 = x340Var3;
                    i16 = i;
                    str4 = str2;
                }
                x340Var2.s();
                if (str.length() == 0) {
                    h311VarV = x340Var2.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var, djc0Var, i16, i2, str4, iu30Var4, i3, i4, (byte) 2);
                    }
                } else {
                    long j4 = j2;
                    String str5 = str4;
                    iu30 iu30Var5 = iu30Var4;
                    int i24 = i15 >> 6;
                    qim0 qim0Var5 = qim0Var4;
                    x340 x340Var4 = x340Var2;
                    q(str, j4, lee1Var, djc0Var, i16, qim0Var5, i2, iu30Var5, str5, x340Var4, ((i15 >> 3) & 3670016) | (i15 & 14) | (i24 & 112) | (i24 & 896) | (i24 & 7168) | ((i15 << 9) & 458752) | (29360128 & i24) | 100663296, 0);
                    qim0Var3 = qim0Var5;
                    iu30Var3 = iu30Var5;
                    x340Var = x340Var4;
                    i14 = i16;
                    str3 = str5;
                    j3 = j4;
                }
                h311VarV.d = i9j0Var;
            }
            x340Var3.b0();
            i14 = i;
            str3 = str2;
            iu30Var3 = iu30Var2;
            x340Var = x340Var3;
            qim0Var3 = qim0Var2;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var, djc0Var, i14, i2, str3, iu30Var3, i3, i4, (byte) 3);
                h311VarV.d = i9j0Var;
            }
        }
        j2 = j;
        int i25 = i5 | i19;
        if (x340Var3.i(lee1Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i26 = i25 | i6;
        if (x340Var3.i(djc0Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i27 = i26 | i7 | 524288;
        if (x340Var3.e(i2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        i9 = i27 | i8;
        i10 = i9 | 100663296;
        i11 = i4 & 512;
        if (i11 != 0) {
            i13 = i9 | 905969664;
            iu30Var2 = iu30Var;
        } else {
            iu30Var2 = iu30Var;
            if (x340Var3.i(iu30Var2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i13 = i10 | i12;
        }
        if ((i13 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var3.Y(i13 & 1, z)) {
            x340Var3.d0();
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    jF = v9p1.F(messageTemplate, x340Var3);
                    i13 &= -7169;
                } else {
                    jF = j2;
                }
                int i28 = i13 & (-3670017);
                if (i11 != 0) {
                    iu30Var2 = null;
                }
                iu30Var4 = iu30Var2;
                i15 = i28;
                str4 = "messaging_headline_tag";
                j2 = jF;
                x340Var2 = x340Var3;
                i16 = 2;
            } else {
                if (i18 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i4 & 8) != 0) {
                    jF = v9p1.F(messageTemplate, x340Var3);
                    i13 &= -7169;
                } else {
                    jF = j2;
                }
                int i29 = i13 & (-3670017);
                if (i11 != 0) {
                    iu30Var2 = null;
                }
                iu30Var4 = iu30Var2;
                i15 = i29;
                str4 = "messaging_headline_tag";
                j2 = jF;
                x340Var2 = x340Var3;
                i16 = 2;
            }
            x340Var2.s();
            if (str.length() == 0) {
                h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    return;
                } else {
                    i9j0Var = new i9j0(str, messageTemplate, qim0Var4, j2, lee1Var, djc0Var, i16, i2, str4, iu30Var4, i3, i4, (byte) 2);
                }
            } else {
                long j5 = j2;
                String str6 = str4;
                iu30 iu30Var6 = iu30Var4;
                int i210 = i15 >> 6;
                qim0 qim0Var6 = qim0Var4;
                x340 x340Var5 = x340Var2;
                q(str, j5, lee1Var, djc0Var, i16, qim0Var6, i2, iu30Var6, str6, x340Var5, ((i15 >> 3) & 3670016) | (i15 & 14) | (i210 & 112) | (i210 & 896) | (i210 & 7168) | ((i15 << 9) & 458752) | (29360128 & i210) | 100663296, 0);
                qim0Var3 = qim0Var6;
                iu30Var3 = iu30Var6;
                x340Var = x340Var5;
                i14 = i16;
                str3 = str6;
                j3 = j5;
            }
            h311VarV.d = i9j0Var;
        }
        x340Var3.b0();
        i14 = i;
        str3 = str2;
        iu30Var3 = iu30Var2;
        x340Var = x340Var3;
        qim0Var3 = qim0Var2;
        j3 = j2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            i9j0Var = new i9j0(str, messageTemplate, qim0Var3, j3, lee1Var, djc0Var, i14, i2, str3, iu30Var3, i3, i4, (byte) 3);
            h311VarV.d = i9j0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0100  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void k(Icon icon, MessageTemplate messageTemplate, qim0 qim0Var, float f, ksl kslVar, long j, b0k b0kVar, int i, int i2) {
        int i3;
        ksl kslVar2;
        long jB;
        boolean z;
        b0k b0kVar2;
        float f2;
        qim0 qim0Var2;
        ksl kslVar3;
        long j2;
        h311 h311VarV;
        int i4;
        ksl kslVar4;
        int i5;
        qim0 qim0Var3;
        long j3;
        wsx wsxVar;
        h311 h311VarV2;
        int i6;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1307876172);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(icon) : b0kVar3.i(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(messageTemplate) ? 32 : 16;
        }
        int i7 = i3 | 384;
        if ((i & 3072) == 0) {
            i7 |= b0kVar3.d(f) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                kslVar2 = kslVar;
                i7 |= b0kVar3.g(kslVar2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                jB = j;
                if ((i2 & 32) == 0 || !b0kVar3.f(jB)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i7 |= i6;
            } else {
                jB = j;
            }
            if ((74899 & i7) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i7 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i8 != 0) {
                        kslVar2 = isl.a;
                    }
                    i4 = i2 & 32;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        jB = v9p1.B(messageTemplate, b0kVar3);
                        i7 &= -458753;
                    }
                    kslVar4 = kslVar2;
                    long j4 = jB;
                    i5 = i7;
                    qim0Var3 = qim0Var4;
                    j3 = j4;
                } else {
                    b0kVar3.b0();
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                    }
                    kslVar4 = kslVar2;
                    j3 = jB;
                    i5 = i7;
                    qim0Var3 = qim0Var;
                }
                b0kVar3.s();
                if (!IconKt.isValid(icon)) {
                    h311VarV2 = b0kVar3.v();
                    if (h311VarV2 != null) {
                        h311VarV2.d = new l9j0(icon, messageTemplate, qim0Var3, f, kslVar4, j3, i, i2, (byte) 0);
                        return;
                    }
                    return;
                }
                qim0 qim0Var5 = qim0Var3;
                f2 = f;
                ksl kslVar5 = kslVar4;
                long j5 = j3;
                switch (w9j0.a[icon.getIconName().ordinal()]) {
                    case 1:
                        wsxVar = gsx.c;
                        break;
                    case 2:
                        wsxVar = wsx.c;
                        break;
                    case 3:
                        wsxVar = fux.c;
                        break;
                    case 4:
                        wsxVar = cnx.c;
                        break;
                    case 5:
                        wsxVar = plx.c;
                        break;
                    case 6:
                        wsxVar = hnx.c;
                        break;
                    case 7:
                        wsxVar = omx.c;
                        break;
                    case 8:
                        wsxVar = lmx.c;
                        break;
                    case 9:
                        wsxVar = irx.c;
                        break;
                    case 10:
                        wsxVar = dnx.c;
                        break;
                    default:
                        wsxVar = wsx.c;
                        break;
                }
                b0kVar2 = b0kVar3;
                w0h1.a(wsxVar, kslVar5, anm1.N("messaging_icon_tag", u291.r(qim0Var5, f2)), v9p1.P(j5, icon.getColor()), 0L, false, b0kVar2, 8 | ((i5 >> 9) & 112), 48);
                kslVar3 = kslVar5;
                qim0Var2 = qim0Var5;
                j2 = j5;
            } else {
                b0kVar2 = b0kVar3;
                f2 = f;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
                kslVar3 = kslVar2;
                j2 = jB;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new l9j0(icon, messageTemplate, qim0Var2, f2, kslVar3, j2, i, i2, (byte) 1);
            }
        }
        i7 |= 24576;
        kslVar2 = kslVar;
        if ((196608 & i) == 0) {
            jB = j;
            if ((i2 & 32) == 0) {
                i6 = 65536;
            } else {
                i6 = 65536;
            }
            i7 |= i6;
        } else {
            jB = j;
        }
        if ((74899 & i7) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i7 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    kslVar2 = isl.a;
                }
                i4 = i2 & 32;
                qim0 qim0Var6 = nim0.a;
                if (i4 != 0) {
                    jB = v9p1.B(messageTemplate, b0kVar3);
                    i7 &= -458753;
                }
                kslVar4 = kslVar2;
                long j6 = jB;
                i5 = i7;
                qim0Var3 = qim0Var6;
                j3 = j6;
            } else {
                if (i8 != 0) {
                    kslVar2 = isl.a;
                }
                i4 = i2 & 32;
                qim0 qim0Var7 = nim0.a;
                if (i4 != 0) {
                    jB = v9p1.B(messageTemplate, b0kVar3);
                    i7 &= -458753;
                }
                kslVar4 = kslVar2;
                long j7 = jB;
                i5 = i7;
                qim0Var3 = qim0Var7;
                j3 = j7;
            }
            b0kVar3.s();
            if (!IconKt.isValid(icon)) {
                h311VarV2 = b0kVar3.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new l9j0(icon, messageTemplate, qim0Var3, f, kslVar4, j3, i, i2, (byte) 0);
                    return;
                }
                return;
            }
            qim0 qim0Var8 = qim0Var3;
            f2 = f;
            ksl kslVar6 = kslVar4;
            long j8 = j3;
            switch (w9j0.a[icon.getIconName().ordinal()]) {
                case 1:
                    wsxVar = gsx.c;
                    break;
                case 2:
                    wsxVar = wsx.c;
                    break;
                case 3:
                    wsxVar = fux.c;
                    break;
                case 4:
                    wsxVar = cnx.c;
                    break;
                case 5:
                    wsxVar = plx.c;
                    break;
                case 6:
                    wsxVar = hnx.c;
                    break;
                case 7:
                    wsxVar = omx.c;
                    break;
                case 8:
                    wsxVar = lmx.c;
                    break;
                case 9:
                    wsxVar = irx.c;
                    break;
                case 10:
                    wsxVar = dnx.c;
                    break;
                default:
                    wsxVar = wsx.c;
                    break;
            }
            b0kVar2 = b0kVar3;
            w0h1.a(wsxVar, kslVar6, anm1.N("messaging_icon_tag", u291.r(qim0Var8, f2)), v9p1.P(j8, icon.getColor()), 0L, false, b0kVar2, 8 | ((i5 >> 9) & 112), 48);
            kslVar3 = kslVar6;
            qim0Var2 = qim0Var8;
            j2 = j8;
        } else {
            b0kVar2 = b0kVar3;
            f2 = f;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            kslVar3 = kslVar2;
            j2 = jB;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l9j0(icon, messageTemplate, qim0Var2, f2, kslVar3, j2, i, i2, (byte) 1);
        }
    }

    public static final void l(hux huxVar, MessageTemplate messageTemplate, ksl kslVar, qim0 qim0Var, long j, float f, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        ksl kslVar2;
        long jE;
        b0k b0kVar2;
        float f2;
        long j2;
        float f3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1222559195);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(messageTemplate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            kslVar2 = kslVar;
            i3 |= b0kVar3.g(kslVar2) ? 256 : 128;
        } else {
            kslVar2 = kslVar;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jE = j;
                int i4 = b0kVar3.f(jE) ? 16384 : 8192;
                i3 |= i4;
            } else {
                jE = j;
            }
            i3 |= i4;
        } else {
            jE = j;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                if ((i2 & 16) != 0) {
                    jE = v9p1.E(messageTemplate, b0kVar3);
                }
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                j2 = jE;
                f3 = 16.0f;
            } else {
                b0kVar3.b0();
                j2 = jE;
                f3 = f;
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            wro1.h(new gbx(z50.c, function0), ldx.c, anm1.N("messaging_button_icon_tag", qim0Var), (max) null, yla.r(b0kVar3).a(), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(774756924, new nd6(huxVar, kslVar2, f3, j2), b0kVar3), b0kVar2, 0, 6, 920);
            f2 = f3;
            jE = j2;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f2 = f;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m9j0(huxVar, messageTemplate, kslVar, qim0Var, jE, f2, function0, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0209  */
    /* JADX WARN: Code duplicated, block: B:142:0x0233  */
    /* JADX WARN: Code duplicated, block: B:144:0x0236  */
    /* JADX WARN: Code duplicated, block: B:145:0x0238  */
    /* JADX WARN: Code duplicated, block: B:152:0x0247  */
    /* JADX WARN: Code duplicated, block: B:153:0x024c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0282  */
    /* JADX WARN: Code duplicated, block: B:157:0x0297  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    public static final void m(AccessoryImage accessoryImage, qim0 qim0Var, ksl kslVar, float f, ecx ecxVar, float f2, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        ksl kslVar2;
        int i5;
        float f3;
        boolean z;
        b0k b0kVar2;
        ecx ecxVar2;
        qim0 qim0Var3;
        ksl kslVar3;
        float f4;
        h311 h311VarV;
        n9j0 n9j0Var;
        ecx ecxVar3;
        int i6;
        qim0 qim0Var4;
        ksl kslVar4;
        float f5;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        int i7;
        boolean z2;
        Object objT2;
        iu30 iu30Var;
        boolean z3;
        Object objT3;
        iu30 iu30Var2;
        qim0 qim0Var5;
        float f6;
        ksl kslVar5;
        ImageStyle imageStyle;
        int[] iArr;
        as80 as80Var;
        boolean z4;
        zvx zvxVar;
        int i8;
        cr31 cr31VarB;
        int i9;
        int i10;
        boolean zI;
        ecx ecxVarA = ecxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(705778661);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(accessoryImage) : b0kVar3.i(accessoryImage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    kslVar2 = kslVar;
                    if (b0kVar3.g(kslVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        f3 = f;
                        int i12 = b0kVar3.d(f3) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        f3 = f;
                    }
                    i3 |= i12;
                } else {
                    f3 = f;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) != 0) {
                        i10 = 8192;
                    } else {
                        if ((32768 & i) == 0) {
                            zI = b0kVar3.g(ecxVarA);
                        } else {
                            zI = b0kVar3.i(ecxVarA);
                        }
                        if (zI) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                    }
                    i3 |= i10;
                }
                if ((196608 & i) == 0) {
                    if (b0kVar3.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i11 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i4 != 0) {
                            kslVar2 = isl.a;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(b0kVar3).g;
                            i3 &= -7169;
                            f3 = 16.0f;
                        }
                        if ((i2 & 16) != 0) {
                            cbx.a.getClass();
                            ecxVarA = uwr.a();
                            i3 &= -57345;
                        }
                        h311VarV.d = n9j0Var;
                    }
                    b0kVar3.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    ecxVar3 = ecxVarA;
                    i6 = i3;
                    qim0Var4 = qim0Var2;
                    kslVar4 = kslVar2;
                    f5 = f3;
                    b0kVar3.s();
                    if (ihc1.y0(accessoryImage.getImageUrl())) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            return;
                        } else {
                            n9j0Var = new n9j0(accessoryImage, qim0Var4, kslVar4, f5, ecxVar3, f2, i, i2, (byte) 0);
                        }
                    } else {
                        objT = b0kVar3.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = v8r.q(Boolean.TRUE);
                            b0kVar3.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        i7 = i6 & 14;
                        if (i7 != 4 || ((i6 & 8) != 0 && b0kVar3.g(accessoryImage))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = b0kVar3.T();
                        if (z2 || objT2 == m4cVar) {
                            objT2 = new abh0(ven0Var, (byte) 11);
                            b0kVar3.s0(objT2);
                        }
                        iu30Var = (iu30) objT2;
                        if (i7 != 4 || ((i6 & 8) != 0 && b0kVar3.g(accessoryImage))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objT3 = b0kVar3.T();
                        if (z3 || objT3 == m4cVar) {
                            objT3 = new abh0(ven0Var, (byte) 10);
                            b0kVar3.s0(objT3);
                        }
                        iu30Var2 = (iu30) objT3;
                        if (((Boolean) ven0Var.getValue()).booleanValue()) {
                            b0kVar3.i0(1987899380);
                            b0kVar2 = b0kVar3;
                            ni7 ni7VarA = oi7.a(Uri.parse(accessoryImage.getImageUrl()), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, iu30Var, iu30Var2, (iu30) null, 0L, b0kVar2, 0, 0, 118782);
                            imageStyle = accessoryImage.getImageStyle();
                            iArr = w9j0.b;
                            if (iArr[imageStyle.ordinal()] == 1) {
                                as80Var = mif1.P0;
                            } else {
                                as80Var = mif1.Q0;
                            }
                            as80 as80Var2 = as80Var;
                            if (p3v.c(f2, 0.0f)) {
                                b0kVar2.i0(1988189571);
                                z4 = false;
                                b0kVar2.r(false);
                                zvxVar = null;
                            } else {
                                z4 = false;
                                b0kVar2.i0(-351505300);
                                uwr uwrVar2 = cbx.a;
                                cua cuaVar = cbx.b(b0kVar2).f;
                                cua cuaVar2 = cbx.b(b0kVar2).f;
                                zvxVar = new zvx();
                                b0kVar2.r(false);
                            }
                            i8 = iArr[accessoryImage.getImageStyle().ordinal()];
                            if (i8 != 1) {
                                cr31VarB = er31.a;
                            } else if (i8 == 2) {
                                cr31VarB = er31.b(f2);
                            } else {
                                if (i8 == 3 && i8 != 4) {
                                    eg.o();
                                    return;
                                }
                                cr31VarB = er31.b(0.0f);
                            }
                            qim0Var5 = qim0Var4;
                            f6 = f5;
                            zvx zvxVar2 = zvxVar;
                            kslVar5 = kslVar4;
                            ecxVar2 = ecxVar3;
                            eso1.h(ni7VarA, kslVar5, anm1.N("messaging_image_tag", i1p1.q(qim0Var5, cr31VarB)), new p3v(f6), zvxVar2, ecxVar2, as80Var2, (tl3) null, (ColorFilter) null, b0kVar2, ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 << 3) & 458752), 384);
                            b0kVar2.r(z4);
                        } else {
                            qim0Var5 = qim0Var4;
                            f6 = f5;
                            kslVar5 = kslVar4;
                            ecxVar2 = ecxVar3;
                            b0kVar2 = b0kVar3;
                            b0kVar2.i0(1988404029);
                            b0kVar2.r(false);
                        }
                        kslVar3 = kslVar5;
                        qim0Var3 = qim0Var5;
                        f4 = f6;
                    }
                    h311VarV.d = n9j0Var;
                }
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                ecxVar2 = ecxVarA;
                qim0Var3 = qim0Var2;
                kslVar3 = kslVar2;
                f4 = f3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    n9j0Var = new n9j0(accessoryImage, qim0Var3, kslVar3, f4, ecxVar2, f2, i, i2, (byte) 1);
                    h311VarV.d = n9j0Var;
                }
            }
            i3 |= 384;
            kslVar2 = kslVar;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (b0kVar3.d(f3)) {
                    }
                    i3 |= i12;
                } else {
                    f3 = f;
                }
                i3 |= i12;
            } else {
                f3 = f;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i10 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI = b0kVar3.g(ecxVarA);
                    } else {
                        zI = b0kVar3.i(ecxVarA);
                    }
                    if (zI) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                }
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        kslVar2 = isl.a;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var2 = cbx.b(b0kVar3).g;
                        i3 &= -7169;
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -57345;
                    }
                    h311VarV.d = n9j0Var;
                }
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    kslVar2 = isl.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar4 = cbx.a;
                    zov0 zov0Var3 = cbx.b(b0kVar3).g;
                    i3 &= -7169;
                    f3 = 16.0f;
                }
                if ((i2 & 16) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -57345;
                }
                h311VarV.d = n9j0Var;
                ecxVar3 = ecxVarA;
                i6 = i3;
                qim0Var4 = qim0Var2;
                kslVar4 = kslVar2;
                f5 = f3;
                b0kVar3.s();
                if (ihc1.y0(accessoryImage.getImageUrl())) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        n9j0Var = new n9j0(accessoryImage, qim0Var4, kslVar4, f5, ecxVar3, f2, i, i2, (byte) 0);
                    }
                } else {
                    objT = b0kVar3.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.TRUE);
                        b0kVar3.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    i7 = i6 & 14;
                    if (i7 != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objT2 = b0kVar3.T();
                    if (z2) {
                        objT2 = new abh0(ven0Var, (byte) 11);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new abh0(ven0Var, (byte) 11);
                        b0kVar3.s0(objT2);
                    }
                    iu30Var = (iu30) objT2;
                    if (i7 != 4) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    objT3 = b0kVar3.T();
                    if (z3) {
                        objT3 = new abh0(ven0Var, (byte) 10);
                        b0kVar3.s0(objT3);
                    } else {
                        objT3 = new abh0(ven0Var, (byte) 10);
                        b0kVar3.s0(objT3);
                    }
                    iu30Var2 = (iu30) objT3;
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        b0kVar3.i0(1987899380);
                        b0kVar2 = b0kVar3;
                        ni7 ni7VarA2 = oi7.a(Uri.parse(accessoryImage.getImageUrl()), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, iu30Var, iu30Var2, (iu30) null, 0L, b0kVar2, 0, 0, 118782);
                        imageStyle = accessoryImage.getImageStyle();
                        iArr = w9j0.b;
                        if (iArr[imageStyle.ordinal()] == 1) {
                            as80Var = mif1.P0;
                        } else {
                            as80Var = mif1.Q0;
                        }
                        as80 as80Var3 = as80Var;
                        if (p3v.c(f2, 0.0f)) {
                            b0kVar2.i0(1988189571);
                            z4 = false;
                            b0kVar2.r(false);
                            zvxVar = null;
                        } else {
                            z4 = false;
                            b0kVar2.i0(-351505300);
                            uwr uwrVar5 = cbx.a;
                            cua cuaVar3 = cbx.b(b0kVar2).f;
                            cua cuaVar4 = cbx.b(b0kVar2).f;
                            zvxVar = new zvx();
                            b0kVar2.r(false);
                        }
                        i8 = iArr[accessoryImage.getImageStyle().ordinal()];
                        if (i8 != 1) {
                            cr31VarB = er31.a;
                        } else if (i8 == 2) {
                            if (i8 == 3) {
                            }
                            cr31VarB = er31.b(0.0f);
                        } else {
                            cr31VarB = er31.b(f2);
                        }
                        qim0Var5 = qim0Var4;
                        f6 = f5;
                        zvx zvxVar3 = zvxVar;
                        kslVar5 = kslVar4;
                        ecxVar2 = ecxVar3;
                        eso1.h(ni7VarA2, kslVar5, anm1.N("messaging_image_tag", i1p1.q(qim0Var5, cr31VarB)), new p3v(f6), zvxVar3, ecxVar2, as80Var3, (tl3) null, (ColorFilter) null, b0kVar2, ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 << 3) & 458752), 384);
                        b0kVar2.r(z4);
                    } else {
                        qim0Var5 = qim0Var4;
                        f6 = f5;
                        kslVar5 = kslVar4;
                        ecxVar2 = ecxVar3;
                        b0kVar2 = b0kVar3;
                        b0kVar2.i0(1988404029);
                        b0kVar2.r(false);
                    }
                    kslVar3 = kslVar5;
                    qim0Var3 = qim0Var5;
                    f4 = f6;
                }
                h311VarV.d = n9j0Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            ecxVar2 = ecxVarA;
            qim0Var3 = qim0Var2;
            kslVar3 = kslVar2;
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                n9j0Var = new n9j0(accessoryImage, qim0Var3, kslVar3, f4, ecxVar2, f2, i, i2, (byte) 1);
                h311VarV.d = n9j0Var;
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                kslVar2 = kslVar;
                if (b0kVar3.g(kslVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    f3 = f;
                    if (b0kVar3.d(f3)) {
                    }
                    i3 |= i12;
                } else {
                    f3 = f;
                }
                i3 |= i12;
            } else {
                f3 = f;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i10 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI = b0kVar3.g(ecxVarA);
                    } else {
                        zI = b0kVar3.i(ecxVarA);
                    }
                    if (zI) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                }
                i3 |= i10;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i4 != 0) {
                        kslVar2 = isl.a;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar6 = cbx.a;
                        zov0 zov0Var4 = cbx.b(b0kVar3).g;
                        i3 &= -7169;
                        f3 = 16.0f;
                    }
                    if ((i2 & 16) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -57345;
                    }
                    h311VarV.d = n9j0Var;
                }
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    kslVar2 = isl.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar7 = cbx.a;
                    zov0 zov0Var5 = cbx.b(b0kVar3).g;
                    i3 &= -7169;
                    f3 = 16.0f;
                }
                if ((i2 & 16) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -57345;
                }
                h311VarV.d = n9j0Var;
                ecxVar3 = ecxVarA;
                i6 = i3;
                qim0Var4 = qim0Var2;
                kslVar4 = kslVar2;
                f5 = f3;
                b0kVar3.s();
                if (ihc1.y0(accessoryImage.getImageUrl())) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV != null) {
                        return;
                    } else {
                        n9j0Var = new n9j0(accessoryImage, qim0Var4, kslVar4, f5, ecxVar3, f2, i, i2, (byte) 0);
                    }
                } else {
                    objT = b0kVar3.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.TRUE);
                        b0kVar3.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    i7 = i6 & 14;
                    if (i7 != 4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    objT2 = b0kVar3.T();
                    if (z2) {
                        objT2 = new abh0(ven0Var, (byte) 11);
                        b0kVar3.s0(objT2);
                    } else {
                        objT2 = new abh0(ven0Var, (byte) 11);
                        b0kVar3.s0(objT2);
                    }
                    iu30Var = (iu30) objT2;
                    if (i7 != 4) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    objT3 = b0kVar3.T();
                    if (z3) {
                        objT3 = new abh0(ven0Var, (byte) 10);
                        b0kVar3.s0(objT3);
                    } else {
                        objT3 = new abh0(ven0Var, (byte) 10);
                        b0kVar3.s0(objT3);
                    }
                    iu30Var2 = (iu30) objT3;
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        b0kVar3.i0(1987899380);
                        b0kVar2 = b0kVar3;
                        ni7 ni7VarA3 = oi7.a(Uri.parse(accessoryImage.getImageUrl()), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, iu30Var, iu30Var2, (iu30) null, 0L, b0kVar2, 0, 0, 118782);
                        imageStyle = accessoryImage.getImageStyle();
                        iArr = w9j0.b;
                        if (iArr[imageStyle.ordinal()] == 1) {
                            as80Var = mif1.P0;
                        } else {
                            as80Var = mif1.Q0;
                        }
                        as80 as80Var4 = as80Var;
                        if (p3v.c(f2, 0.0f)) {
                            b0kVar2.i0(1988189571);
                            z4 = false;
                            b0kVar2.r(false);
                            zvxVar = null;
                        } else {
                            z4 = false;
                            b0kVar2.i0(-351505300);
                            uwr uwrVar8 = cbx.a;
                            cua cuaVar5 = cbx.b(b0kVar2).f;
                            cua cuaVar6 = cbx.b(b0kVar2).f;
                            zvxVar = new zvx();
                            b0kVar2.r(false);
                        }
                        i8 = iArr[accessoryImage.getImageStyle().ordinal()];
                        if (i8 != 1) {
                            cr31VarB = er31.a;
                        } else if (i8 == 2) {
                            if (i8 == 3) {
                            }
                            cr31VarB = er31.b(0.0f);
                        } else {
                            cr31VarB = er31.b(f2);
                        }
                        qim0Var5 = qim0Var4;
                        f6 = f5;
                        zvx zvxVar4 = zvxVar;
                        kslVar5 = kslVar4;
                        ecxVar2 = ecxVar3;
                        eso1.h(ni7VarA3, kslVar5, anm1.N("messaging_image_tag", i1p1.q(qim0Var5, cr31VarB)), new p3v(f6), zvxVar4, ecxVar2, as80Var4, (tl3) null, (ColorFilter) null, b0kVar2, ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 << 3) & 458752), 384);
                        b0kVar2.r(z4);
                    } else {
                        qim0Var5 = qim0Var4;
                        f6 = f5;
                        kslVar5 = kslVar4;
                        ecxVar2 = ecxVar3;
                        b0kVar2 = b0kVar3;
                        b0kVar2.i0(1988404029);
                        b0kVar2.r(false);
                    }
                    kslVar3 = kslVar5;
                    qim0Var3 = qim0Var5;
                    f4 = f6;
                }
                h311VarV.d = n9j0Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            ecxVar2 = ecxVarA;
            qim0Var3 = qim0Var2;
            kslVar3 = kslVar2;
            f4 = f3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                n9j0Var = new n9j0(accessoryImage, qim0Var3, kslVar3, f4, ecxVar2, f2, i, i2, (byte) 1);
                h311VarV.d = n9j0Var;
            }
        }
        i3 |= 384;
        kslVar2 = kslVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f;
                if (b0kVar3.d(f3)) {
                }
                i3 |= i12;
            } else {
                f3 = f;
            }
            i3 |= i12;
        } else {
            f3 = f;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i10 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI = b0kVar3.g(ecxVarA);
                } else {
                    zI = b0kVar3.i(ecxVarA);
                }
                if (zI) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
            }
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if (b0kVar3.d(f2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i4 != 0) {
                    kslVar2 = isl.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar9 = cbx.a;
                    zov0 zov0Var6 = cbx.b(b0kVar3).g;
                    i3 &= -7169;
                    f3 = 16.0f;
                }
                if ((i2 & 16) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -57345;
                }
                h311VarV.d = n9j0Var;
            }
            if (i11 != 0) {
                qim0Var2 = nim0.a;
            }
            if (i4 != 0) {
                kslVar2 = isl.a;
            }
            if ((i2 & 8) != 0) {
                uwr uwrVar10 = cbx.a;
                zov0 zov0Var7 = cbx.b(b0kVar3).g;
                i3 &= -7169;
                f3 = 16.0f;
            }
            if ((i2 & 16) != 0) {
                cbx.a.getClass();
                ecxVarA = uwr.a();
                i3 &= -57345;
            }
            h311VarV.d = n9j0Var;
            ecxVar3 = ecxVarA;
            i6 = i3;
            qim0Var4 = qim0Var2;
            kslVar4 = kslVar2;
            f5 = f3;
            b0kVar3.s();
            if (ihc1.y0(accessoryImage.getImageUrl())) {
                h311VarV = b0kVar3.v();
                if (h311VarV != null) {
                    return;
                } else {
                    n9j0Var = new n9j0(accessoryImage, qim0Var4, kslVar4, f5, ecxVar3, f2, i, i2, (byte) 0);
                }
            } else {
                objT = b0kVar3.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.TRUE);
                    b0kVar3.s0(objT);
                }
                ven0Var = (ven0) objT;
                i7 = i6 & 14;
                if (i7 != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objT2 = b0kVar3.T();
                if (z2) {
                    objT2 = new abh0(ven0Var, (byte) 11);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new abh0(ven0Var, (byte) 11);
                    b0kVar3.s0(objT2);
                }
                iu30Var = (iu30) objT2;
                if (i7 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                objT3 = b0kVar3.T();
                if (z3) {
                    objT3 = new abh0(ven0Var, (byte) 10);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new abh0(ven0Var, (byte) 10);
                    b0kVar3.s0(objT3);
                }
                iu30Var2 = (iu30) objT3;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    b0kVar3.i0(1987899380);
                    b0kVar2 = b0kVar3;
                    ni7 ni7VarA4 = oi7.a(Uri.parse(accessoryImage.getImageUrl()), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, iu30Var, iu30Var2, (iu30) null, 0L, b0kVar2, 0, 0, 118782);
                    imageStyle = accessoryImage.getImageStyle();
                    iArr = w9j0.b;
                    if (iArr[imageStyle.ordinal()] == 1) {
                        as80Var = mif1.P0;
                    } else {
                        as80Var = mif1.Q0;
                    }
                    as80 as80Var5 = as80Var;
                    if (p3v.c(f2, 0.0f)) {
                        b0kVar2.i0(1988189571);
                        z4 = false;
                        b0kVar2.r(false);
                        zvxVar = null;
                    } else {
                        z4 = false;
                        b0kVar2.i0(-351505300);
                        uwr uwrVar11 = cbx.a;
                        cua cuaVar7 = cbx.b(b0kVar2).f;
                        cua cuaVar8 = cbx.b(b0kVar2).f;
                        zvxVar = new zvx();
                        b0kVar2.r(false);
                    }
                    i8 = iArr[accessoryImage.getImageStyle().ordinal()];
                    if (i8 != 1) {
                        cr31VarB = er31.a;
                    } else if (i8 == 2) {
                        if (i8 == 3) {
                        }
                        cr31VarB = er31.b(0.0f);
                    } else {
                        cr31VarB = er31.b(f2);
                    }
                    qim0Var5 = qim0Var4;
                    f6 = f5;
                    zvx zvxVar5 = zvxVar;
                    kslVar5 = kslVar4;
                    ecxVar2 = ecxVar3;
                    eso1.h(ni7VarA4, kslVar5, anm1.N("messaging_image_tag", i1p1.q(qim0Var5, cr31VarB)), new p3v(f6), zvxVar5, ecxVar2, as80Var5, (tl3) null, (ColorFilter) null, b0kVar2, ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 << 3) & 458752), 384);
                    b0kVar2.r(z4);
                } else {
                    qim0Var5 = qim0Var4;
                    f6 = f5;
                    kslVar5 = kslVar4;
                    ecxVar2 = ecxVar3;
                    b0kVar2 = b0kVar3;
                    b0kVar2.i0(1988404029);
                    b0kVar2.r(false);
                }
                kslVar3 = kslVar5;
                qim0Var3 = qim0Var5;
                f4 = f6;
            }
            h311VarV.d = n9j0Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        ecxVar2 = ecxVarA;
        qim0Var3 = qim0Var2;
        kslVar3 = kslVar2;
        f4 = f3;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            n9j0Var = new n9j0(accessoryImage, qim0Var3, kslVar3, f4, ecxVar2, f2, i, i2, (byte) 1);
            h311VarV.d = n9j0Var;
        }
    }

    public static final void n(Button button, MessageTemplate messageTemplate, qim0 qim0Var, int i, gdx gdxVar, vzq0 vzq0Var, vu30 vu30Var, vu30 vu30Var2, djc0 djc0Var, hw61 hw61Var, Function0 function0, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        gdx gdxVar2;
        vzq0 vzq0Var2;
        int i6;
        vu30 vu30Var3;
        vu30 vu30Var4;
        h311 h311VarV;
        p9j0 p9j0Var;
        vu30 o9j0Var;
        vu30 vu30Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(4716284);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 = i;
            i4 |= x340Var.e(i5) ? 2048 : 1024;
        } else {
            i5 = i;
        }
        if ((i2 & 24576) == 0) {
            gdxVar2 = gdxVar;
            i4 |= x340Var.i(gdxVar2) ? 16384 : 8192;
        } else {
            gdxVar2 = gdxVar;
        }
        if ((196608 & i2) == 0) {
            vzq0Var2 = vzq0Var;
            i4 |= x340Var.i(vzq0Var2) ? 131072 : 65536;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= x340Var.i(djc0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= x340Var.i(hw61Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (x340Var.i(function0) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (x340Var.Y(i4 & 1, ((306783379 & i4) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                o9j0 o9j0Var2 = new o9j0(messageTemplate, (byte) 0);
                o9j0Var = new o9j0(messageTemplate, (byte) 1);
                vu30Var5 = o9j0Var2;
            } else {
                x340Var.b0();
                vu30Var5 = vu30Var;
                o9j0Var = vu30Var2;
            }
            x340Var.s();
            if (ihc1.y0(button.getStyle().getText())) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    p9j0Var = new p9j0(button, messageTemplate, qim0Var, i5, gdxVar2, vzq0Var2, vu30Var5, o9j0Var, djc0Var, hw61Var, function0, i2, i3, (byte) 0);
                }
            } else {
                vu30 vu30Var6 = vu30Var5;
                gfx.b(4, apo.r(-1603400473, new r9j0(button, vu30Var6, o9j0Var, hw61Var, messageTemplate, gdxVar, vzq0Var, qim0Var, i, djc0Var, function0), x340Var), x340Var, 54);
                vu30Var3 = vu30Var6;
                vu30Var4 = o9j0Var;
            }
            h311VarV.d = p9j0Var;
        }
        x340Var.b0();
        vu30Var3 = vu30Var;
        vu30Var4 = vu30Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            p9j0Var = new p9j0(button, messageTemplate, qim0Var, i, gdxVar, vzq0Var, vu30Var3, vu30Var4, djc0Var, hw61Var, function0, i2, i3, (byte) 1);
            h311VarV.d = p9j0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x012f A[PHI: r0 r4 r5 r6 r7 r9
      0x012f: PHI (r0v29 int) = (r0v17 int), (r0v33 int), (r0v34 int) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r4v16 p.qim0) = (r4v5 p.qim0), (r4v2 p.qim0), (r4v2 p.qim0) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r5v16 int) = (r5v9 int), (r5v6 int), (r5v6 int) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r6v14 float) = (r6v5 float), (r6v2 float), (r6v2 float) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r7v10 long) = (r7v4 long), (r7v3 long), (r7v3 long) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]
      0x012f: PHI (r9v18 p.djc0) = (r9v6 p.djc0), (r9v3 p.djc0), (r9v3 p.djc0) binds: [B:128:0x016c, B:110:0x012c, B:111:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x013f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0147  */
    /* JADX WARN: Code duplicated, block: B:123:0x0158  */
    /* JADX WARN: Code duplicated, block: B:126:0x0162  */
    /* JADX WARN: Code duplicated, block: B:129:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x026c  */
    /* JADX WARN: Code duplicated, block: B:146:0x027b  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00de  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    public static final void o(Signifier signifier, MessageTemplate messageTemplate, qim0 qim0Var, int i, float f, long j, djc0 djc0Var, lee1 lee1Var, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        float f2;
        long jG;
        djc0 zic0Var;
        lee1 lee1Var2;
        boolean z;
        qim0 qim0Var3;
        int i6;
        float f3;
        long j2;
        djc0 djc0Var2;
        lee1 lee1Var3;
        h311 h311VarV;
        s9j0 s9j0Var;
        qim0 qim0Var4;
        int i7;
        float f4;
        long j3;
        djc0 djc0Var3;
        lee1 lee1Var4;
        ye5 ye5Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2004337892);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(signifier) : x340Var.i(signifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    i5 = i;
                    int i9 = x340Var.e(i5) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    i5 = i;
                }
                i4 |= i9;
            } else {
                i5 = i;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    f2 = f;
                    int i10 = x340Var.d(f2) ? 16384 : 8192;
                    i4 |= i10;
                } else {
                    f2 = f;
                }
                i4 |= i10;
            } else {
                f2 = f;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    jG = j;
                    int i11 = x340Var.f(jG) ? 131072 : 65536;
                    i4 |= i11;
                } else {
                    jG = j;
                }
                i4 |= i11;
            } else {
                jG = j;
            }
            if ((1572864 & i2) == 0) {
                if ((i3 & 64) == 0) {
                    zic0Var = djc0Var;
                    int i12 = x340Var.i(zic0Var) ? 1048576 : 524288;
                    i4 |= i12;
                } else {
                    zic0Var = djc0Var;
                }
                i4 |= i12;
            } else {
                zic0Var = djc0Var;
            }
            if ((12582912 & i2) == 0) {
                if ((i3 & 128) == 0) {
                    lee1Var2 = lee1Var;
                    int i13 = x340Var.i(lee1Var2) ? 8388608 : 4194304;
                    i4 |= i13;
                } else {
                    lee1Var2 = lee1Var;
                }
                i4 |= i13;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if (i8 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                        i5 = 3;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        i4 &= -57345;
                        f2 = 16.0f;
                    }
                    if ((i3 & 32) != 0) {
                        jG = v9p1.G(messageTemplate, x340Var);
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                        zic0Var = new zic0(1);
                    }
                    if ((i3 & 128) != 0) {
                        uwr uwrVar2 = cbx.a;
                        i4 &= -29360129;
                        qim0Var4 = qim0Var2;
                        i7 = i5;
                        f4 = f2;
                        j3 = jG;
                        djc0Var3 = zic0Var;
                        lee1Var4 = cbx.d(x340Var).k;
                    }
                    x340Var.s();
                    if (signifier.getText().length() == 0 || IconKt.isValid(signifier.getIcon())) {
                        qim0 qim0Var5 = qim0Var4;
                        int i14 = i7;
                        lee1 lee1Var5 = lee1Var4;
                        ye5Var = new ye5();
                        if (IconKt.isValid(signifier.getIcon())) {
                            z6p1.s(ye5Var, "icon");
                        }
                        ye5Var.g(signifier.getText());
                        af5 af5VarP = ye5Var.p();
                        long jP = v9p1.P(j3, signifier.getTextColor());
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        float f5 = f4;
                        long j4 = j3;
                        djc0 djc0Var4 = djc0Var3;
                        uwo1.d(af5VarP, jP, anm1.N("messaging_signifier_tag", qim0Var5), lee1Var5, new a0e1(i14), (iu30) null, 2, false, djc0Var4, 0, (qx8) null, mqo1.t(new mmr0[]{new mmr0("icon", new gh80(new d6t0(4, fc11.Y(4.0f + f4, 4294967296L), fc11.Y(f4, 4294967296L)), apo.r(1981675991, new t9j0(signifier, messageTemplate, f5, j4), x340Var)))}), x340Var, ((i4 >> 12) & 7168) | ((i4 << 3) & 57344) | ((i4 << 6) & 234881024), 0, 1696);
                        djc0Var2 = djc0Var4;
                        lee1Var3 = lee1Var5;
                        f3 = f5;
                        j2 = j4;
                        qim0Var3 = qim0Var5;
                        i6 = i14;
                    } else {
                        h311VarV = x340Var.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            s9j0Var = new s9j0(signifier, messageTemplate, qim0Var4, i7, f4, j3, djc0Var3, lee1Var4, i2, i3, (byte) 0);
                        }
                    }
                    h311VarV.d = s9j0Var;
                }
                x340Var.b0();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                }
                qim0Var4 = qim0Var2;
                i7 = i5;
                f4 = f2;
                j3 = jG;
                djc0Var3 = zic0Var;
                lee1Var4 = lee1Var2;
                x340Var.s();
                if (signifier.getText().length() == 0) {
                }
                qim0 qim0Var6 = qim0Var4;
                int i15 = i7;
                lee1 lee1Var6 = lee1Var4;
                ye5Var = new ye5();
                if (IconKt.isValid(signifier.getIcon())) {
                    z6p1.s(ye5Var, "icon");
                }
                ye5Var.g(signifier.getText());
                af5 af5VarP2 = ye5Var.p();
                long jP2 = v9p1.P(j3, signifier.getTextColor());
                uwr uwrVar4 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                float f6 = f4;
                long j5 = j3;
                djc0 djc0Var5 = djc0Var3;
                uwo1.d(af5VarP2, jP2, anm1.N("messaging_signifier_tag", qim0Var6), lee1Var6, new a0e1(i15), (iu30) null, 2, false, djc0Var5, 0, (qx8) null, mqo1.t(new mmr0[]{new mmr0("icon", new gh80(new d6t0(4, fc11.Y(4.0f + f4, 4294967296L), fc11.Y(f4, 4294967296L)), apo.r(1981675991, new t9j0(signifier, messageTemplate, f6, j5), x340Var)))}), x340Var, ((i4 >> 12) & 7168) | ((i4 << 3) & 57344) | ((i4 << 6) & 234881024), 0, 1696);
                djc0Var2 = djc0Var5;
                lee1Var3 = lee1Var6;
                f3 = f6;
                j2 = j5;
                qim0Var3 = qim0Var6;
                i6 = i15;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                i6 = i5;
                f3 = f2;
                j2 = jG;
                djc0Var2 = zic0Var;
                lee1Var3 = lee1Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                s9j0Var = new s9j0(signifier, messageTemplate, qim0Var3, i6, f3, j2, djc0Var2, lee1Var3, i2, i3, (byte) 1);
                h311VarV.d = s9j0Var;
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                i5 = i;
                if (x340Var.e(i5)) {
                }
                i4 |= i9;
            } else {
                i5 = i;
            }
            i4 |= i9;
        } else {
            i5 = i;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                }
                i4 |= i10;
            } else {
                f2 = f;
            }
            i4 |= i10;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                jG = j;
                if (x340Var.f(jG)) {
                }
                i4 |= i11;
            } else {
                jG = j;
            }
            i4 |= i11;
        } else {
            jG = j;
        }
        if ((1572864 & i2) == 0) {
            if ((i3 & 64) == 0) {
                zic0Var = djc0Var;
                if (x340Var.i(zic0Var)) {
                }
                i4 |= i12;
            } else {
                zic0Var = djc0Var;
            }
            i4 |= i12;
        } else {
            zic0Var = djc0Var;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                }
                i4 |= i13;
            } else {
                lee1Var2 = lee1Var;
            }
            i4 |= i13;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i5 = 3;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    i4 &= -57345;
                    f2 = 16.0f;
                }
                if ((i3 & 32) != 0) {
                    jG = v9p1.G(messageTemplate, x340Var);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    zic0Var = new zic0(1);
                }
                if ((i3 & 128) != 0) {
                    uwr uwrVar6 = cbx.a;
                    i4 &= -29360129;
                    qim0Var4 = qim0Var2;
                    i7 = i5;
                    f4 = f2;
                    j3 = jG;
                    djc0Var3 = zic0Var;
                    lee1Var4 = cbx.d(x340Var).k;
                } else {
                    qim0Var4 = qim0Var2;
                    i7 = i5;
                    f4 = f2;
                    j3 = jG;
                    djc0Var3 = zic0Var;
                    lee1Var4 = lee1Var2;
                }
            } else {
                if (i8 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    i5 = 3;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar7 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    i4 &= -57345;
                    f2 = 16.0f;
                }
                if ((i3 & 32) != 0) {
                    jG = v9p1.G(messageTemplate, x340Var);
                    i4 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i4 &= -3670017;
                    zic0Var = new zic0(1);
                }
                if ((i3 & 128) != 0) {
                    uwr uwrVar8 = cbx.a;
                    i4 &= -29360129;
                    qim0Var4 = qim0Var2;
                    i7 = i5;
                    f4 = f2;
                    j3 = jG;
                    djc0Var3 = zic0Var;
                    lee1Var4 = cbx.d(x340Var).k;
                } else {
                    qim0Var4 = qim0Var2;
                    i7 = i5;
                    f4 = f2;
                    j3 = jG;
                    djc0Var3 = zic0Var;
                    lee1Var4 = lee1Var2;
                }
            }
            x340Var.s();
            if (signifier.getText().length() == 0) {
            }
            qim0 qim0Var7 = qim0Var4;
            int i16 = i7;
            lee1 lee1Var7 = lee1Var4;
            ye5Var = new ye5();
            if (IconKt.isValid(signifier.getIcon())) {
                z6p1.s(ye5Var, "icon");
            }
            ye5Var.g(signifier.getText());
            af5 af5VarP3 = ye5Var.p();
            long jP3 = v9p1.P(j3, signifier.getTextColor());
            uwr uwrVar9 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            float f7 = f4;
            long j6 = j3;
            djc0 djc0Var6 = djc0Var3;
            uwo1.d(af5VarP3, jP3, anm1.N("messaging_signifier_tag", qim0Var7), lee1Var7, new a0e1(i16), (iu30) null, 2, false, djc0Var6, 0, (qx8) null, mqo1.t(new mmr0[]{new mmr0("icon", new gh80(new d6t0(4, fc11.Y(4.0f + f4, 4294967296L), fc11.Y(f4, 4294967296L)), apo.r(1981675991, new t9j0(signifier, messageTemplate, f7, j6), x340Var)))}), x340Var, ((i4 >> 12) & 7168) | ((i4 << 3) & 57344) | ((i4 << 6) & 234881024), 0, 1696);
            djc0Var2 = djc0Var6;
            lee1Var3 = lee1Var7;
            f3 = f7;
            j2 = j6;
            qim0Var3 = qim0Var7;
            i6 = i16;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            i6 = i5;
            f3 = f2;
            j2 = jG;
            djc0Var2 = zic0Var;
            lee1Var3 = lee1Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            s9j0Var = new s9j0(signifier, messageTemplate, qim0Var3, i6, f3, j2, djc0Var2, lee1Var3, i2, i3, (byte) 1);
            h311VarV.d = s9j0Var;
        }
    }

    public static final void p(Button button, MessageTemplate messageTemplate, qim0 qim0Var, int i, gdx gdxVar, vzq0 vzq0Var, vu30 vu30Var, hw61 hw61Var, djc0 djc0Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        int i4;
        gdx gdxVar2;
        vzq0 vzq0Var2;
        hw61 hw61Var2;
        djc0 djc0Var2;
        Function0 function1;
        vu30 vu30Var2;
        h311 h311VarV;
        u9j0 u9j0Var;
        vu30 o9j0Var;
        int i5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1658822999);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(button) : x340Var.i(button) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(messageTemplate) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            gdxVar2 = gdxVar;
            i3 |= x340Var.i(gdxVar2) ? 16384 : 8192;
        } else {
            gdxVar2 = gdxVar;
        }
        if ((196608 & i2) == 0) {
            vzq0Var2 = vzq0Var;
            i3 |= x340Var.i(vzq0Var2) ? 131072 : 65536;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            hw61Var2 = hw61Var;
            i3 |= x340Var.i(hw61Var2) ? 8388608 : 4194304;
        } else {
            hw61Var2 = hw61Var;
        }
        if ((i2 & 100663296) == 0) {
            djc0Var2 = djc0Var;
            i3 |= x340Var.i(djc0Var2) ? 67108864 : 33554432;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((805306368 & i2) == 0) {
            function1 = function0;
            i3 |= x340Var.i(function1) ? 536870912 : 268435456;
        } else {
            function1 = function0;
        }
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                o9j0Var = new o9j0(messageTemplate, (byte) 2);
                i5 = i3 & (-3670017);
            } else {
                x340Var.b0();
                i5 = i3 & (-3670017);
                o9j0Var = vu30Var;
            }
            x340Var.s();
            if (ihc1.y0(button.getStyle().getText())) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 == null) {
                    return;
                }
                h311VarV = h311VarV2;
                u9j0Var = new u9j0(button, messageTemplate, qim0Var, i4, gdxVar2, vzq0Var2, o9j0Var, hw61Var2, djc0Var2, function1, i2, (byte) 0);
            } else {
                long j = u7h.j;
                long jP = v9p1.P(((u7h) o9j0Var.invoke(x340Var, 0)).a, button.getStyle().getTextColor());
                boolean zF = x340Var.f(jP);
                Object objT = x340Var.T();
                if (zF || objT == m4cVar) {
                    objT = new q9j0((byte) 2, jP);
                    x340Var.s0(objT);
                }
                vu30 vu30Var3 = (vu30) objT;
                boolean zF2 = x340Var.f(j);
                Object objT2 = x340Var.T();
                if (zF2 || objT2 == m4cVar) {
                    objT2 = new q9j0((byte) 3, j);
                    x340Var.s0(objT2);
                }
                vu30 vu30Var4 = (vu30) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = m2j0.e;
                    x340Var.s0(objT3);
                }
                hdx hdxVar = new hdx(0, vu30Var3, vu30Var4, (vu30) objT3, hw61Var, 1);
                long j2 = ((u7h) o9j0Var.invoke(x340Var, 0)).a;
                int i6 = i5 >> 3;
                int i7 = Button.$stable | 100663296 | (i5 & 14) | (i5 & 112) | (i6 & 7168) | (i6 & 57344);
                int i8 = i5 << 12;
                d(button, messageTemplate, hdxVar, gdxVar, vzq0Var, j2, qim0Var, i, "messaging_button_tertiary_tag", djc0Var, function0, x340Var, i7 | (3670016 & i8) | (i8 & 29360128) | ((i5 << 3) & 1879048192), (i5 >> 27) & 14);
                vu30Var2 = o9j0Var;
            }
            h311VarV.d = u9j0Var;
        }
        x340Var.b0();
        vu30Var2 = vu30Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            u9j0Var = new u9j0(button, messageTemplate, qim0Var, i, gdxVar, vzq0Var, vu30Var2, hw61Var, djc0Var, function0, i2, (byte) 1);
            h311VarV.d = u9j0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x017e  */
    /* JADX WARN: Code duplicated, block: B:110:0x018c  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100 A[PHI: r10 r14
      0x0100: PHI (r10v16 p.qim0) = (r10v6 p.qim0), (r10v3 p.qim0) binds: [B:97:0x010e, B:91:0x00fd] A[DONT_GENERATE, DONT_INLINE]
      0x0100: PHI (r14v10 p.iu30) = (r14v6 p.iu30), (r14v3 p.iu30) binds: [B:97:0x010e, B:91:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    public static final void q(String str, long j, lee1 lee1Var, djc0 djc0Var, int i, qim0 qim0Var, int i2, iu30 iu30Var, String str2, b0k b0kVar, int i3, int i4) {
        int i5;
        lee1 lee1Var2;
        int i6;
        qim0 qim0Var2;
        int i7;
        iu30 iu30Var2;
        int i8;
        int i9;
        int i10;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        iu30 iu30Var3;
        String str3;
        h311 h311VarV;
        v9j0 v9j0Var;
        qim0 qim0Var4;
        iu30 iu30Var4;
        String str4;
        int i11;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(893835546);
        if ((i3 & 6) == 0) {
            i5 = (b0kVar3.g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            lee1Var2 = lee1Var;
            i5 |= b0kVar3.i(lee1Var2) ? 256 : 128;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar3.i(djc0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 = i;
            i5 |= b0kVar3.e(i6) ? 16384 : 8192;
        } else {
            i6 = i;
        }
        int i12 = i4 & 32;
        if (i12 == 0) {
            if ((196608 & i3) == 0) {
                qim0Var2 = qim0Var;
                i5 |= b0kVar3.i(qim0Var2) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                if (b0kVar3.e(i2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i5 |= i11;
            }
            i7 = i4 & 128;
            if (i7 != 0) {
                if ((12582912 & i3) == 0) {
                    iu30Var2 = iu30Var;
                    if (b0kVar3.i(iu30Var2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (b0kVar3.g(str2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i5 |= i10;
                }
                if ((i5 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i5 & 1, z)) {
                    b0kVar3.d0();
                    if ((i3 & 1) != 0 || b0kVar3.E()) {
                        if (i12 != 0) {
                            qim0Var2 = nim0.a;
                        }
                        if (i7 != 0) {
                            iu30Var2 = null;
                        }
                        if (i9 != 0) {
                            qim0Var4 = qim0Var2;
                            iu30Var4 = iu30Var2;
                            str4 = "messaging_text_tag";
                        }
                        b0kVar3.s();
                        if (ihc1.y0(str)) {
                            h311VarV = b0kVar3.v();
                            if (h311VarV == null) {
                                return;
                            } else {
                                v9j0Var = new v9j0(str, j, lee1Var2, djc0Var, i6, qim0Var4, i2, iu30Var4, str4, i3, i4, (byte) 0);
                            }
                        } else {
                            qim0 qim0Var5 = qim0Var4;
                            iu30 iu30Var5 = iu30Var4;
                            String str5 = str4;
                            int i13 = i5 << 6;
                            int i14 = i5 >> 6;
                            b0kVar2 = b0kVar3;
                            uwo1.e(str, anm1.N(str5, qim0Var5), lee1Var, j, new a0e1(i2), iu30Var5, i, false, djc0Var, 0, (qx8) null, b0kVar2, (i5 & 910) | (i13 & 7168) | (57344 & i14) | (i14 & 458752) | (i13 & 3670016) | ((i5 << 15) & 234881024), 0, 1664);
                            iu30Var3 = iu30Var5;
                            qim0Var3 = qim0Var5;
                            str3 = str5;
                        }
                        h311VarV.d = v9j0Var;
                    }
                    b0kVar3.b0();
                    qim0Var4 = qim0Var2;
                    iu30Var4 = iu30Var2;
                    str4 = str2;
                    b0kVar3.s();
                    if (ihc1.y0(str)) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            v9j0Var = new v9j0(str, j, lee1Var2, djc0Var, i6, qim0Var4, i2, iu30Var4, str4, i3, i4, (byte) 0);
                        }
                    } else {
                        qim0 qim0Var6 = qim0Var4;
                        iu30 iu30Var6 = iu30Var4;
                        String str6 = str4;
                        int i15 = i5 << 6;
                        int i16 = i5 >> 6;
                        b0kVar2 = b0kVar3;
                        uwo1.e(str, anm1.N(str6, qim0Var6), lee1Var, j, new a0e1(i2), iu30Var6, i, false, djc0Var, 0, (qx8) null, b0kVar2, (i5 & 910) | (i15 & 7168) | (57344 & i16) | (i16 & 458752) | (i15 & 3670016) | ((i5 << 15) & 234881024), 0, 1664);
                        iu30Var3 = iu30Var6;
                        qim0Var3 = qim0Var6;
                        str3 = str6;
                    }
                    h311VarV.d = v9j0Var;
                }
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                str3 = str2;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    v9j0Var = new v9j0(str, j, lee1Var, djc0Var, i, qim0Var3, i2, iu30Var3, str3, i3, i4, (byte) 1);
                    h311VarV.d = v9j0Var;
                }
            }
            i5 |= 12582912;
            iu30Var2 = iu30Var;
            i9 = i4 & 256;
            if (i9 != 0) {
                i5 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (b0kVar3.g(str2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = "messaging_text_tag";
                    } else {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = str2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = "messaging_text_tag";
                    } else {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = str2;
                    }
                }
                b0kVar3.s();
                if (ihc1.y0(str)) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        v9j0Var = new v9j0(str, j, lee1Var2, djc0Var, i6, qim0Var4, i2, iu30Var4, str4, i3, i4, (byte) 0);
                    }
                } else {
                    qim0 qim0Var7 = qim0Var4;
                    iu30 iu30Var7 = iu30Var4;
                    String str7 = str4;
                    int i17 = i5 << 6;
                    int i18 = i5 >> 6;
                    b0kVar2 = b0kVar3;
                    uwo1.e(str, anm1.N(str7, qim0Var7), lee1Var, j, new a0e1(i2), iu30Var7, i, false, djc0Var, 0, (qx8) null, b0kVar2, (i5 & 910) | (i17 & 7168) | (57344 & i18) | (i18 & 458752) | (i17 & 3670016) | ((i5 << 15) & 234881024), 0, 1664);
                    iu30Var3 = iu30Var7;
                    qim0Var3 = qim0Var7;
                    str3 = str7;
                }
                h311VarV.d = v9j0Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            iu30Var3 = iu30Var2;
            str3 = str2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                v9j0Var = new v9j0(str, j, lee1Var, djc0Var, i, qim0Var3, i2, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = v9j0Var;
            }
        }
        i5 |= 196608;
        qim0Var2 = qim0Var;
        if ((1572864 & i3) == 0) {
            if (b0kVar3.e(i2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        i7 = i4 & 128;
        if (i7 != 0) {
            if ((12582912 & i3) == 0) {
                iu30Var2 = iu30Var;
                if (b0kVar3.i(iu30Var2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i5 |= i8;
            }
            i9 = i4 & 256;
            if (i9 != 0) {
                i5 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (b0kVar3.g(str2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
            if ((i5 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i5 & 1, z)) {
                b0kVar3.d0();
                if ((i3 & 1) != 0) {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = "messaging_text_tag";
                    } else {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = str2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if (i7 != 0) {
                        iu30Var2 = null;
                    }
                    if (i9 != 0) {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = "messaging_text_tag";
                    } else {
                        qim0Var4 = qim0Var2;
                        iu30Var4 = iu30Var2;
                        str4 = str2;
                    }
                }
                b0kVar3.s();
                if (ihc1.y0(str)) {
                    h311VarV = b0kVar3.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        v9j0Var = new v9j0(str, j, lee1Var2, djc0Var, i6, qim0Var4, i2, iu30Var4, str4, i3, i4, (byte) 0);
                    }
                } else {
                    qim0 qim0Var8 = qim0Var4;
                    iu30 iu30Var8 = iu30Var4;
                    String str8 = str4;
                    int i19 = i5 << 6;
                    int i110 = i5 >> 6;
                    b0kVar2 = b0kVar3;
                    uwo1.e(str, anm1.N(str8, qim0Var8), lee1Var, j, new a0e1(i2), iu30Var8, i, false, djc0Var, 0, (qx8) null, b0kVar2, (i5 & 910) | (i19 & 7168) | (57344 & i110) | (i110 & 458752) | (i19 & 3670016) | ((i5 << 15) & 234881024), 0, 1664);
                    iu30Var3 = iu30Var8;
                    qim0Var3 = qim0Var8;
                    str3 = str8;
                }
                h311VarV.d = v9j0Var;
            }
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            iu30Var3 = iu30Var2;
            str3 = str2;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                v9j0Var = new v9j0(str, j, lee1Var, djc0Var, i, qim0Var3, i2, iu30Var3, str3, i3, i4, (byte) 1);
                h311VarV.d = v9j0Var;
            }
        }
        i5 |= 12582912;
        iu30Var2 = iu30Var;
        i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (b0kVar3.g(str2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i5 |= i10;
        }
        if ((i5 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i5 & 1, z)) {
            b0kVar3.d0();
            if ((i3 & 1) != 0) {
                if (i12 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                if (i9 != 0) {
                    qim0Var4 = qim0Var2;
                    iu30Var4 = iu30Var2;
                    str4 = "messaging_text_tag";
                } else {
                    qim0Var4 = qim0Var2;
                    iu30Var4 = iu30Var2;
                    str4 = str2;
                }
            } else {
                if (i12 != 0) {
                    qim0Var2 = nim0.a;
                }
                if (i7 != 0) {
                    iu30Var2 = null;
                }
                if (i9 != 0) {
                    qim0Var4 = qim0Var2;
                    iu30Var4 = iu30Var2;
                    str4 = "messaging_text_tag";
                } else {
                    qim0Var4 = qim0Var2;
                    iu30Var4 = iu30Var2;
                    str4 = str2;
                }
            }
            b0kVar3.s();
            if (ihc1.y0(str)) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    v9j0Var = new v9j0(str, j, lee1Var2, djc0Var, i6, qim0Var4, i2, iu30Var4, str4, i3, i4, (byte) 0);
                }
            } else {
                qim0 qim0Var9 = qim0Var4;
                iu30 iu30Var9 = iu30Var4;
                String str9 = str4;
                int i111 = i5 << 6;
                int i112 = i5 >> 6;
                b0kVar2 = b0kVar3;
                uwo1.e(str, anm1.N(str9, qim0Var9), lee1Var, j, new a0e1(i2), iu30Var9, i, false, djc0Var, 0, (qx8) null, b0kVar2, (i5 & 910) | (i111 & 7168) | (57344 & i112) | (i112 & 458752) | (i111 & 3670016) | ((i5 << 15) & 234881024), 0, 1664);
                iu30Var3 = iu30Var9;
                qim0Var3 = qim0Var9;
                str3 = str9;
            }
            h311VarV.d = v9j0Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        qim0Var3 = qim0Var2;
        iu30Var3 = iu30Var2;
        str3 = str2;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            v9j0Var = new v9j0(str, j, lee1Var, djc0Var, i, qim0Var3, i2, iu30Var3, str3, i3, i4, (byte) 1);
            h311VarV.d = v9j0Var;
        }
    }

    public static final qim0 r(qim0 qim0Var, MessageTemplate messageTemplate, BackgroundColor backgroundColor, float f) {
        return zr7.i(qim0Var, new x9j0(f, backgroundColor, messageTemplate));
    }

    public static final lee1 s(EncoreFont encoreFont, b0k b0kVar) {
        switch (w9j0.c[encoreFont.ordinal()]) {
            case 1:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(1259540869);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                x340Var.r(false);
                return lee1Var;
            case 2:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(1259542726);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var2).g;
                x340Var2.r(false);
                return lee1Var2;
            case 3:
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.i0(1259544614);
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var3 = cbx.d(x340Var3).e;
                x340Var3.r(false);
                return lee1Var3;
            case 4:
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.i0(1259546535);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var4 = cbx.d(x340Var4).d;
                x340Var4.r(false);
                return lee1Var4;
            case 5:
                x340 x340Var5 = (x340) b0kVar;
                x340Var5.i0(1259548454);
                uwr uwrVar5 = cbx.a;
                lee1 lee1Var5 = cbx.d(x340Var5).c;
                x340Var5.r(false);
                return lee1Var5;
            case 6:
                x340 x340Var6 = (x340) b0kVar;
                x340Var6.i0(1259550474);
                uwr uwrVar6 = cbx.a;
                lee1 lee1Var6 = cbx.d(x340Var6).b;
                x340Var6.r(false);
                return lee1Var6;
            case 7:
                x340 x340Var7 = (x340) b0kVar;
                x340Var7.i0(1259552585);
                uwr uwrVar7 = cbx.a;
                lee1 lee1Var7 = cbx.d(x340Var7).a;
                x340Var7.r(false);
                return lee1Var7;
            case 8:
                x340 x340Var8 = (x340) b0kVar;
                x340Var8.i0(1259554730);
                uwr uwrVar8 = cbx.a;
                lee1 lee1Var8 = cbx.d(x340Var8).h;
                x340Var8.r(false);
                return lee1Var8;
            case 9:
                x340 x340Var9 = (x340) b0kVar;
                x340Var9.i0(1259556873);
                uwr uwrVar9 = cbx.a;
                lee1 lee1Var9 = cbx.d(x340Var9).k;
                x340Var9.r(false);
                return lee1Var9;
            case 10:
                x340 x340Var10 = (x340) b0kVar;
                x340Var10.i0(1259558756);
                uwr uwrVar10 = cbx.a;
                lee1 lee1Var10 = cbx.d(x340Var10).m;
                x340Var10.r(false);
                return lee1Var10;
            case 11:
                x340 x340Var11 = (x340) b0kVar;
                x340Var11.i0(1259560648);
                uwr uwrVar11 = cbx.a;
                lee1 lee1Var11 = cbx.d(x340Var11).n;
                x340Var11.r(false);
                return lee1Var11;
            case 12:
                x340 x340Var12 = (x340) b0kVar;
                x340Var12.i0(391717825);
                x340Var12.r(false);
                return null;
            default:
                throw p3d1.k((x340) b0kVar, 1259539639, false);
        }
    }
}
