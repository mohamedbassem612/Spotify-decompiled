package p;

import android.R;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.spotify.familyviewservice.v1.Allocation;
import com.spotify.familyviewservice.v1.GetMemberDetailsResponse;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v9c implements ya, qiw, dl4, Function, rl71, r8m, zfl1 {
    public final /* synthetic */ byte a;

    public v9c(kxc0 kxc0Var, av1 av1Var) {
        this.a = (byte) 25;
        w3p1.o(new l4r(pwc0.b, 1, hea1.W0, new j4r(hea1.U0), hea1.X0), hea1.V0);
    }

    public static final boolean c(Iterable iterable) {
        if (iterable != null) {
            return (iterable instanceof Collection) && ((Collection) iterable).isEmpty();
        }
        return true;
    }

    public static lvc1 d(ConstraintLayout constraintLayout, hx4 hx4Var) {
        return new lvc1(constraintLayout, hx4Var, (byte) 15);
    }

    public static void e(int i) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static mic0 h(List list, float f, float f2, int i) {
        return new mic0(0, (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), list, (List) null);
    }

    public static mic0 k(mmr0[] mmr0VarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return l((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }

    public static mic0 l(mmr0[] mmr0VarArr, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            u7h u7hVar = (u7h) mmr0Var.b;
            long j3 = u7hVar.a;
            arrayList.add(u7hVar);
        }
        ArrayList arrayList2 = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var2 : mmr0VarArr) {
            arrayList2.add(Float.valueOf(((Number) mmr0Var2.a).floatValue()));
        }
        return new mic0(i, j, j2, arrayList, arrayList2);
    }

    public static mic0 m(long j, long j2, List list) {
        return new mic0(0, j, j2, list, (List) null);
    }

    public static qoz0 o(List list, long j, float f, int i) {
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        return new qoz0(f, j2, list, (List) null);
    }

    public static qoz0 p(mmr0[] mmr0VarArr, long j, float f, int i) {
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        float f2 = f;
        ArrayList arrayList = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            u7h u7hVar = (u7h) mmr0Var.b;
            long j3 = u7hVar.a;
            arrayList.add(u7hVar);
        }
        ArrayList arrayList2 = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var2 : mmr0VarArr) {
            arrayList2.add(Float.valueOf(((Number) mmr0Var2.a).floatValue()));
        }
        return new qoz0(f2, j2, arrayList, arrayList2);
    }

    public static boolean q(dg30 dg30Var, uwy0 uwy0Var, hxy0 hxy0Var, i8h1 i8h1Var, lcs lcsVar, zso0 zso0Var, iu30 iu30Var, kqi0 kqi0Var, twy0 twy0Var, String str, int i) {
        if ((i & 32) != 0) {
            zso0Var = null;
        }
        if ((i & 64) != 0) {
            iu30Var = cmo0.h;
        }
        if (dg30Var.e0().G("NotificationPermissionRationaleDialog") != null) {
            return false;
        }
        oso0 oso0Var = new oso0();
        Bundle bundle = new Bundle();
        bundle.putString("request_id", str);
        oso0Var.T0(bundle);
        oso0Var.H1 = uwy0Var;
        oso0Var.I1 = hxy0Var;
        oso0Var.F1 = i8h1Var;
        oso0Var.G1 = lcsVar;
        oso0Var.J1 = zso0Var;
        oso0Var.K1 = iu30Var;
        oso0Var.L1 = kqi0Var;
        oso0Var.M1 = twy0Var;
        th30 th30VarE0 = dg30Var.e0();
        th30VarE0.getClass();
        nu9 nu9Var = new nu9(th30VarE0);
        nu9Var.k(R.id.content, oso0Var, "NotificationPermissionRationaleDialog", 1);
        nu9Var.g(true, true);
        return true;
    }

    public static l9d1 r(mmr0[] mmr0VarArr) {
        ArrayList arrayList = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var : mmr0VarArr) {
            u7h u7hVar = (u7h) mmr0Var.b;
            long j = u7hVar.a;
            arrayList.add(u7hVar);
        }
        ArrayList arrayList2 = new ArrayList(mmr0VarArr.length);
        for (mmr0 mmr0Var2 : mmr0VarArr) {
            arrayList2.add(Float.valueOf(((Number) mmr0Var2.a).floatValue()));
        }
        return new l9d1(9205357640488583168L, arrayList, arrayList2);
    }

    public static mic0 s(List list, float f, float f2, int i) {
        return new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L), list, (List) null);
    }

    public static mic0 t(mmr0[] mmr0VarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return l((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0);
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        int iP;
        int i = 1;
        switch (this.a) {
            case 7:
                return dbt.b.get(obj);
            case 10:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    int i2 = ry21Var.d;
                    if (500 <= i2 && i2 < 600) {
                        n57.e("Received error code " + i2 + ", with body: " + sy21Var.c);
                    }
                    throw new HttpException(sy21Var);
                }
                GetMemberDetailsResponse getMemberDetailsResponse = (GetMemberDetailsResponse) sy21Var.b;
                if (getMemberDetailsResponse == null || (iP = getMemberDetailsResponse.p()) == 0) {
                    hhg1.n("Account type is null");
                    return null;
                }
                int iC = l1d.C(iP);
                if (iC != 0) {
                    if (iC == 1) {
                        return new o9g0(getMemberDetailsResponse.getMemberId(), getMemberDetailsResponse.getPlanName(), getMemberDetailsResponse.q(), getMemberDetailsResponse.r(), getMemberDetailsResponse.n().getChildId(), getMemberDetailsResponse.n().p().getDisplayName(), getMemberDetailsResponse.n().p().getImageUrl(), gj10.d(getMemberDetailsResponse.n().p()), getMemberDetailsResponse.n().getAllowExplicitContent(), getMemberDetailsResponse.n().hasAllowConnect() ? Boolean.valueOf(getMemberDetailsResponse.n().getAllowConnect()) : null, getMemberDetailsResponse.n().getAllowVideo(), getMemberDetailsResponse.n().getDateOfBirth(), getMemberDetailsResponse.n().getDateOfBirthMinDate(), getMemberDetailsResponse.n().getDateOfBirthMaxDate(), getMemberDetailsResponse.n().hasGraduationBanner() ? new c850(getMemberDetailsResponse.n().o().getMinGraduationAge()) : b850.a, getMemberDetailsResponse.n().getIsExpiring());
                    }
                    if (iC == 2) {
                        return new y0c0(getMemberDetailsResponse.getMemberId(), getMemberDetailsResponse.getPlanName(), getMemberDetailsResponse.q(), getMemberDetailsResponse.r(), getMemberDetailsResponse.o().getChildId(), getMemberDetailsResponse.o().o().getDisplayName(), getMemberDetailsResponse.o().o().getImageUrl(), gj10.d(getMemberDetailsResponse.o().o()), getMemberDetailsResponse.o().getIsExpiring());
                    }
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    hhg1.n("Account type not supported");
                    return null;
                }
                String memberId = getMemberDetailsResponse.getMemberId();
                String planName = getMemberDetailsResponse.getPlanName();
                int iQ = getMemberDetailsResponse.q();
                String strR = getMemberDetailsResponse.r();
                String username = getMemberDetailsResponse.s().getUsername();
                String displayName = getMemberDetailsResponse.s().v().getDisplayName();
                String imageUrl = getMemberDetailsResponse.s().v().getImageUrl();
                int iD = gj10.d(getMemberDetailsResponse.s().v());
                boolean zU = getMemberDetailsResponse.s().u();
                boolean allowExplicitContent = getMemberDetailsResponse.s().getAllowExplicitContent();
                boolean zS = getMemberDetailsResponse.s().s();
                boolean zP = getMemberDetailsResponse.s().p();
                boolean zR = getMemberDetailsResponse.s().r();
                String strO = getMemberDetailsResponse.s().o();
                h290 h290VarN = getMemberDetailsResponse.s().n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                Iterator it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Allocation) it.next()).getName());
                }
                return new k161(memberId, planName, iQ, strR, username, displayName, imageUrl, iD, zU, allowExplicitContent, zS, zP, zR, strO, arrayList, getMemberDetailsResponse.s().getIsExpiring(), getMemberDetailsResponse.s().q());
            case 18:
                z310 z310Var = (z310) obj;
                List list = z310Var.a;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((u310) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() != list.size()) {
                    n57.s("PME duplications found");
                }
                return new z310(arrayList2, z310Var.b, (m510) null, (String) null);
            case 19:
                PlayerState playerState = (PlayerState) obj;
                return (!playerState.isPlaying() || playerState.isPaused() || o4p1.o(playerState).length() <= 0) ? "" : playerState.contextUri();
            case 21:
                return lfz0.b((tl51) obj);
            default:
                PlayerState playerState2 = (PlayerState) obj;
                if (o4p1.o(playerState2).equals("") && u890.j(playerState2.contextUri(), "")) {
                    return new i051(drt0.a);
                }
                String strO2 = o4p1.o(playerState2);
                String strContextUri = playerState2.contextUri();
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    i = 2;
                } else if (playerState2.isPlaying() && playerState2.isPaused()) {
                    i = 3;
                }
                return new i051(new lrt0(i, strO2, strContextUri));
        }
    }

    public boolean b() {
        return false;
    }

    public Object f(String str, lnm lnmVar) {
        return p8m.a;
    }

    public Object g(k371 k371Var, lnm lnmVar) {
        return Boolean.TRUE;
    }

    public Object j(o5o0 o5o0Var, lnm lnmVar) {
        return p8m.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set n(p.onm r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p.zka1
            if (r0 == 0) goto L13
            r0 = r5
            p.zka1 r0 = (p.zka1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.zka1 r0 = new p.zka1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.a
            int r5 = r0.c
            if (r5 == 0) goto L3a
            r0 = 1
            r1 = 0
            if (r5 != r0) goto L34
            p.hm5.M(r4)     // Catch: java.lang.Throwable -> L33
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L32
            java.lang.String r4 = "Timed out resolving base permissions for %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L33
            com.spotify.base.java.logging.Logger.k(r4, r5)     // Catch: java.lang.Throwable -> L33
        L32:
            throw r1
        L33:
            throw r1
        L34:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            return r1
        L3a:
            p.hm5.M(r4)
            p.w7x r4 = p.w7x.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v9c.n(p.onm):java.util.Set");
    }

    public void v(Object obj) {
        ((Boolean) obj).getClass();
    }

    public void w(Object obj) {
    }

    public void a() {
    }

    public void stop() {
    }

    public /* synthetic */ v9c(byte b) {
        this.a = b;
    }

    public v9c(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
    }
}
