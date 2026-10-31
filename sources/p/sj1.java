package p;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.media3.common.ParserException;
import com.google.protobuf.Timestamp;
import com.spotify.accountswitching.v1.Account;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.highlightsstats.ShareConfiguration;
import com.spotify.highlightsstats.Track;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.EmptyShareContent;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.Highlight;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.HighlightArtworkItem;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.Navigation;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.OverlappingHighlightArtwork;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.Signifier;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsAvailabilityDetails;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.TimelineDate;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserListeningStatus;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimeline;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class sj1 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static b180 g;
    public static b180 h;

    /* JADX WARN: Code duplicated, block: B:14:0x0018 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    public static final we10 A(eww0 eww0Var, String str) {
        String str2 = eww0Var != null ? eww0Var.a : str;
        if (eww0Var != null) {
            String str3 = eww0Var.b;
            if (ihc1.y0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                str = str3;
            } else if (eww0Var != null) {
                str = eww0Var.a;
            }
        } else if (eww0Var != null) {
            str = eww0Var.a;
        }
        return new we10(str2, str, eww0Var != null ? eww0Var.f : null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static boolean B(int i, izr0 izr0Var, boolean z) throws ParserException {
        if (izr0Var.a() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "too short header: " + izr0Var.a());
        }
        if (izr0Var.E() != i) {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected header type " + Integer.toHexString(i));
        }
        if (izr0Var.E() == 118 && izr0Var.E() == 111 && izr0Var.E() == 114 && izr0Var.E() == 98 && izr0Var.E() == 105 && izr0Var.E() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.a((RuntimeException) null, "expected characters 'vorbis'");
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static pxa b(yk4 yk4Var, int i) {
        pxa pxaVar = new pxa(yk4Var, (((long) yk4Var.a.getHeight()) & 4294967295L) | (((long) yk4Var.a.getWidth()) << 32));
        pxaVar.h = i;
        return pxaVar;
    }

    public static final void c(gg21 gg21Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        qim0 qim0Var4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(431036454);
        int i4 = i | (x340Var.i(gg21Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var5 = nim0.a;
            qim0 qim0Var6 = i5 != 0 ? qim0Var5 : qim0Var2;
            c380 c380Var = gg21Var.b;
            if (c380Var.isEmpty()) {
                qim0Var4 = qim0Var6;
                x340Var.i0(-943276548);
                x340Var.r(false);
            } else {
                x340Var.i0(-945003465);
                int i6 = gg21Var.a;
                String strU = cwl1.U(2131820885, i6, new Object[]{Integer.valueOf(i6)}, x340Var);
                fra fraVar = een.N0;
                qim0 qim0VarF = u291.f(qim0Var6, 1.0f);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                gdx gdxVarS = yla.s(x340Var);
                qim0 qim0Var7 = qim0Var6;
                ldx ldxVar = ldx.c;
                boolean z = (i3 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new erj(iu30Var, (byte) 13);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strU)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbx gbxVar = new gbx(new y50(strU), function0);
                boolean zG = x340Var.g(strU);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new irf(strU, (byte) 28);
                    x340Var.s0(objT2);
                }
                qim0Var4 = qim0Var7;
                foo1.c(gbxVar, ldxVar, s161.a(qim0Var5, (iu30) objT2), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(203867940, new l2i(c380Var, gg21Var, (byte) 26), x340Var), x340Var, 0, 48, 2008);
                x340Var.r(true);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(gg21Var, iu30Var, qim0Var3, i, i2, (byte) 6);
        }
    }

    public static final void d(int i, int i2, String str, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-25474069);
        int i3 = (x340Var.e(i) ? 32 : 16) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfx.b(18, apo.r(1856331040, new ue0(str, i, (byte) 19), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0(str, i, i2, (byte) 20);
        }
    }

    public static final kya e() {
        return new kya();
    }

    public static final df01 f(c291 c291Var) {
        return new df01(c291Var);
    }

    public static final ff01 g(fka1 fka1Var) {
        return new ff01(fka1Var);
    }

    public static rob0 h(hyc hycVar, a8b0 a8b0Var, ajn0 ajn0Var, fg5 fg5Var, int i) {
        if (hycVar == null) {
            a(32);
            throw null;
        }
        if (fg5Var == null) {
            a(33);
            throw null;
        }
        if (a8b0Var == null) {
            return null;
        }
        gbm gbmVar = new gbm(hycVar, a8b0Var, ajn0Var, (byte) 1);
        se11 se11Var = ikn0.a;
        return new rob0(hycVar, gbmVar, fg5Var, ajn0.e(ikn0.b + '_' + i));
    }

    public static zdy0 i(tdy0 tdy0Var, fg5 fg5Var) {
        return o(tdy0Var, fg5Var, true, tdy0Var.getSource());
    }

    public static fey0 j(tdy0 tdy0Var, fg5 fg5Var) {
        eg5 eg5Var = rzs0.g;
        mka1 source = tdy0Var.getSource();
        if (source != null) {
            return p(tdy0Var, fg5Var, eg5Var, true, tdy0Var.getVisibility(), source);
        }
        a(6);
        throw null;
    }

    public static vdy0 k(beg begVar) {
        if (begVar == null) {
            a(26);
            throw null;
        }
        zim0 zim0VarC = iht.c(begVar);
        beg begVarH = x1p1.h(zim0VarC, ebb1.x);
        if (begVarH == null) {
            return null;
        }
        eg5 eg5Var = rzs0.g;
        lht lhtVar = mht.e;
        vdy0 vdy0VarY1 = vdy0.y1(begVar, 1, false, sfb1.b, 4, begVar.getSource());
        zdy0 zdy0Var = new zdy0(vdy0VarY1, eg5Var, 1, lhtVar, false, false, false, 4, null, begVar.getSource());
        vdy0VarY1.B1(zdy0Var, null, null, null);
        e0h1.b.getClass();
        qx81 qx81VarI0 = y3o1.i0(Collections.singletonList(new f1h1(begVar.m())), e0h1.c, begVarH.g(), false);
        List list = Collections.EMPTY_LIST;
        vdy0VarY1.E1(qx81VarI0, list, null, null, list);
        zdy0Var.A1(vdy0VarY1.getReturnType());
        return vdy0VarY1;
    }

    public static xw81 l(beg begVar) {
        if (begVar == null) {
            a(24);
            throw null;
        }
        eg5 eg5Var = rzs0.g;
        xw81 xw81VarH1 = xw81.H1(begVar, sfb1.c, 4, begVar.getSource());
        tsi1 tsi1Var = new tsi1(xw81VarH1, null, 0, eg5Var, ajn0.e("value"), kht.e(begVar).v(), false, false, false, null, begVar.getSource());
        List list = Collections.EMPTY_LIST;
        return xw81VarH1.B1(null, null, list, list, Collections.singletonList(tsi1Var), begVar.m(), 1, mht.e);
    }

    public static xw81 m(beg begVar) {
        if (begVar == null) {
            a(22);
            throw null;
        }
        xw81 xw81VarH1 = xw81.H1(begVar, sfb1.a, 4, begVar.getSource());
        List list = Collections.EMPTY_LIST;
        return xw81VarH1.B1(null, null, list, list, list, kht.e(begVar).j(begVar.m()), 1, mht.e);
    }

    public static rob0 n(hyc hycVar, a8b0 a8b0Var, fg5 fg5Var) {
        if (a8b0Var == null) {
            return null;
        }
        return new rob0(hycVar, new kz00(hycVar, a8b0Var), fg5Var);
    }

    public static zdy0 o(tdy0 tdy0Var, fg5 fg5Var, boolean z, mka1 mka1Var) {
        if (fg5Var == null) {
            a(18);
            throw null;
        }
        if (mka1Var != null) {
            return new zdy0(tdy0Var, fg5Var, tdy0Var.o(), tdy0Var.getVisibility(), z, false, false, 1, null, mka1Var);
        }
        a(19);
        throw null;
    }

    public static fey0 p(tdy0 tdy0Var, fg5 fg5Var, fg5 fg5Var2, boolean z, lht lhtVar, mka1 mka1Var) {
        if (fg5Var == null) {
            a(8);
            throw null;
        }
        if (fg5Var2 == null) {
            a(9);
            throw null;
        }
        if (lhtVar == null) {
            a(10);
            throw null;
        }
        if (mka1Var == null) {
            a(11);
            throw null;
        }
        fey0 fey0Var = new fey0(tdy0Var, fg5Var, tdy0Var.o(), lhtVar, z, false, false, 1, null, mka1Var);
        fey0Var.N0 = fey0.z1(fey0Var, tdy0Var.getType(), fg5Var2);
        return fey0Var;
    }

    public static final Set q(yw11 yw11Var) {
        Set set = yw11Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((m620) obj).d) {
                arrayList.add(obj);
            }
        }
        return o7h.p1(arrayList);
    }

    public static nrk0 r(Integer num, r6h1 r6h1Var) {
        return new nrk0(num, r6h1Var);
    }

    public static int s(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static Intent t(Context context, we2 we2Var, tv80 tv80Var, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) AgeAssuranceWebViewActivity.class);
        intent2.putExtra("interaction_logging_result", (Parcelable) tv80Var);
        intent2.putExtra("age_assurance_type", (Parcelable) we2Var);
        intent2.putExtra("on_complete_intent", intent);
        return intent2;
    }

    public static int u(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static si1 v(rqe1 rqe1Var, boolean z) {
        dte1 dte1Var;
        String str = rqe1Var.d;
        srt0 srt0Var = rqe1Var.c;
        int i = rqe1Var.a;
        hqe1 hqe1Var = rqe1Var.b;
        if (hqe1Var instanceof iqe1) {
            return new ave1(i);
        }
        if (!(hqe1Var instanceof hqe1)) {
            if (hqe1Var instanceof kqe1) {
                return new bve1(i, o7h.O0(rae0.a, w(((kqe1) hqe1Var).a, srt0Var, z, str)));
            }
            if (hqe1Var instanceof jqe1) {
                return new bve1(i, w(((jqe1) hqe1Var).a, srt0Var, z, str));
            }
            if (hqe1Var instanceof gqe1) {
                return new bve1(i, o7h.O0(qre1.a, w(((gqe1) hqe1Var).a, srt0Var, z, str)));
            }
            if (hqe1Var instanceof lqe1) {
                UserListeningStatus userListeningStatus = ((lqe1) hqe1Var).a;
                return new cve1(i, new rdi1(userListeningStatus.getTitle(), userListeningStatus.getSubtitle(), dve1.a[userListeningStatus.n().ordinal()] == 1 ? 2 : 1, userListeningStatus.p()));
            }
            eg.o();
            return null;
        }
        hqe1 hqe1Var2 = hqe1Var;
        ure1 ure1Var = hqe1Var2.b;
        List list = hqe1Var2.a;
        boolean zIsEmpty = list.isEmpty();
        int i2 = hqe1Var2.c;
        tre1 tre1Var = tre1.a;
        sre1 sre1Var = sre1.a;
        if (!zIsEmpty) {
            boolean zJ = u890.j(ure1Var, sre1Var);
            xgz xgzVar = xgz.a;
            if (zJ) {
                return new bve1(i, o7h.O0(new dte1(f4i1.c(i2, "timeline-error:"), 2131956570, 2131956568, true, 1, xgzVar), w(list, srt0Var, z, str)));
            }
            if (u890.j(ure1Var, tre1Var)) {
                return new bve1(i, o7h.O0(new dte1(f4i1.c(i2, "timeline-error:"), 2131956572, 2131956571, false, 2, xgzVar), w(list, srt0Var, z, str)));
            }
            eg.o();
            return null;
        }
        boolean zJ2 = u890.j(ure1Var, sre1Var);
        wgz wgzVar = wgz.a;
        if (zJ2) {
            dte1Var = new dte1(f4i1.c(i2, "timeline-error:"), 2131956570, 2131956567, true, 1, wgzVar);
        } else {
            if (!u890.j(ure1Var, tre1Var)) {
                eg.o();
                return null;
            }
            dte1Var = new dte1(f4i1.c(i2, "timeline-error:"), 2131956572, 2131956571, false, 2, wgzVar);
        }
        return new zue1(i, dte1Var);
    }

    public static ArrayList w(List list, srt0 srt0Var, boolean z, String str) {
        ftb1 ftb1Var;
        y5r z5rVar;
        int i;
        o960 gy81Var;
        q960 q960Var;
        ArrayList arrayList;
        boolean z2;
        t6x sa60Var;
        int i2;
        ArrayList arrayList2 = z6x.a;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cte1 cte1Var = (cte1) it.next();
            UserTimeline userTimeline = cte1Var.a;
            int i3 = cte1Var.b;
            TimelineDate timelineDateS = userTimeline.s();
            String strO = userTimeline.r().o();
            ShareConfiguration shareConfigurationP = userTimeline.r().p();
            StatsAvailabilityDetails statsAvailabilityDetailsR = userTimeline.r().r();
            String id = userTimeline.n().getId();
            int i4 = cte1Var.b;
            String strS = timelineDateS.s();
            String strR = timelineDateS.r();
            d761 d761VarA = timelineDateS.t() ? b761.a(timelineDateS.o()) : null;
            d761 d761VarA2 = timelineDateS.u() ? b761.a(timelineDateS.p()) : null;
            String strN = timelineDateS.n();
            if (strO.length() <= 0) {
                strO = null;
            }
            Timestamp date = timelineDateS.getDate();
            e371 e371VarS = cyo1.s(shareConfigurationP, str);
            boolean z3 = e371VarS instanceof e371;
            ftb1 ftb1Var2 = ftb1.b;
            if (!z3) {
                z5rVar = y5r.a;
                ftb1Var = ftb1Var2;
            } else if (statsAvailabilityDetailsR.p() == ftb1Var2 || !statsAvailabilityDetailsR.r()) {
                ftb1Var = ftb1Var2;
                e371 e371Var = e371VarS;
                z5rVar = new z5r(e371Var.a, e371Var.b);
            } else {
                EmptyShareContent emptyShareContentO = statsAvailabilityDetailsR.o();
                String title = emptyShareContentO.getTitle();
                String subtitle = emptyShareContentO.getSubtitle();
                String strN2 = emptyShareContentO.n();
                String strName = statsAvailabilityDetailsR.p().name();
                ftb1Var = ftb1Var2;
                z5rVar = new a6r(new a8x(i4, title, subtitle, strN2, id, strName));
            }
            x5r x5rVar = new x5r(strS, strR, d761VarA, d761VarA2, strN, strO, date, id, i4, z5rVar);
            arrayList3.add(x5rVar);
            ArrayList arrayList4 = new ArrayList();
            UserTimeline userTimeline2 = cte1Var.a;
            boolean z4 = false;
            int i5 = 3;
            int i6 = 2;
            int i7 = 1;
            String str2 = x5rVar.X;
            if (z) {
                arrayList4.add(s3o1.w(userTimeline2.r(), "stats-".concat(str2), i3, userTimeline2.n().getId(), true));
            } else if (userTimeline2.r().r().p() == ftb1Var) {
                arrayList4.add(s3o1.w(userTimeline2.r(), "stats-".concat(str2), i3, userTimeline2.n().getId(), false));
            } else {
                String strConcat = "stats-".concat(str2);
                StatsAvailabilityDetails statsAvailabilityDetailsR2 = userTimeline2.r().r();
                String id2 = userTimeline2.n().getId();
                String title2 = statsAvailabilityDetailsR2.getTitle();
                d761 d761VarA3 = b761.a(statsAvailabilityDetailsR2.q());
                ftb1 ftb1VarP = statsAvailabilityDetailsR2.p();
                int iOrdinal = ftb1VarP.ordinal();
                if (iOrdinal == 1) {
                    i = 3;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal != 3) {
                    n57.s("Unknown stats status, defaulting to EMPTY_PREVIOUS_PERIOD. StatsStatus: " + ftb1VarP);
                    i = 3;
                } else {
                    i = 1;
                }
                arrayList4.add(new b9x(strConcat, title2, d761VarA3, i, id2));
            }
            arrayList3.addAll(arrayList4);
            h290<Highlight> h290VarO = userTimeline.p().o();
            ShareConfiguration shareConfigurationP2 = userTimeline.p().p();
            int i8 = 10;
            ArrayList arrayList5 = new ArrayList(q7h.U(h290VarO, 10));
            for (Highlight highlight : h290VarO) {
                int iO = highlight.o();
                int i9 = iO == 0 ? -1 : if60.a[l1d.C(iO)];
                if (i9 == i7) {
                    gy81Var = new gy81(ppo1.u(highlight.x()));
                } else if (i9 == i6) {
                    OverlappingHighlightArtwork overlappingHighlightArtworkV = highlight.v();
                    gy81Var = if60.b[overlappingHighlightArtworkV.p().ordinal()] == 1 ? new tuq0(ppo1.u(overlappingHighlightArtworkV.q()), ppo1.u(overlappingHighlightArtworkV.n())) : new uuq0(ppo1.u(overlappingHighlightArtworkV.q()), ppo1.u(overlappingHighlightArtworkV.n()));
                } else if (i9 != i5) {
                    if (i9 == 4) {
                        gy81Var = new uab0(highlight.t().n());
                    } else if (i9 != 5) {
                        z2 = z4;
                        sa60Var = null;
                    } else {
                        sa60Var = new t6x(highlight.s(), highlight.getTitle(), b761.a(highlight.y()), new qc60(i3, highlight.n().p(), highlight.n().o()));
                        z2 = false;
                    }
                    arrayList5.add(sa60Var);
                    z4 = z2;
                    i5 = 3;
                    i8 = 10;
                    i6 = 2;
                    i7 = 1;
                    str = str;
                } else {
                    List<HighlightArtworkItem> listD1 = o7h.d1(highlight.r().o(), 9);
                    ArrayList arrayList6 = new ArrayList(q7h.U(listD1, i8));
                    for (HighlightArtworkItem highlightArtworkItem : listD1) {
                        highlightArtworkItem.getClass();
                        arrayList6.add(ppo1.u(highlightArtworkItem));
                    }
                    gy81Var = new mf50(mqo1.A(arrayList6));
                }
                o960 o960Var = gy81Var;
                String strS2 = highlight.s();
                String title3 = highlight.getTitle();
                d761 d761VarA4 = b761.a(highlight.y());
                f371 f371VarS = cyo1.s(shareConfigurationP2, str);
                String strP = highlight.p();
                qc60 qc60Var = new qc60(i3, highlight.n().p(), highlight.n().o());
                Navigation navigationU = highlight.u();
                p960 p960Var = new p960(navigationU.getUri(), navigationU.n());
                Signifier signifierW = highlight.w();
                if (u890.j(signifierW, Signifier.o())) {
                    signifierW = null;
                }
                if (signifierW != null) {
                    String strQ = signifierW.q();
                    int iOrdinal2 = signifierW.p().ordinal();
                    if (iOrdinal2 == 1) {
                        i2 = 2;
                    } else if (iOrdinal2 != 2) {
                        i2 = iOrdinal2 != 3 ? 1 : 4;
                    } else {
                        i2 = 3;
                    }
                    q960Var = new q960(i2, strQ, signifierW.n());
                } else {
                    q960Var = null;
                }
                String strQ2 = highlight.q();
                Collection<Track> collectionZ = highlight.z();
                collectionZ.getClass();
                if (collectionZ.isEmpty()) {
                    collectionZ = null;
                }
                if (collectionZ != null) {
                    arrayList = new ArrayList(q7h.U(collectionZ, i8));
                    for (Track track : collectionZ) {
                        arrayList.add(new r960(track.getUri(), track.getName(), ihc1.Q0(track.n(), new String[]{","}, 0, 6), track.o(), srt0Var));
                    }
                } else {
                    arrayList = arrayList2;
                }
                z2 = false;
                sa60Var = new sa60(strS2, title3, d761VarA4, qc60Var, f371VarS, o960Var, strP, p960Var, q960Var, strQ2, mqo1.A(arrayList));
                arrayList5.add(sa60Var);
                z4 = z2;
                i5 = 3;
                i8 = 10;
                i6 = 2;
                i7 = 1;
                str = str;
            }
            arrayList3.addAll(o7h.o0(arrayList5));
        }
        return arrayList3;
    }

    public static lnv0 x(String str, ze3 ze3Var, int i) {
        if ((i & 2) != 0) {
            ze3Var = null;
        }
        fft0 fft0Var = fft0.f;
        fns fnsVar = igu.a;
        return new lnv0(str, ze3Var, fft0Var, smo1.e(flo1.l(b3s.c, guo1.B())));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static h5a1 y(izr0 izr0Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            B(3, izr0Var, false);
        }
        izr0Var.C((int) izr0Var.v(), StandardCharsets.UTF_8);
        long jV = izr0Var.v();
        String[] strArr = new String[(int) jV];
        for (int i = 0; i < jV; i++) {
            strArr[i] = izr0Var.C((int) izr0Var.v(), StandardCharsets.UTF_8);
        }
        if (z2 && (izr0Var.E() & 1) == 0) {
            throw ParserException.a((RuntimeException) null, "framing bit expected to be set");
        }
        return new h5a1(strArr, (byte) 24);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    public static final gv21 z(gnw gnwVar, d7d d7dVar, boolean z, boolean z2, boolean z3, boolean z4) {
        gv21 gv21Var = gv21.e;
        if (!z2 || !z || (d7dVar instanceof b7d) || (d7dVar instanceof c7d)) {
            return gv21Var;
        }
        boolean zEquals = gnwVar.equals(dnw.a);
        boolean z5 = false;
        gv21 gv21Var2 = gv21.f;
        if (zEquals) {
            if ((d7dVar instanceof z6d) || (d7dVar instanceof w6d) || (d7dVar instanceof y6d)) {
                gv21Var = gv21Var2;
            }
        } else if (gnwVar.equals(fnw.a)) {
            gv21Var = gv21Var2;
        } else {
            if (!(gnwVar instanceof enw)) {
                eg.o();
                return null;
            }
            gv21Var = new gv21(true, true, true, false);
        }
        if (gv21Var.d && z3 && !z4) {
            z5 = true;
        }
        return new gv21(gv21Var.a, gv21Var.b, gv21Var.c, z5);
    }
}
