package p;

import android.os.Looper;
import android.util.TypedValue;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.zxing.WriterException;
import com.spotify.allboarding.model.v1.proto.Banner;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.NullableString;
import com.spotify.allboarding.model.v1.proto.Pill;
import com.spotify.allboarding.model.v1.proto.SquircleArtist;
import com.spotify.allboarding.model.v1.proto.SquircleArtistMore;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import com.spotify.allboarding.model.v1.proto.SquircleShowMore;
import com.spotify.personalizedepisodes.contentservice.v1.Schedule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cpn1 {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static b180 e;

    public static final qpl A(SquircleShow squircleShow) {
        String value;
        String value2;
        String uri = squircleShow.getUri();
        String strV = squircleShow.v();
        h290<SquircleShow> h290VarR = squircleShow.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (SquircleShow squircleShow2 : h290VarR) {
            squircleShow2.getClass();
            arrayList.add(A(squircleShow2));
        }
        h290 h290VarU = squircleShow.u();
        int iO = squircleShow.o();
        NullableString nullableStringQ = squircleShow.q();
        if (nullableStringQ == null || (value = nullableStringQ.getValue()) == null) {
            value = "";
        }
        boolean zS = squircleShow.s();
        NullableString nullableStringP = squircleShow.p();
        if (nullableStringP == null || (value2 = nullableStringP.getValue()) == null) {
            value2 = "";
        }
        return new qpl(uri, strV, arrayList, h290VarU, iO, value, zS, value2, squircleShow.t(), 1);
    }

    public static final xl81 B(Item item) {
        String value;
        String value2;
        int iP = item.p();
        switch (iP == 0 ? -1 : yxl.a[l1d.C(iP)]) {
            case 1:
                return z(item.r());
            case 2:
                SquircleArtistMore squircleArtistMoreS = item.s();
                String uri = squircleArtistMoreS.getUri();
                String strT = squircleArtistMoreS.t();
                h290<SquircleArtist> h290VarR = squircleArtistMoreS.r();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
                for (SquircleArtist squircleArtist : h290VarR) {
                    squircleArtist.getClass();
                    arrayList.add(z(squircleArtist));
                }
                h290 h290VarS = squircleArtistMoreS.s();
                int iP2 = squircleArtistMoreS.p();
                NullableString nullableStringQ = squircleArtistMoreS.q();
                return new ckm0(uri, strT, arrayList, h290VarS, iP2, (nullableStringQ == null || (value = nullableStringQ.getValue()) == null) ? "" : value, squircleArtistMoreS.n(), 2);
            case 3:
                Banner bannerN = item.n();
                return new w4a(bannerN.getUri(), bannerN.q(), bannerN.o(), bannerN.getImageUrl(), bannerN.p());
            case 4:
                Pill pillQ = item.q();
                return new o2g(pillQ.getUri(), pillQ.q(), pillQ.p(), pillQ.n());
            case 5:
                return A(item.t());
            case 6:
                SquircleShowMore squircleShowMoreU = item.u();
                String uri2 = squircleShowMoreU.getUri();
                String strT2 = squircleShowMoreU.t();
                h290<SquircleShow> h290VarR2 = squircleShowMoreU.r();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarR2, 10));
                for (SquircleShow squircleShow : h290VarR2) {
                    squircleShow.getClass();
                    arrayList2.add(A(squircleShow));
                }
                h290 h290VarS2 = squircleShowMoreU.s();
                int iP3 = squircleShowMoreU.p();
                NullableString nullableStringQ2 = squircleShowMoreU.q();
                return new ckm0(uri2, strT2, arrayList2, h290VarS2, iP3, (nullableStringQ2 == null || (value2 = nullableStringQ2.getValue()) == null) ? "" : value2, squircleShowMoreU.n(), 1);
            default:
                return tb90.a;
        }
    }

    public static final xk41 C(Schedule schedule) {
        n7r n7rVar;
        int iOrdinal = schedule.q().ordinal();
        int i = 2;
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                i = 4;
                if (iOrdinal != 4) {
                    i = 1;
                }
            } else {
                i = 3;
            }
        }
        m7r m7rVar = (m7r) o7h.s0(schedule.o());
        n7r n7rVar2 = null;
        n7r n7rVar3 = n7r.a;
        if (m7rVar != null) {
            switch (m7rVar.ordinal()) {
                case 2:
                    n7rVar = n7r.b;
                    break;
                case 3:
                    n7rVar = n7r.c;
                    break;
                case 4:
                    n7rVar = n7r.d;
                    break;
                case 5:
                    n7rVar = n7r.e;
                    break;
                case 6:
                    n7rVar = n7r.f;
                    break;
                case 7:
                    n7rVar = n7r.g;
                    break;
                default:
                    n7rVar = n7rVar3;
                    break;
            }
        } else {
            n7rVar = null;
        }
        if (n7rVar != null) {
            n7rVar2 = n7rVar;
        } else if (i == 3) {
            n7rVar2 = n7rVar3;
        }
        return new xk41(i, n7rVar2);
    }

    public static final Schedule D(xk41 xk41Var) {
        dm41 dm41Var;
        m7r m7rVar;
        wk41 wk41VarR = Schedule.r();
        int iC = l1d.C(xk41Var.a);
        m7r m7rVar2 = null;
        if (iC == 0) {
            dm41Var = dm41.c;
        } else if (iC == 1) {
            dm41Var = dm41.d;
        } else if (iC == 2) {
            dm41Var = dm41.e;
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            dm41Var = dm41.f;
        }
        wk41VarR.q(dm41Var);
        n7r n7rVar = xk41Var.b;
        if (n7rVar != null) {
            switch (n7rVar.ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    m7rVar = m7r.c;
                    break;
                case 1:
                    m7rVar = m7r.d;
                    break;
                case 2:
                    m7rVar = m7r.e;
                    break;
                case 3:
                    m7rVar = m7r.f;
                    break;
                case 4:
                    m7rVar = m7r.g;
                    break;
                case 5:
                    m7rVar = m7r.h;
                    break;
                case 6:
                    m7rVar = m7r.i;
                    break;
                default:
                    eg.o();
                    return null;
            }
            m7rVar2 = m7rVar;
        }
        wk41VarR.n(p7h.N(m7rVar2));
        return wk41VarR.build();
    }

    public static final psw E(iox0 iox0Var, gw70 gw70Var, idm idmVar, hft0 hft0Var) {
        j2i j2iVar = new j2i(177950394, new pj0(gw70Var, idmVar, hft0Var, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2 A[PHI: r5 r9 r10
      0x00d2: PHI (r5v18 int) = (r5v12 int), (r5v20 int), (r5v21 int) binds: [B:81:0x00eb, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r9v8 p.qim0) = (r9v4 p.qim0), (r9v2 p.qim0), (r9v2 p.qim0) binds: [B:81:0x00eb, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d2: PHI (r10v13 p.yf) = (r10v7 p.yf), (r10v6 p.yf), (r10v6 p.yf) binds: [B:81:0x00eb, B:72:0x00ce, B:73:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:98:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x0150  */
    public static final void a(String str, String str2, Function0 function0, qim0 qim0Var, yf yfVar, djc0 djc0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        yf idxVar;
        djc0 djc0Var2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        yf yfVar2;
        djc0 djc0Var3;
        h311 h311VarV;
        int i4;
        qim0 qim0Var4;
        int i5;
        qim0 qim0Var5;
        yf yfVar3;
        Object objT;
        qim0 qim0VarA;
        boolean z2;
        Object objT2;
        Object objT3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-332150763);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    idxVar = yfVar;
                    int i7 = b0kVar3.i(idxVar) ? 16384 : 8192;
                    i3 |= i7;
                } else {
                    idxVar = yfVar;
                }
                i3 |= i7;
            } else {
                idxVar = yfVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    djc0Var2 = djc0Var;
                    int i8 = b0kVar3.i(djc0Var2) ? 131072 : 65536;
                    i3 |= i8;
                } else {
                    djc0Var2 = djc0Var;
                }
                i3 |= i8;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                i4 = i & 1;
                qim0Var4 = nim0.a;
                if (i4 != 0 || b0kVar3.E()) {
                    if (i6 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        idxVar = new idx(8);
                    }
                    if ((i2 & 32) != 0) {
                        djc0Var3 = bjc0.a;
                        yf yfVar4 = idxVar;
                        i5 = i3 & (-458753);
                        qim0Var5 = qim0Var2;
                        yfVar3 = yfVar4;
                    }
                    b0kVar3.s();
                    if (function0 != null) {
                        b0kVar3.i0(501647436);
                        objT3 = b0kVar3.T();
                        if (objT3 == m4cVar) {
                            objT3 = jpc.Z;
                            b0kVar3.s0(objT3);
                        }
                        qim0VarA = s161.b(qim0Var4, false, (iu30) objT3);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(501841589);
                        qim0 qim0VarX = j9k1.x(qim0Var4, kna.f);
                        objT = b0kVar3.T();
                        if (objT == m4cVar) {
                            objT = jpc.N0;
                            b0kVar3.s0(objT);
                        }
                        qim0VarA = s161.a(qim0VarX, (iu30) objT);
                        b0kVar3.r(false);
                    }
                    qim0 qim0VarN = anm1.N(str2, qim0Var5.then(qim0VarA));
                    gdx gdxVarS = yla.s(b0kVar3);
                    z2 = (i5 & 896) == 256;
                    objT2 = b0kVar3.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new pj8(function0, (byte) 15);
                        b0kVar3.s0(objT2);
                    }
                    b0kVar2 = b0kVar3;
                    foo1.c(new gbx(z50.c, (Function0) objT2), yfVar3, qim0VarN, null, gdxVarS, null, null, null, null, null, apo.r(299427284, new hj8(str, djc0Var3, (byte) 25), b0kVar3), b0kVar2, (i5 >> 9) & 112, 48, 2008);
                    qim0Var3 = qim0Var5;
                    yfVar2 = yfVar3;
                } else {
                    b0kVar3.b0();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                }
                yf yfVar5 = idxVar;
                i5 = i3;
                qim0Var5 = qim0Var2;
                yfVar3 = yfVar5;
                djc0Var3 = djc0Var2;
                b0kVar3.s();
                if (function0 != null) {
                    b0kVar3.i0(501647436);
                    objT3 = b0kVar3.T();
                    if (objT3 == m4cVar) {
                        objT3 = jpc.Z;
                        b0kVar3.s0(objT3);
                    }
                    qim0VarA = s161.b(qim0Var4, false, (iu30) objT3);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(501841589);
                    qim0 qim0VarX2 = j9k1.x(qim0Var4, kna.f);
                    objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = jpc.N0;
                        b0kVar3.s0(objT);
                    }
                    qim0VarA = s161.a(qim0VarX2, (iu30) objT);
                    b0kVar3.r(false);
                }
                qim0 qim0VarN2 = anm1.N(str2, qim0Var5.then(qim0VarA));
                gdx gdxVarS2 = yla.s(b0kVar3);
                if ((i5 & 896) == 256) {
                }
                objT2 = b0kVar3.T();
                if (z2) {
                    objT2 = new pj8(function0, (byte) 15);
                    b0kVar3.s0(objT2);
                } else {
                    objT2 = new pj8(function0, (byte) 15);
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(z50.c, (Function0) objT2), yfVar3, qim0VarN2, null, gdxVarS2, null, null, null, null, null, apo.r(299427284, new hj8(str, djc0Var3, (byte) 25), b0kVar3), b0kVar2, (i5 >> 9) & 112, 48, 2008);
                qim0Var3 = qim0Var5;
                yfVar2 = yfVar3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                yfVar2 = idxVar;
                djc0Var3 = djc0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(str, str2, function0, qim0Var3, yfVar2, djc0Var3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                idxVar = yfVar;
                if (b0kVar3.i(idxVar)) {
                }
                i3 |= i7;
            } else {
                idxVar = yfVar;
            }
            i3 |= i7;
        } else {
            idxVar = yfVar;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                djc0Var2 = djc0Var;
                if (b0kVar3.i(djc0Var2)) {
                }
                i3 |= i8;
            } else {
                djc0Var2 = djc0Var;
            }
            i3 |= i8;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            i4 = i & 1;
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    idxVar = new idx(8);
                }
                if ((i2 & 32) != 0) {
                    djc0Var3 = bjc0.a;
                    yf yfVar6 = idxVar;
                    i5 = i3 & (-458753);
                    qim0Var5 = qim0Var2;
                    yfVar3 = yfVar6;
                } else {
                    yf yfVar7 = idxVar;
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    yfVar3 = yfVar7;
                    djc0Var3 = djc0Var2;
                }
            } else {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    idxVar = new idx(8);
                }
                if ((i2 & 32) != 0) {
                    djc0Var3 = bjc0.a;
                    yf yfVar8 = idxVar;
                    i5 = i3 & (-458753);
                    qim0Var5 = qim0Var2;
                    yfVar3 = yfVar8;
                } else {
                    yf yfVar9 = idxVar;
                    i5 = i3;
                    qim0Var5 = qim0Var2;
                    yfVar3 = yfVar9;
                    djc0Var3 = djc0Var2;
                }
            }
            b0kVar3.s();
            if (function0 != null) {
                b0kVar3.i0(501647436);
                objT3 = b0kVar3.T();
                if (objT3 == m4cVar) {
                    objT3 = jpc.Z;
                    b0kVar3.s0(objT3);
                }
                qim0VarA = s161.b(qim0Var4, false, (iu30) objT3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(501841589);
                qim0 qim0VarX3 = j9k1.x(qim0Var4, kna.f);
                objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = jpc.N0;
                    b0kVar3.s0(objT);
                }
                qim0VarA = s161.a(qim0VarX3, (iu30) objT);
                b0kVar3.r(false);
            }
            qim0 qim0VarN3 = anm1.N(str2, qim0Var5.then(qim0VarA));
            gdx gdxVarS3 = yla.s(b0kVar3);
            if ((i5 & 896) == 256) {
            }
            objT2 = b0kVar3.T();
            if (z2) {
                objT2 = new pj8(function0, (byte) 15);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new pj8(function0, (byte) 15);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT2), yfVar3, qim0VarN3, null, gdxVarS3, null, null, null, null, null, apo.r(299427284, new hj8(str, djc0Var3, (byte) 25), b0kVar3), b0kVar2, (i5 >> 9) & 112, 48, 2008);
            qim0Var3 = qim0Var5;
            yfVar2 = yfVar3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            yfVar2 = idxVar;
            djc0Var3 = djc0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(str, str2, function0, qim0Var3, yfVar2, djc0Var3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static final void b(int i, int i2, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        j2i j2iVar2;
        b0k b0kVar2;
        boolean z5;
        boolean z6;
        qim0 qim0Var2;
        h311 h311VarV;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1795455155);
        int i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        int i4 = i3 | 3504;
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= b0kVar3.h(z3) ? 16384 : 8192;
            }
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i4 & 1, z4)) {
                if (i5 != 0) {
                    z3 = true;
                }
                j2iVar2 = j2iVar;
                b0kVar2 = b0kVar3;
                x74.f(function0, (scx) null, (mfx) null, false, true, 0.0f, false, Boolean.valueOf(z3), false, false, (vu30) null, apo.r(-1783982670, new rv71(j2iVar2), b0kVar3), b0kVar2, (i4 & 14) | 1597440 | ((i4 << 9) & 29360128), 48, 1838);
                z6 = z3;
                z5 = true;
                qim0Var2 = nim0.a;
            } else {
                j2iVar2 = j2iVar;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z;
                z6 = z3;
                qim0Var2 = qim0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tc0(function0, qim0Var2, z5, z6, j2iVar2, i, i2);
            }
        }
        i4 = i3 | 28080;
        z3 = z2;
        if ((74899 & i4) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i4 & 1, z4)) {
            if (i5 != 0) {
                z3 = true;
            }
            j2iVar2 = j2iVar;
            b0kVar2 = b0kVar3;
            x74.f(function0, (scx) null, (mfx) null, false, true, 0.0f, false, Boolean.valueOf(z3), false, false, (vu30) null, apo.r(-1783982670, new rv71(j2iVar2), b0kVar3), b0kVar2, (i4 & 14) | 1597440 | ((i4 << 9) & 29360128), 48, 1838);
            z6 = z3;
            z5 = true;
            qim0Var2 = nim0.a;
        } else {
            j2iVar2 = j2iVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z;
            z6 = z3;
            qim0Var2 = qim0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tc0(function0, qim0Var2, z5, z6, j2iVar2, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(srg1 srg1Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        float f;
        nim0 nim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1021645172);
        int i2 = i | (x340Var.g(srg1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var2);
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
            h(srg1Var.a, new wrg1(2131959401), x340Var, 0);
            op71.g(x340Var, u291.r(nim0Var2, 24.0f));
            foo1.c(new gbx(z50.c, function0), jdx.c, null, null, null, null, null, null, null, null, apo.r(632452919, new rvd1(srg1Var, (byte) 19), x340Var), x340Var, 0, 48, 2044);
            Integer num = srg1Var.b;
            if (num == null) {
                x340Var.i0(-1773604097);
                x340Var.r(false);
                f = 16.0f;
                nim0Var = nim0Var2;
            } else {
                x340Var.i0(-1773604096);
                String strJ = kk0.j(16.0f, num.intValue(), x340Var, x340Var, nim0Var2);
                uwr uwrVar = cbx.a;
                f = 16.0f;
                nim0Var = nim0Var2;
                uwo1.e(strJ, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
                x340Var = x340Var;
                x340Var.r(false);
            }
            ywx0.n(nim0Var, f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(srg1Var, function0, i, (byte) 13);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(trg1 trg1Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1366897560);
        int i2 = i | (x340Var.g(trg1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            h(trg1Var.a, trg1Var.b, x340Var, 0);
            op71.g(x340Var, u291.r(nim0Var, 24.0f));
            foo1.c(new gbx(z50.c, function0), new idx(4), null, null, null, null, null, null, null, null, apo.r(-1273971645, new rvd1(trg1Var, (byte) 20), x340Var), x340Var, 0, 48, 2044);
            op71.g(x340Var, u291.r(nim0Var, 24.0f));
            String strO0 = cwl1.o0(x340Var, trg1Var.c);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(trg1Var, function0, i, (byte) 14);
        }
    }

    public static final void e(jkr0 jkr0Var, qim0 qim0Var, b0k b0kVar, int i) {
        u5j1 u5j1Var;
        kl1 kl1Var = jkr0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(385463298);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(jkr0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            String strN0 = cwl1.n0(2131959475, new Object[]{Integer.valueOf(((err0) kl1Var.c).s() + 1), Integer.valueOf(jkr0Var.l())}, x340Var);
            qim0 qim0VarB = u291.B(qim0Var, (gra) null, 3);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new atp0(strN0, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarU = qxy0.u(s161.b(qim0VarB, true, (iu30) objT), (idn0) null, 3);
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarU);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB2 = u291.B(nim0Var, (gra) null, 3);
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
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
            x340Var.i0(413109786);
            int iL = jkr0Var.l();
            int i3 = 0;
            while (true) {
                u5j1Var = d4o1.a;
                if (i3 >= iL) {
                    break;
                }
                ((err0) kl1Var.c).s();
                x340Var.i0(-199800764);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.b;
                x340Var.r(false);
                t1c.a(u291.r(dug.f(i1p1.q(nim0Var, er31.a), j, u5j1Var), 8.0f), x340Var, 0);
                i3++;
            }
            x340Var.r(false);
            x340Var.r(true);
            x340Var.i0(940375559);
            qim0 qim0VarQ = i1p1.q(i541.C(nim0Var, new ja5(jkr0Var, (flb0) x340Var.k(t4k.n), ((wat) x340Var.k(t4k.h)).X0(16.0f), (byte) 7)), er31.a);
            uwr uwrVar2 = cbx.a;
            t1c.a(u291.r(dug.f(qim0VarQ, cbx.a(x340Var).b.a, u5j1Var), 8.0f), x340Var, 0);
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(jkr0Var, qim0Var, i, (byte) 19);
        }
    }

    public static final void f(urg1 urg1Var, b0k b0kVar, int i) {
        qim0 qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-759170370);
        int i2 = i | (x340Var.g(urg1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            String strO0 = cwl1.o0(x340Var, urg1Var.a);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            Integer num = urg1Var.b;
            if (num == null) {
                x340Var.i0(-866213853);
                x340Var.r(false);
                qim0Var = qim0Var2;
            } else {
                x340Var.i0(-866213852);
                qim0Var = qim0Var2;
                uwo1.e(kk0.j(8.0f, num.intValue(), x340Var, x340Var, qim0Var2), null, cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
                x340Var.r(false);
            }
            op71.g(x340Var, u291.r(qim0Var, 64.0f));
            xto1.e(null, 4, cbx.a(x340Var).c.a, 0L, x340Var, 48, 9);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wcf1(urg1Var, i, (byte) 17);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(yrg1 yrg1Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2112163034);
        int i2 = (x340Var.g(yrg1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            h(yrg1Var.a, yrg1Var.b, x340Var, 0);
            if (yrg1Var.c != null) {
                x340Var.i0(2097216309);
                op71.g(x340Var, u291.r(nim0Var, 24.0f));
                foo1.c(new gbx(z50.c, function0), new idx(), null, null, null, null, null, null, null, null, apo.r(458054154, new wcf1(yrg1Var, (byte) 18), x340Var), x340Var, 0, 48, 2044);
                ywx0.n(nim0Var, 16.0f, x340Var, false);
            } else {
                x340Var.i0(2097517040);
                op71.g(x340Var, u291.r(nim0Var, 32.0f));
                klx klxVar = klx.c;
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).b.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(klxVar, isl.a, u291.r(nim0Var, 24.0f), j, 0L, false, x340Var, klx.d | 48, 48);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(yrg1Var, function0, i, (byte) 15);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(int i, xrg1 xrg1Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        String strU;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1873562213);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(xrg1Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            String strO0 = cwl1.o0(x340Var, i);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            if (xrg1Var instanceof wrg1) {
                x340Var.i0(1482357194);
                strU = cwl1.o0(x340Var, ((wrg1) xrg1Var).a);
                x340Var.r(false);
            } else {
                if (!(xrg1Var instanceof vrg1)) {
                    throw p3d1.k(x340Var, 1482355157, false);
                }
                x340Var.i0(1482360082);
                vrg1 vrg1Var = (vrg1) xrg1Var;
                int i4 = vrg1Var.a;
                int i5 = vrg1Var.b;
                strU = cwl1.U(i4, i5, new Object[]{Integer.valueOf(i5)}, x340Var);
                x340Var.r(false);
            }
            uwo1.e(strU, null, cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(i, xrg1Var, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(zrg1 zrg1Var, msg1 msg1Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1610197570);
        int i2 = i | (x340Var.g(zrg1Var) ? 4 : 2) | (x340Var.g(msg1Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(function2) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarB = u291.b(0.0f, 260.0f, 1, u291.f(qim0Var2, 1.0f));
            uwr uwrVar = cbx.a;
            qim0 qim0VarA = uyn1.A(voo1.y(dug.f(qim0VarB, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.g), 16.0f, 16.0f, 16.0f, 48.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            if (msg1Var.equals(isg1.a)) {
                x340Var.i0(-1867405836);
                srg1 srg1Var = zrg1Var.d;
                boolean z = (i2 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new uuc1(function1, (byte) 26);
                    x340Var.s0(objT);
                }
                c(srg1Var, (Function0) objT, x340Var, 0);
                x340Var.r(false);
            } else if (msg1Var.equals(jsg1.a)) {
                x340Var.i0(-1867403337);
                trg1 trg1Var = zrg1Var.a;
                boolean z2 = (i2 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new uuc1(function0, (byte) 27);
                    x340Var.s0(objT2);
                }
                d(trg1Var, (Function0) objT2, x340Var, 0);
                x340Var.r(false);
            } else if (msg1Var.equals(ksg1.a)) {
                x340Var.i0(-1867400764);
                f(zrg1Var.b, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!msg1Var.equals(lsg1.a)) {
                    throw p3d1.k(x340Var, -1867407095, false);
                }
                x340Var.i0(-1867398762);
                yrg1 yrg1Var = zrg1Var.c;
                boolean z3 = (i2 & 57344) == 16384;
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new uuc1(function2, (byte) 28);
                    x340Var.s0(objT3);
                }
                g(yrg1Var, (Function0) objT3, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(zrg1Var, msg1Var, function0, function1, function2, qim0Var2, i, (byte) 17);
        }
    }

    public static final boolean j() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v26 */
    public static void k(owa owaVar, ogz ogzVar, w3j1 w3j1Var, int i, pyp0 pyp0Var) throws WriterException {
        int i2;
        ?? r13;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[][] bArr = (byte[][]) pyp0Var.d;
        int i7 = pyp0Var.b;
        int i8 = pyp0Var.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = a[0].length;
        q(0, 0, pyp0Var);
        int i9 = i7 - length;
        q(i9, 0, pyp0Var);
        q(0, i9, pyp0Var);
        p(0, 7, pyp0Var);
        int i10 = i7 - 8;
        p(i10, 7, pyp0Var);
        p(0, i10, pyp0Var);
        r(7, 0, pyp0Var);
        int i11 = i8 - 8;
        r(i11, 0, pyp0Var);
        int i12 = i8 - 7;
        r(7, i12, pyp0Var);
        if (pyp0Var.q(8, i11) == 0) {
            throw new WriterException();
        }
        pyp0Var.w(8, i11, 1);
        byte b2 = w3j1Var.a;
        int i13 = 5;
        if (b2 < 2) {
            i2 = 0;
        } else {
            int[] iArr = c[b2 - 1];
            i2 = 0;
            int length2 = iArr.length;
            int i14 = 0;
            while (i14 < length2) {
                int i15 = iArr[i14];
                if (i15 >= 0) {
                    int length3 = iArr.length;
                    int i16 = 0;
                    while (i16 < length3) {
                        int i17 = iArr[i16];
                        if (i17 >= 0 && u(pyp0Var.q(i17, i15))) {
                            int i18 = i17 - 2;
                            int i19 = i15 - 2;
                            int i20 = 0;
                            while (i20 < i13) {
                                int[] iArr2 = b[i20];
                                int i21 = i20;
                                int i22 = 0;
                                while (i22 < i13) {
                                    int i23 = i22;
                                    pyp0Var.w(i18 + i22, i19 + i21, iArr2[i23]);
                                    i22 = i23 + 1;
                                    i7 = i7;
                                    i13 = 5;
                                }
                                i20 = i21 + 1;
                                i13 = 5;
                            }
                        }
                        i16++;
                        i7 = i7;
                        i13 = 5;
                    }
                }
                i14++;
                i7 = i7;
                i13 = 5;
            }
        }
        int i24 = i7;
        int i25 = 8;
        while (i25 < i10) {
            int i26 = i25 + 1;
            int i27 = i26 % 2;
            if (u(pyp0Var.q(i25, 6))) {
                pyp0Var.w(i25, 6, i27);
            }
            if (u(pyp0Var.q(6, i25))) {
                pyp0Var.w(6, i25, i27);
            }
            i25 = i26;
        }
        owa owaVar2 = new owa();
        if (i < 0 || i >= 8) {
            throw new WriterException("Invalid mask pattern");
        }
        int i28 = (ogzVar.a << 3) | i;
        owaVar2.b(i28, 5);
        owaVar2.b(l(i28, 1335), 10);
        owa owaVar3 = new owa();
        owaVar3.b(21522, 15);
        if (owaVar2.b != owaVar3.b) {
            hhg1.n("Sizes don't match");
            return;
        }
        int i29 = i2;
        while (true) {
            int[] iArr3 = owaVar2.a;
            if (i29 >= iArr3.length) {
                break;
            }
            iArr3[i29] = iArr3[i29] ^ owaVar3.a[i29];
            i29++;
        }
        if (owaVar2.b != 15) {
            throw new WriterException("should not happen but we got: " + owaVar2.b);
        }
        int i30 = i2;
        while (true) {
            int i31 = owaVar2.b;
            if (i30 >= i31) {
                break;
            }
            boolean zE = owaVar2.e((i31 - 1) - i30);
            int[] iArr4 = d[i30];
            pyp0Var.x(iArr4[i2], iArr4[1], zE);
            if (i30 < 8) {
                pyp0Var.x((i24 - i30) - 1, 8, zE);
            } else {
                pyp0Var.x(8, (i30 - 8) + i12, zE);
            }
            i30++;
        }
        if (b2 >= 7) {
            owa owaVar4 = new owa();
            owaVar4.b(b2, 6);
            owaVar4.b(l(b2, 7973), 12);
            if (owaVar4.b != 18) {
                throw new WriterException("should not happen but we got: " + owaVar4.b);
            }
            int i32 = 17;
            for (int i33 = i2; i33 < 6; i33++) {
                for (int i34 = i2; i34 < 3; i34++) {
                    boolean zE2 = owaVar4.e(i32);
                    i32--;
                    int i35 = (i8 - 11) + i34;
                    pyp0Var.x(i33, i35, zE2);
                    pyp0Var.x(i35, i33, zE2);
                }
            }
        }
        int i36 = i24 - 1;
        int i37 = i8 - 1;
        int i38 = i2;
        int i39 = -1;
        while (i36 > 0) {
            if (i36 == 6) {
                i36--;
            }
            while (i37 >= 0 && i37 < i8) {
                for (int i40 = i2; i40 < 2; i40++) {
                    int i41 = i36 - i40;
                    if (u(pyp0Var.q(i41, i37))) {
                        if (i38 < owaVar.b) {
                            boolean zE3 = owaVar.e(i38);
                            i38++;
                            r13 = zE3;
                        } else {
                            r13 = i2;
                        }
                        if (i != -1) {
                            switch (i) {
                                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                    i3 = i37 + i41;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 1:
                                    i4 = i37 & 1;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 2:
                                    i4 = i41 % 3;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 3:
                                    i4 = (i37 + i41) % 3;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 4:
                                    i4 = ((i41 / 3) + (i37 / 2)) & 1;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 5:
                                    int i42 = i37 * i41;
                                    i4 = (i42 % 3) + (i42 & 1);
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 6:
                                    int i43 = i37 * i41;
                                    i5 = i43 & 1;
                                    i6 = i43 % 3;
                                    i3 = i6 + i5;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                case 7:
                                    i6 = (i37 * i41) % 3;
                                    i5 = (i37 + i41) & 1;
                                    i3 = i6 + i5;
                                    i4 = i3 & 1;
                                    if (i4 == 0) {
                                        r13 = ~r13;
                                    }
                                    break;
                                default:
                                    hhg1.n("Invalid mask pattern: ".concat(String.valueOf(i)));
                                    return;
                            }
                        }
                        pyp0Var.x(i41, i37, (boolean) r13);
                    }
                }
                i37 += i39;
            }
            i39 = -i39;
            i37 += i39;
            i36 -= 2;
        }
        if (i38 == owaVar.b) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i38 + '/' + owaVar.b);
    }

    public static int l(int i, int i2) {
        if (i2 == 0) {
            hhg1.n("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }

    public static final p1p1 m(boolean z, boolean z2, r4z r4zVar) {
        int i = r4zVar.h;
        if (z2 && i == 3) {
            return new zqt0(1);
        }
        if (z2) {
            return new zqt0(2);
        }
        if (z) {
            return qrt0.c;
        }
        if (i == 4) {
            return new zqt0(3);
        }
        return i == 3 ? new zqt0(1) : yqt0.d;
    }

    public static apn0 n(TypedValue typedValue, apn0 apn0Var, apn0 apn0Var2, String str, String str2) throws XmlPullParserException {
        if (apn0Var == null || apn0Var == apn0Var2) {
            return apn0Var == null ? apn0Var2 : apn0Var;
        }
        StringBuilder sbN = gvg.n("Type is ", str, " but found ", str2, ": ");
        sbN.append(typedValue.data);
        throw new XmlPullParserException(sbN.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static final rgt o(jla0 jla0Var, List list, boolean z) throws i9n {
        beg begVarO;
        f1h1 phb1Var;
        if (jla0Var instanceof bla0) {
            begVarO = ((bla0) jla0Var).O();
        } else {
            if (!(jla0Var instanceof qma0)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(jla0Var);
                Class<?> cls = jla0Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new i9n(sb.toString());
            }
            qma0 qma0Var = (qma0) jla0Var;
            beg begVar = qma0Var.e;
            if (begVar == null) {
                hhg1.o(qma0Var, "Descriptor-less type parameter: ");
                return null;
            }
            begVarO = begVar;
        }
        anm1.n(begVarO.g().getParameters().size(), list.size());
        h0h1 h0h1VarG = begVarO.g();
        List parameters = h0h1VarG.getParameters();
        e0h1.b.getClass();
        e0h1 e0h1Var = e0h1.c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            tma0 tma0Var = (tma0) obj;
            rgt rgtVar = tma0Var.b;
            a8b0 a8b0Var = rgtVar != null ? rgtVar.b : null;
            int i3 = tma0Var.a;
            int i4 = i3 == 0 ? -1 : oka0.a[l1d.C(i3)];
            if (i4 == -1) {
                phb1Var = new phb1((y0h1) parameters.get(i));
            } else if (i4 == 1) {
                a8b0Var.getClass();
                phb1Var = new f1h1(1, a8b0Var);
            } else if (i4 == 2) {
                a8b0Var.getClass();
                phb1Var = new f1h1(2, a8b0Var);
            } else {
                if (i4 != 3) {
                    eg.o();
                    return null;
                }
                a8b0Var.getClass();
                phb1Var = new f1h1(3, a8b0Var);
            }
            arrayList.add(phb1Var);
            i = i2;
        }
        return new rgt(y3o1.i0(arrayList, e0h1Var, h0h1VarG, z));
    }

    public static void p(int i, int i2, pyp0 pyp0Var) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!u(pyp0Var.q(i4, i2))) {
                throw new WriterException();
            }
            pyp0Var.w(i4, i2, 0);
        }
    }

    public static void q(int i, int i2, pyp0 pyp0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                pyp0Var.w(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void r(int i, int i2, pyp0 pyp0Var) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!u(pyp0Var.q(i, i4))) {
                throw new WriterException();
            }
            pyp0Var.w(i, i4, 0);
        }
    }

    public static String s(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean u(int i) {
        return i == -1;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static ebu w(blc0 blc0Var) {
        return new ebu(blc0Var, (byte) 7);
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final boolean y(ibg0 ibg0Var, boolean z) {
        int iOrdinal = ibg0Var.ordinal();
        if (iOrdinal == 0) {
            return z;
        }
        if (iOrdinal == 1) {
            return true;
        }
        eg.o();
        return false;
    }

    public static final qpl z(SquircleArtist squircleArtist) {
        String value;
        String value2;
        String uri = squircleArtist.getUri();
        String strV = squircleArtist.v();
        h290<SquircleArtist> h290VarR = squircleArtist.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (SquircleArtist squircleArtist2 : h290VarR) {
            squircleArtist2.getClass();
            arrayList.add(z(squircleArtist2));
        }
        h290 h290VarU = squircleArtist.u();
        int iO = squircleArtist.o();
        NullableString nullableStringQ = squircleArtist.q();
        if (nullableStringQ == null || (value = nullableStringQ.getValue()) == null) {
            value = "";
        }
        boolean zS = squircleArtist.s();
        NullableString nullableStringP = squircleArtist.p();
        if (nullableStringP == null || (value2 = nullableStringP.getValue()) == null) {
            value2 = "";
        }
        return new qpl(uri, strV, arrayList, h290VarU, iO, value, zS, value2, squircleArtist.t(), 2);
    }

    public s650 t(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1010309204);
        uwr uwrVar = cbx.a;
        s650 s650Var = new s650(p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(x340Var).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(cbx.a(x340Var).a.c)}));
        x340Var.r(false);
        return s650Var;
    }
}
