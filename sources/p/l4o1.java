package p;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkDatabase;
import com.spotify.player.model.ContextTrack;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l4o1 {
    public static final acn1 a = new acn1("ResolutionAnchorProvider", (byte) 7);
    public static b180 b;
    public static volatile t7o0 c;
    public static volatile x6o0 d;

    public static final Long A(zoy0 zoy0Var, yqg yqgVar) {
        if (zoy0Var == null) {
            return null;
        }
        jxp0 jxp0Var = zoy0Var.b;
        Calendar calendarD = yqgVar.d();
        xoy0 xoy0Var = (yoy0) jxp0Var.b;
        if (xoy0Var instanceof xoy0) {
            xoy0 xoy0Var2 = xoy0Var;
            calendarD.set(xoy0Var2.a, xoy0Var2.b - 1, xoy0Var2.c);
        } else if (xoy0Var instanceof woy0) {
            woy0 woy0Var = (woy0) xoy0Var;
            calendarD.set(woy0Var.a, woy0Var.b - 1, 1);
        } else {
            if (!(xoy0Var instanceof voy0)) {
                return null;
            }
            calendarD.set(((voy0) xoy0Var).a, 0, 1);
        }
        return Long.valueOf(calendarD.getTimeInMillis());
    }

    public static final pzc B(WorkDatabase workDatabase, dwl1 dwl1Var, String str) {
        return upn1.t(new k65(dwl1Var.a, "loadStatusFuture", new qga0(new jfa(str, (byte) 12), workDatabase, (byte) 16), (byte) 14));
    }

    public static final boolean C(ContextTrack contextTrack) {
        return u890.j(contextTrack.metadata().get("has_ephemeral_uri"), "true");
    }

    public static final boolean D(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_19_plus"));
    }

    public static final boolean E(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_advertisement"));
    }

    public static final boolean F(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("media.type");
        if (str != null) {
            return str.equalsIgnoreCase("audio");
        }
        return true;
    }

    public static final boolean G(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_audiobook_chapter"));
    }

    public static final boolean H(ContextTrack contextTrack) {
        return nhc1.Y(contextTrack.uri(), "spotify:track:", false) && !Y(contextTrack);
    }

    public static final boolean I(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("autoplay.is_autoplay"));
    }

    public static final boolean J(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("provider");
        if (str != null) {
            return str.equalsIgnoreCase("enhanced_recommendation");
        }
        return false;
    }

    public static final boolean K(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_explicit"));
    }

    public static final boolean L(ContextTrack contextTrack) {
        return nhc1.Y(contextTrack.uri(), "spotify:kallax:", false);
    }

    public static final boolean M(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("media.live"));
    }

    public static final boolean N(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("parent_episode.uri");
        return str != null && (ihc1.y0(str) ^ true);
    }

    public static final boolean O(ContextTrack contextTrack) {
        return u890.j(contextTrack.metadata().get("is_narration"), "true");
    }

    public static final boolean P(ContextTrack contextTrack) {
        return nhc1.Y(contextTrack.uri(), "spotify:episode:", false) || nhc1.Y(contextTrack.uri(), "spotify:podcast-chapter:", false) || nhc1.Y(contextTrack.uri(), "spotify:clip:", false);
    }

    public static final boolean Q(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_podcast_advertisement"));
    }

    public static final boolean R(zoy0 zoy0Var) {
        return zoy0Var != null && Instant.ofEpochSecond(zoy0Var.c).isAfter(Instant.now());
    }

    public static final boolean S(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) contextTrack.metadata().get("is_queued"));
    }

    public static final boolean T(ContextTrack contextTrack) {
        String strA0;
        return U(contextTrack) && (strA0 = a0(contextTrack, "pointer.uri")) != null && nhc1.Y(strA0, "spotify:clip:", false);
    }

    public static final boolean U(ContextTrack contextTrack) {
        return u890.j(a0(contextTrack, "pointer.npv_mode"), "standalone");
    }

    public static final boolean V(ContextTrack contextTrack) {
        String str = (String) contextTrack.metadata().get("mft.injection_source");
        if (str != null) {
            return ihc1.e1(str).toString().toLowerCase(Locale.ENGLISH).equals("fallback");
        }
        return false;
    }

    public static final boolean W(ContextTrack contextTrack) {
        return nhc1.Y(contextTrack.uri(), "spotify:track:", false);
    }

    public static final boolean X(ContextTrack contextTrack) {
        return "video".equalsIgnoreCase((String) contextTrack.metadata().get("track_player"));
    }

    public static final boolean Y(ContextTrack contextTrack) {
        return "video".equalsIgnoreCase((String) contextTrack.metadata().get("media.type"));
    }

    public static final boolean Z(ContextTrack contextTrack) {
        Boolean boolD1;
        String str = (String) contextTrack.metadata().get("video_rendering_enabled");
        if (str == null || (boolD1 = ihc1.d1(str)) == null) {
            return true;
        }
        return boolD1.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(Function0 function0, qim0 qim0Var, boolean z, hw61 hw61Var, qsd qsdVar, ltd ltdVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        qsd qsdVarP;
        ltd ltdVar2;
        int i3;
        byte b2;
        boolean z2;
        qsd qsdVar2;
        ltd ltdVar3;
        boolean z3;
        h311 h311VarV;
        int i4;
        ltd ltdVar4;
        qsd qsdVar3;
        boolean z4;
        Object objT;
        long j;
        long j2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2136075085);
        int i5 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | 384 | (x340Var.g(hw61Var) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            qsdVarP = qsdVar;
            int i6 = x340Var.g(qsdVarP) ? 16384 : 8192;
            int i7 = i5 | i6;
            if ((i2 & 32) == 0) {
                ltdVar2 = ltdVar;
                int i8 = x340Var.g(ltdVar2) ? 131072 : 65536;
                i3 = i7 | i8 | 14155776;
                b2 = 1;
                if ((38347923 & i3) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i3 & 1, z2)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if ((i2 & 16) != 0) {
                            qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                            i3 &= -458753;
                        }
                        ltd ltdVar5 = ltdVar2;
                        i4 = i3;
                        ltdVar4 = ltdVar5;
                        qsdVar3 = qsdVarP;
                        z4 = true;
                    } else {
                        x340Var.b0();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        ltd ltdVar6 = ltdVar2;
                        i4 = i3;
                        ltdVar4 = ltdVar6;
                        qsdVar3 = qsdVarP;
                        z4 = z;
                    }
                    x340Var.s();
                    x340Var.i0(1577885006);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0 idn0Var = (idn0) objT;
                    x340Var.r(false);
                    if (z4) {
                        j = qsdVar3.a;
                    } else {
                        j = qsdVar3.c;
                    }
                    if (z4) {
                        j2 = qsdVar3.b;
                    } else {
                        j2 = qsdVar3.d;
                    }
                    w3d1.b(function0, qim0Var, z4, hw61Var, j, j2, 0.0f, ((p3v) ltdVar4.a(z4, idn0Var, x340Var, ((i4 >> 9) & 896) | 6).getValue()).a, idn0Var, apo.r(-1347531112, new utd(j2iVar, b2), x340Var), x340Var, (i4 & 8190) | 100663296, 64);
                    z3 = z4;
                    qsdVar2 = qsdVar3;
                    ltdVar3 = ltdVar4;
                } else {
                    x340Var.b0();
                    qsdVar2 = qsdVarP;
                    ltdVar3 = ltdVar2;
                    z3 = z;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zec(function0, qim0Var, z3, hw61Var, qsdVar2, ltdVar3, j2iVar, i, i2, (byte) 1);
                }
            }
            ltdVar2 = ltdVar;
            i3 = i7 | i8 | 14155776;
            b2 = 1;
            if ((38347923 & i3) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                        i3 &= -458753;
                    }
                    ltd ltdVar7 = ltdVar2;
                    i4 = i3;
                    ltdVar4 = ltdVar7;
                    qsdVar3 = qsdVarP;
                    z4 = true;
                } else {
                    if ((i2 & 16) != 0) {
                        qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                        i3 &= -458753;
                    }
                    ltd ltdVar8 = ltdVar2;
                    i4 = i3;
                    ltdVar4 = ltdVar8;
                    qsdVar3 = qsdVarP;
                    z4 = true;
                }
                x340Var.s();
                x340Var.i0(1577885006);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var2 = (idn0) objT;
                x340Var.r(false);
                if (z4) {
                    j = qsdVar3.a;
                } else {
                    j = qsdVar3.c;
                }
                if (z4) {
                    j2 = qsdVar3.b;
                } else {
                    j2 = qsdVar3.d;
                }
                w3d1.b(function0, qim0Var, z4, hw61Var, j, j2, 0.0f, ((p3v) ltdVar4.a(z4, idn0Var2, x340Var, ((i4 >> 9) & 896) | 6).getValue()).a, idn0Var2, apo.r(-1347531112, new utd(j2iVar, b2), x340Var), x340Var, (i4 & 8190) | 100663296, 64);
                z3 = z4;
                qsdVar2 = qsdVar3;
                ltdVar3 = ltdVar4;
            } else {
                x340Var.b0();
                qsdVar2 = qsdVarP;
                ltdVar3 = ltdVar2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zec(function0, qim0Var, z3, hw61Var, qsdVar2, ltdVar3, j2iVar, i, i2, (byte) 1);
            }
        }
        qsdVarP = qsdVar;
        int i9 = i5 | i6;
        if ((i2 & 32) == 0) {
            ltdVar2 = ltdVar;
            if (x340Var.g(ltdVar2)) {
            }
            i3 = i9 | i8 | 14155776;
            b2 = 1;
            if ((38347923 & i3) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 16) != 0) {
                        qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                        i3 &= -458753;
                    }
                    ltd ltdVar9 = ltdVar2;
                    i4 = i3;
                    ltdVar4 = ltdVar9;
                    qsdVar3 = qsdVarP;
                    z4 = true;
                } else {
                    if ((i2 & 16) != 0) {
                        qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                        i3 &= -458753;
                    }
                    ltd ltdVar10 = ltdVar2;
                    i4 = i3;
                    ltdVar4 = ltdVar10;
                    qsdVar3 = qsdVarP;
                    z4 = true;
                }
                x340Var.s();
                x340Var.i0(1577885006);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var3 = (idn0) objT;
                x340Var.r(false);
                if (z4) {
                    j = qsdVar3.a;
                } else {
                    j = qsdVar3.c;
                }
                if (z4) {
                    j2 = qsdVar3.b;
                } else {
                    j2 = qsdVar3.d;
                }
                w3d1.b(function0, qim0Var, z4, hw61Var, j, j2, 0.0f, ((p3v) ltdVar4.a(z4, idn0Var3, x340Var, ((i4 >> 9) & 896) | 6).getValue()).a, idn0Var3, apo.r(-1347531112, new utd(j2iVar, b2), x340Var), x340Var, (i4 & 8190) | 100663296, 64);
                z3 = z4;
                qsdVar2 = qsdVar3;
                ltdVar3 = ltdVar4;
            } else {
                x340Var.b0();
                qsdVar2 = qsdVarP;
                ltdVar3 = ltdVar2;
                z3 = z;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zec(function0, qim0Var, z3, hw61Var, qsdVar2, ltdVar3, j2iVar, i, i2, (byte) 1);
            }
        }
        ltdVar2 = ltdVar;
        i3 = i9 | i8 | 14155776;
        b2 = 1;
        if ((38347923 & i3) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                    i3 &= -458753;
                }
                ltd ltdVar11 = ltdVar2;
                i4 = i3;
                ltdVar4 = ltdVar11;
                qsdVar3 = qsdVarP;
                z4 = true;
            } else {
                if ((i2 & 16) != 0) {
                    qsdVarP = s3o1.p((dah) x340Var.k(eah.a));
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                    i3 &= -458753;
                }
                ltd ltdVar12 = ltdVar2;
                i4 = i3;
                ltdVar4 = ltdVar12;
                qsdVar3 = qsdVarP;
                z4 = true;
            }
            x340Var.s();
            x340Var.i0(1577885006);
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var4 = (idn0) objT;
            x340Var.r(false);
            if (z4) {
                j = qsdVar3.a;
            } else {
                j = qsdVar3.c;
            }
            if (z4) {
                j2 = qsdVar3.b;
            } else {
                j2 = qsdVar3.d;
            }
            w3d1.b(function0, qim0Var, z4, hw61Var, j, j2, 0.0f, ((p3v) ltdVar4.a(z4, idn0Var4, x340Var, ((i4 >> 9) & 896) | 6).getValue()).a, idn0Var4, apo.r(-1347531112, new utd(j2iVar, b2), x340Var), x340Var, (i4 & 8190) | 100663296, 64);
            z3 = z4;
            qsdVar2 = qsdVar3;
            ltdVar3 = ltdVar4;
        } else {
            x340Var.b0();
            qsdVar2 = qsdVarP;
            ltdVar3 = ltdVar2;
            z3 = z;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zec(function0, qim0Var, z3, hw61Var, qsdVar2, ltdVar3, j2iVar, i, i2, (byte) 1);
        }
    }

    public static final String a0(ContextTrack contextTrack, String str) {
        String str2 = (String) contextTrack.metadata().get(str);
        if (str2 == null || ihc1.y0(str2)) {
            return null;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5 A[PHI: r1 r2 r3 r4
      0x00d5: PHI (r1v20 int) = (r1v13 int), (r1v22 int), (r1v23 int) binds: [B:91:0x0107, B:79:0x00d1, B:80:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r2v15 p.hw61) = (r2v4 p.hw61), (r2v2 p.hw61), (r2v2 p.hw61) binds: [B:91:0x0107, B:79:0x00d1, B:80:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r3v10 p.qsd) = (r3v4 p.qsd), (r3v2 p.qsd), (r3v2 p.qsd) binds: [B:91:0x0107, B:79:0x00d1, B:80:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r4v7 p.ltd) = (r4v4 p.ltd), (r4v2 p.ltd), (r4v2 p.ltd) binds: [B:91:0x0107, B:79:0x00d1, B:80:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0151  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void b(qim0 qim0Var, hw61 hw61Var, qsd qsdVar, ltd ltdVar, qqb qqbVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        hw61 hw61VarB;
        qsd qsdVarP;
        ltd ltdVar2;
        qqb qqbVar2;
        boolean z;
        b0k b0kVar2;
        qqb qqbVar3;
        h311 h311VarV;
        hw61 hw61Var2;
        qqb qqbVar4;
        int i4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1359693790);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                hw61VarB = hw61Var;
                int i5 = b0kVar3.g(hw61VarB) ? 32 : 16;
                i3 |= i5;
            } else {
                hw61VarB = hw61Var;
            }
            i3 |= i5;
        } else {
            hw61VarB = hw61Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                qsdVarP = qsdVar;
                int i6 = b0kVar3.g(qsdVarP) ? 256 : 128;
                i3 |= i6;
            } else {
                qsdVarP = qsdVar;
            }
            i3 |= i6;
        } else {
            qsdVarP = qsdVar;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                ltdVar2 = ltdVar;
                int i7 = b0kVar3.g(ltdVar2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                ltdVar2 = ltdVar;
            }
            i3 |= i7;
        } else {
            ltdVar2 = ltdVar;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                qqbVar2 = qqbVar;
                i3 |= b0kVar3.g(qqbVar2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if ((i2 & 2) != 0) {
                        hw61VarB = px61.b(b0kVar3, 13);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        qsdVarP = s3o1.p((dah) b0kVar3.k(eah.a));
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                        i3 &= -7169;
                    }
                    if (i8 != 0) {
                        hw61Var2 = hw61VarB;
                        qqbVar4 = null;
                    }
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    w3d1.a(qim0Var, hw61Var2, qsdVarP.a, qsdVarP.b, 0.0f, ((p3v) ltdVar2.a(true, (idn0) null, b0kVar3, ((i3 >> 3) & 896) | 54).getValue()).a, qqbVar4, apo.r(-97109725, new utd(j2iVar, (byte) 0), b0kVar3), b0kVar2, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                    hw61VarB = hw61Var2;
                    qqbVar3 = qqbVar4;
                } else {
                    b0kVar3.b0();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                qqbVar4 = qqbVar2;
                hw61Var2 = hw61VarB;
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                w3d1.a(qim0Var, hw61Var2, qsdVarP.a, qsdVarP.b, 0.0f, ((p3v) ltdVar2.a(true, (idn0) null, b0kVar3, ((i3 >> 3) & 896) | 54).getValue()).a, qqbVar4, apo.r(-97109725, new utd(j2iVar, (byte) 0), b0kVar3), b0kVar2, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                hw61VarB = hw61Var2;
                qqbVar3 = qqbVar4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qqbVar3 = qqbVar2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new rj4(qim0Var, hw61VarB, qsdVarP, ltdVar2, qqbVar3, j2iVar, i, i2);
            }
        }
        i3 |= 24576;
        qqbVar2 = qqbVar;
        if ((196608 & i) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    hw61VarB = px61.b(b0kVar3, 13);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    qsdVarP = s3o1.p((dah) b0kVar3.k(eah.a));
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                    i3 &= -7169;
                }
                if (i8 != 0) {
                    hw61Var2 = hw61VarB;
                    qqbVar4 = null;
                } else {
                    qqbVar4 = qqbVar2;
                    hw61Var2 = hw61VarB;
                }
            } else {
                if ((i2 & 2) != 0) {
                    hw61VarB = px61.b(b0kVar3, 13);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    qsdVarP = s3o1.p((dah) b0kVar3.k(eah.a));
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    ltdVar2 = new ltd(0.0f, 1.0f, 6.0f);
                    i3 &= -7169;
                }
                if (i8 != 0) {
                    hw61Var2 = hw61VarB;
                    qqbVar4 = null;
                } else {
                    qqbVar4 = qqbVar2;
                    hw61Var2 = hw61VarB;
                }
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            w3d1.a(qim0Var, hw61Var2, qsdVarP.a, qsdVarP.b, 0.0f, ((p3v) ltdVar2.a(true, (idn0) null, b0kVar3, ((i3 >> 3) & 896) | 54).getValue()).a, qqbVar4, apo.r(-97109725, new utd(j2iVar, (byte) 0), b0kVar3), b0kVar2, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
            hw61VarB = hw61Var2;
            qqbVar3 = qqbVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qqbVar3 = qqbVar2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rj4(qim0Var, hw61VarB, qsdVarP, ltdVar2, qqbVar3, j2iVar, i, i2);
        }
    }

    public static final String b0(ContextTrack contextTrack) {
        String strA0 = a0(contextTrack, "pointer.uri");
        return strA0 == null ? contextTrack.uri() : strA0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(bf00 bf00Var, xfx xfxVar, p40 p40Var, iu30 iu30Var, int i, qim0 qim0Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1655396095);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(bf00Var) : x340Var.i(bf00Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(xfxVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(p40Var) : x340Var.i(p40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(i) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            boolean z = bf00Var instanceof ze00;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(-1090250482);
                boolean zI = ((i4 & 14) == 4 || ((i4 & 8) != 0 && x340Var.i(bf00Var))) | x340Var.i(xfxVar) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new gu2(xfxVar, bf00Var, iu30Var, i);
                    x340Var.s0(objT);
                }
                dm5.a((iu30) objT, qim0Var3, (iu30) null, x340Var, (i4 >> 12) & 112, 4);
                x340Var.r(false);
            } else {
                if (bf00Var instanceof ye00) {
                    x340Var.i0(-1697708417);
                    throw null;
                }
                if (!(bf00Var instanceof af00)) {
                    throw p3d1.k(x340Var, -1697738512, false);
                }
                x340Var.i0(-1088654664);
                otw.c(p40Var, (Object) null, (qim0) null, (ipb1) null, x340Var, 8 | ((i4 >> 6) & 14), 12);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(bf00Var, xfxVar, p40Var, iu30Var, i, qim0Var2, i2);
        }
    }

    public static final String c0(ContextTrack contextTrack) {
        return contextTrack.uid() + contextTrack.uri() + contextTrack.provider() + contextTrack.metadata().get("iteration");
    }

    public static final void d(if00 if00Var, xfx xfxVar, p40 p40Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-193273543);
        int i2 = i | (x340Var.g(if00Var) ? 4 : 2) | (x340Var.i(xfxVar) ? 32 : 16) | (x340Var.i(p40Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            int i3 = i2 & 57344;
            int i4 = i2 & 14;
            boolean zI = x340Var.i(xtb0VarA) | (i3 == 16384) | (i4 == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new mqv(xtb0VarA, iu30Var, if00Var, (lnm) null);
                x340Var.s0(objT);
            }
            qxd0.t(xtb0VarA, x340Var, (vu30) objT);
            qim0 qim0VarN = anm1.N("carousel_row", j9k1.x(qim0Var, new ac8(3, (byte) 9)));
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zI2 = (i4 == 4) | x340Var.i(xfxVar) | ((i2 & 896) == 256 || x340Var.i(p40Var)) | (i3 == 16384);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new djx(if00Var, xfxVar, p40Var, iu30Var);
                x340Var.s0(objT2);
            }
            ujo1.e(qim0VarN, xtb0VarA, zzq0VarH, d36Var, null, null, false, null, (iu30) objT2, x340Var, 0, 488);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(if00Var, xfxVar, p40Var, qim0Var, iu30Var, i);
        }
    }

    public static final void d0(RecyclerView recyclerView, iu30 iu30Var, boolean z, nzb0 nzb0Var, t8r0 t8r0Var) {
        if (t8r0Var != null) {
            ((ArrayList) t8r0Var.a).clear();
        }
        o96 o96Var = new o96(nzb0Var, iu30Var, z, t8r0Var, new utt(recyclerView, (byte) 28), (byte) 6);
        h6t h6tVar = new h6t();
        recyclerView.setAdapter(new bk7(h6tVar, (z511) o96Var.invoke(h6tVar), (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void e(qim0 qim0Var, float f, float f2, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        vu30 vu30Var2;
        boolean z;
        h311 h311VarV;
        vu30 vu30Var3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1043804467);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                vu30Var2 = vu30Var;
                i3 |= x340Var.i(vu30Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    vu30Var3 = vri.a;
                } else {
                    vu30Var3 = vu30Var2;
                }
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                qim0 qim0VarE2 = dug.e(qim0Var, new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(((yex) zscVar.d).a, f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(((yex) zscVar.d).a, f2, 0.0f, 0.0f, 0.0f, 14))}), (List) null), null, 0.0f, 6);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarE2);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                us71.j((i3 >> 9) & 14, vu30Var3, x340Var, true);
                vu30Var2 = vu30Var3;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new h160(qim0Var, f, f2, vu30Var2, i, i2);
            }
        }
        i3 |= 3072;
        vu30Var2 = vu30Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                vu30Var3 = vri.a;
            } else {
                vu30Var3 = vu30Var2;
            }
            uwr uwrVar2 = cbx.a;
            zsc zscVar2 = zex.a;
            qim0 qim0VarE3 = dug.e(qim0Var, new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(((yex) zscVar2.d).a, f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(((yex) zscVar2.d).a, f2, 0.0f, 0.0f, 0.0f, 14))}), (List) null), null, 0.0f, 6);
            gfh0VarC = t1c.c(een.d, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarE3);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            us71.j((i3 >> 9) & 14, vu30Var3, x340Var, true);
            vu30Var2 = vu30Var3;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h160(qim0Var, f, f2, vu30Var2, i, i2);
        }
    }

    public static final void e0(ViewPager2 viewPager2, iu30 iu30Var, nzb0 nzb0Var) {
        o96 o96Var = new o96(nzb0Var, iu30Var, false, (Object) null, nrw.a, (byte) 6);
        h6t h6tVar = new h6t();
        viewPager2.setAdapter(new bk7(h6tVar, (z511) o96Var.invoke(h6tVar), (byte) 0));
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1414285870);
        int i2 = i | (b0kVar2.i(function0) ? 4 : 2);
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar2).e.b, 0.0f, 2, qim0VarF);
            long jA = cbx.a(b0kVar2).a.a.a();
            cua cuaVar = cbx.b(b0kVar2).f;
            qim0 qim0VarX = uyn1.x(dug.f(qim0VarZ, jA, er31.b(16.0f)), cbx.b(b0kVar2).b.c);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            w0h1.a(bpx.c, isl.a, (qim0) null, cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, bpx.d | 48, 52);
            cvx cvxVar = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(8.0f, 2131957266, b0kVar2, b0kVar2, nim0Var), null, cbx.d(b0kVar2).k, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2034);
            b0kVar2 = b0kVar2;
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(b0kVar2, 2131957304);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), ldxVar, null, null, null, null, null, null, null, null, qzi.a, b0kVar2, 48, 48, 2044);
                b0kVar2.r(true);
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 5);
        }
    }

    public static final String f0(ContextTrack contextTrack) {
        String strA0 = a0(contextTrack, "title");
        if (strA0 != null) {
            return strA0;
        }
        if (E(contextTrack)) {
            return "Advertisement";
        }
        return null;
    }

    public static final void g(uvg1 uvg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1208609645);
        int i2 = (x340Var.i(uvg1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131963165);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            uwo1.e(uap1.e(uvg1Var.a), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            uwo1.e(cwl1.o0(x340Var, 2131963160), uyn1.B(nim0.a, 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(uap1.e(uvg1Var.b), null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(uvg1Var, qim0Var, i, (byte) 28);
        }
    }

    public static final m86 g0(t46 t46Var, a56 a56Var, boolean z) {
        if (t46Var instanceof r46) {
            if (z) {
                r46 r46Var = (r46) t46Var;
                return new d76(r46Var.a, r46Var.b);
            }
            r46 r46Var2 = (r46) t46Var;
            return new a76(r46Var2.a, r46Var2.b);
        }
        if (t46Var instanceof s46) {
            s46 s46Var = (s46) t46Var;
            return new b76(s46Var.a, s46Var.b, s46Var.c);
        }
        if (u890.j(t46Var, q46.a)) {
            return v76.a;
        }
        if (!(t46Var instanceof p46)) {
            eg.o();
            return null;
        }
        List listF = a56Var.f(((p46) t46Var).a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof k46) {
                arrayList.add(obj);
            }
        }
        k46 k46Var = (k46) o7h.s0(arrayList);
        if (k46Var != null) {
            return new i76(k46Var.b);
        }
        return z ? new c76(listF) : new z66(listF);
    }

    public static final void h(c9n c9nVar, vy71 vy71Var, lbt0 lbt0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        vy71 vy71Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Map map = lbt0Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1253565826);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c9nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vy71Var2 = vy71Var;
            i2 |= b0kVar3.i(vy71Var2) ? 32 : 16;
        } else {
            vy71Var2 = vy71Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(lbt0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            c10 c10Var = (c10) map.get(t80.N0);
            c10 c10Var2 = (c10) map.get(t80.Z);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            cr31 cr31VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("bottomsheet_invite", uyn1.B(u291.z(qim0Var3, (fra) null, 3), 0.0f, 0.0f, 0.0f, 32.0f, 7));
            boolean z = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new dgq0(iu30Var, (byte) 18);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dem0.a((Function0) objT, qim0VarN, vy71Var, 0.0f, false, cr31VarD, 0L, 0L, 0.0f, 0L, (vu30) null, w0q0.R0, (eem0) null, apo.r(-1453642652, new jb1((Object) c10Var, (Object) c9nVar, (Object) vy71Var2, iu30Var, (Object) c10Var2, (byte) 25), b0kVar3), b0kVar2, (i3 << 3) & 896, 3072, 6104);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xmr0(c9nVar, vy71Var, lbt0Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static int h0(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iW = o4o1.w(obj);
        int i2 = iW & i;
        int iI0 = i0(i2, obj3);
        if (iI0 != 0) {
            int i3 = ~i;
            int i4 = iW & i3;
            int i5 = -1;
            while (true) {
                int i6 = iI0 - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !poo1.K(obj, objArr[i6]) || (objArr2 != null && !poo1.K(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iI0 = i8;
                } else {
                    if (i5 == -1) {
                        k0(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final void i(tbh1 tbh1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        u7h u7hVar;
        long jA;
        Object obj;
        int i3;
        ?? r1;
        vu30 vu30Var;
        lbh1 lbh1Var;
        Function0 function0;
        String strK;
        m4c m4cVar;
        hdx hdxVar;
        Object obj2;
        ga80 ga80Var;
        Object obj3;
        Object obj4;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-694470029);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(tbh1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 6.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(qim0VarY, er31.b(8.0f));
            Integer num = tbh1Var.f;
            int i4 = i2;
            boolean z = tbh1Var.e;
            lbh1 lbh1Var2 = tbh1Var.b;
            String str = lbh1Var2.c;
            boolean z2 = tbh1Var.c;
            if (num == null) {
                u7hVar = null;
            } else {
                if (z2) {
                    num = null;
                }
                if (num != null) {
                    u7hVar = new u7h(z4p1.e(num.intValue()));
                } else {
                    u7hVar = null;
                }
            }
            if (u7hVar == null) {
                x340Var.i0(-1665751657);
                jA = cbx.a(x340Var).a.b.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1665755160);
                x340Var.r(false);
                jA = u7hVar.a;
            }
            qim0 qim0VarF2 = dug.f(qim0VarQ, jA, d4o1.a);
            boolean z3 = tbh1Var.d;
            int i5 = i4 & 112;
            boolean z4 = i5 == 32;
            Object objT = x340Var.T();
            Object obj5 = objT;
            if (z4 || objT == m4cVar2) {
                fgf1 fgf1Var = new fgf1(iu30Var, (byte) 14);
                x340Var.s0(fgf1Var);
                obj5 = fgf1Var;
            }
            qim0 qim0VarX = bin.x(qim0VarF2, z3, null, null, null, (Function0) obj5, 14);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 12.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z5) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            if (str == null || u890.j(str, "NEVER")) {
                obj = "NEVER";
                i3 = i5;
                r1 = 0;
                vu30Var = vu30Var2;
                lbh1Var = lbh1Var2;
                function0 = function1;
                x340Var.i0(-1376194375);
                x340Var.r(false);
            } else {
                x340Var.i0(-1376373121);
                i3 = i5;
                obj = "NEVER";
                lbh1Var = lbh1Var2;
                vu30Var = vu30Var2;
                r1 = 0;
                function0 = function1;
                uwo1.e(cwl1.o0(x340Var, 2131963459), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340 x340Var2 = x340Var;
            uwo1.e(lbh1Var.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
            x340Var = x340Var2;
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, (int) r1);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var);
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1084
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.l4o1.i(p.tbh1, p.iu30, p.b0k, int):void");
        }

        public static int i0(int i, Object obj) {
            if (obj instanceof byte[]) {
                return ((byte[]) obj)[i] & 255;
            }
            return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
        }

        public static final String j(ContextTrack contextTrack) {
            return a0(contextTrack, "album_uri");
        }

        public static Object j0(int i) {
            if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
                hhg1.n(f4i1.c(i, "must be power of 2 between 2^1 and 2^30: "));
                return null;
            }
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }

        public static final boolean k(ContextTrack contextTrack, String str, String str2) {
            return contextTrack.uid().equals(str) || contextTrack.uri().equals(str2);
        }

        public static void k0(int i, int i2, Object obj) {
            if (obj instanceof byte[]) {
                ((byte[]) obj)[i] = (byte) i2;
            } else if (obj instanceof short[]) {
                ((short[]) obj)[i] = (short) i2;
            } else {
                ((int[]) obj)[i] = i2;
            }
        }

        public static final String l(ContextTrack contextTrack) {
            return o7h.y0(m(contextTrack), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
        }

        public static final ArrayList m(ContextTrack contextTrack) {
            j380 j380VarMetadata = contextTrack.metadata();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : j380VarMetadata.entrySet()) {
                String str = (String) entry.getKey();
                str.getClass();
                if (nhc1.Y(str, "artist_name", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection collectionValues = new TreeMap(linkedHashMap).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                String str2 = (String) obj;
                str2.getClass();
                if (!ihc1.y0(str2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static final ArrayList n(ContextTrack contextTrack) {
            j380 j380VarMetadata = contextTrack.metadata();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : j380VarMetadata.entrySet()) {
                String str = (String) entry.getKey();
                str.getClass();
                if (nhc1.Y(str, "artist_uri", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection collectionValues = new TreeMap(linkedHashMap).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                String str2 = (String) obj;
                str2.getClass();
                if (!ihc1.y0(str2)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static final String o(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "audio_association_image_small");
            return (strA0 == null || nhc1.Y(strA0, "http", false) || nhc1.Y(strA0, "spotify:image:", false)) ? strA0 : "spotify:image:".concat(strA0);
        }

        public static final boolean p(ContextTrack contextTrack) {
            return P(contextTrack) && Boolean.parseBoolean((String) contextTrack.metadata().get("podcast.contains_sponsored_content"));
        }

        public static final String q(ContextTrack contextTrack) {
            return a0(contextTrack, "image_url");
        }

        public static final String r(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "image_large_url");
            return strA0 == null ? a0(contextTrack, "image_url") : strA0;
        }

        public static final String s(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "image_small_url");
            return strA0 == null ? a0(contextTrack, "image_url") : strA0;
        }

        public static final String t(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "image_xlarge_url");
            return strA0 == null ? r(contextTrack) : strA0;
        }

        public static final boolean u(ContextTrack contextTrack) {
            String strX;
            return v(contextTrack) && (strX = x(contextTrack)) != null && nhc1.Y(strX, "spotify:clip:", false);
        }

        public static final boolean v(ContextTrack contextTrack) {
            return u890.j(w(contextTrack), "standalone");
        }

        public static final String w(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "pointer.npv_mode");
            if (strA0 != null) {
                return strA0;
            }
            if (nhc1.Y(contextTrack.uri(), "spotify:podcast-chapter:", false) || nhc1.Y(contextTrack.uri(), "spotify:clip:", false)) {
                return "standalone";
            }
            return null;
        }

        public static final String x(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "pointer.uri");
            if (strA0 != null) {
                return strA0;
            }
            if (nhc1.Y(contextTrack.uri(), "spotify:podcast-chapter:", false) || nhc1.Y(contextTrack.uri(), "spotify:clip:", false)) {
                return contextTrack.uri();
            }
            return null;
        }

        public static final String y(ContextTrack contextTrack) {
            String strA0 = a0(contextTrack, "extracted_color");
            if (strA0 != null) {
                return "#".concat(strA0);
            }
            return null;
        }

        public static final Long z(zoy0 zoy0Var, yqg yqgVar) {
            Long lA = A(zoy0Var, yqgVar);
            if (lA != null) {
                return Long.valueOf(lA.longValue() / 1000);
            }
            return null;
        }
    }
