package p;

import android.os.Bundle;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.recaptcha.internal.zzad;
import com.google.android.recaptcha.internal.zzae;
import com.google.android.recaptcha.internal.zzag;
import com.google.android.recaptcha.internal.zzah;
import com.google.android.recaptcha.internal.zzak;
import com.google.android.recaptcha.internal.zzao;
import com.google.android.recaptcha.internal.zzb;
import com.google.android.recaptcha.internal.zzf;
import com.google.android.recaptcha.internal.zzy;
import com.google.android.recaptcha.internal.zzz;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class svh0 implements Function, f9z0, oti0, dcp1 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;

    public svh0(Flowable flowable, m441 m441Var) {
        this.a = (byte) 3;
        vbm[] vbmVarArr = q601.a;
        this.c = new iib(new sii0(new ir9(z4p1.v(new ipr(new yvg1((Object) null, (Object) null, (Object) null), new x010(rqt0.w(new dy20(new kge(flowable), (byte) 13), pzo0.Q0, rqt0.b), m441Var, s9p0.h, (byte) 1), new m53(this, (lnm) null), (byte) 16), 1), (byte) 6), this, (byte) 17), new xx0(this, (lnm) null, (byte) 15), (byte) 6);
    }

    public static int l(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo, clc0 clc0Var) {
        Object next;
        Iterator it = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) next).h() != clc0Var);
        YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType numberOfItemsForLinkType = (YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) next;
        if (numberOfItemsForLinkType != null) {
            return numberOfItemsForLinkType.i();
        }
        return 0;
    }

    public static int m(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo, Set set) {
        h290 h290VarY = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarY) {
            if (set.contains(((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) obj).h())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).i();
        }
        return i;
    }

    public static boolean o(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo) {
        Iterator it = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).i();
        }
        return i == 0;
    }

    public void a(e9z0 e9z0Var, int i) {
        StringBuilder sb = (StringBuilder) this.c;
        if (this.b) {
            this.b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public Object apply(Object obj) {
        m231 m231Var;
        switch (this.a) {
            case 2:
                qzo0 qzo0Var = (qzo0) this.c;
                o131 o131VarI = zr7.I(((PlayerState) obj).restrictions());
                if (o131VarI.a) {
                    return CompletableEmpty.a;
                }
                return qzo0Var.b.a(new l9u0()).ignoreElement().c((this.b && o131VarI.d) ? new CompletableFromAction(new wqd0(qzo0Var, (byte) 10)) : CompletableEmpty.a);
            case 3:
            case 4:
            case 5:
            case 9:
            default:
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                String strO = o4p1.o(playerState);
                if (strO.length() == 0 || strContextUri == null || strContextUri.length() == 0) {
                    return CompletableEmpty.a;
                }
                boolean z = this.b;
                hce1 hce1Var = (hce1) this.c;
                return z ? ((g610) hce1Var.e).a(strO) : ((g610) hce1Var.e).c(strO);
            case 6:
                qx41 qx41Var = (qx41) this.c;
                String str = qx41Var.b;
                String str2 = qx41Var.c;
                xo20 xo20Var = qx41Var.d;
                List list = qx41Var.j;
                return new w051(str, str2, new a951(new qiq0(xo20Var, p7h.O(new k851[]{(k851) obj}), list), this.b), qx41Var.g);
            case 7:
                icf1 icf1Var = (icf1) this.c;
                return new w051(icf1Var.a, icf1Var.c, new a951(new riq0(Collections.singletonList((k851) obj)), this.b), icf1Var.f);
            case 8:
                mmr0 mmr0Var = (mmr0) obj;
                pqq0 pqq0Var = (pqq0) this.c;
                Boolean bool = (Boolean) mmr0Var.a;
                boolean z2 = this.b || ((Boolean) mmr0Var.b).booleanValue();
                pqq0 pqq0Var2 = pqq0.b;
                return new pdm(false, z2, this.b, pqq0Var == pqq0Var2, !bool.booleanValue() && pqq0Var == pqq0Var2, false, false, false, false, false, false, true, true, 32707);
            case 10:
                Logger.d("ListEndpoint failed, falling back to prerelease data: %s", new Object[]{((Throwable) obj).getMessage()});
                return new o2w0((z2w0) this.c, true, this.b);
            case 11:
                Throwable th = (Throwable) obj;
                if (this.b) {
                    ConfigurationResponse configurationResponseA = ((fmy0) this.c).c.a();
                    m231Var = configurationResponseA != null ? new ika1(configurationResponseA) : new nka1(hr80.p());
                } else {
                    m231Var = new m231(th);
                }
                return new e331(m231Var);
        }
    }

    public void b(msi0 msi0Var, boolean z) {
        a2f1 a2f1Var = (a2f1) this.c;
        if (this.b) {
            return;
        }
        this.b = true;
        ActionMenuView actionMenuView = a2f1Var.c.a.a;
        if (actionMenuView != null) {
            actionMenuView.j();
        }
        a2f1Var.d.onPanelClosed(108, msi0Var);
        this.b = false;
    }

    public void c(g2c g2cVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-14644748);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(this) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (this.b) {
            x340Var.i0(1805052166);
            uwr uwrVar = cbx.a;
            uwo1.e(cwl1.o0(x340Var, 2131958670), i1p1.r(dug.f(g2cVar.a(u291.v(nim0.a, ((lel1) this.c).c / 2.0f), een.h), z4p1.g(4281677109L), d4o1.a)), (lee1) null, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2020);
            x340Var.r(false);
        } else {
            x340Var.i0(1805504270);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(this, g2cVar, i, (byte) 1);
        }
    }

    public void d(gvh0 gvh0Var) {
        ArrayList arrayList = (ArrayList) this.c;
        if (gvh0Var == null) {
            hhg1.n("route must not be null");
        } else if (arrayList.contains(gvh0Var)) {
            hhg1.n("route descriptor already added");
        } else {
            arrayList.add(gvh0Var);
        }
    }

    public void e(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((gvh0) it.next());
        }
    }

    public jqd0 f() {
        return new jqd0((ArrayList) this.c, this.b);
    }

    public boolean g(msi0 msi0Var) {
        ((a2f1) this.c).d.onMenuOpened(108, msi0Var);
        return true;
    }

    public boolean h() {
        return this.b;
    }

    public void i() {
        this.b = true;
        ((los) this.c).a(ixb.c);
    }

    public jug1 j() {
        return (jug1) this.c;
    }

    public kug1 k() {
        return (kug1) this.c;
    }

    public int n() {
        switch (this.a) {
            case 21:
                return this.b ? 1 : 0;
            default:
                return this.b ? 1 : 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean p(int i, CharSequence charSequence) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            bhn0.q();
            return false;
        }
        if (((f4x0) this.c) == null) {
            return h();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            svh0 svh0Var = a4e1.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return h();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0196  */
    public ArrayList q(List list, boolean z, boolean z2) {
        int i;
        YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType numberOfItemsForLinkType;
        nt1 ot1Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) it.next();
            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.C()) {
                String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                String strQ = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.u().q();
                if (strQ == null) {
                    strQ = "";
                }
                int iO = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.u().o();
                int iP = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.u().p();
                boolean zP = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().p();
                ot1Var = new nt1(uri, name, strQ, zP, zP, iO, iP);
            } else {
                String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                String name2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                String strQ2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().q();
                String strO = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().o();
                boolean z3 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().z();
                boolean zS = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().s();
                boolean zP2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().p();
                YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w();
                mmr0 mmr0Var = new mmr0(zhu0.a, Integer.valueOf(l(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.e)));
                mmr0 mmr0Var2 = new mmr0(zhu0.b, Integer.valueOf(l(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.h)));
                clc0 clc0Var = clc0.g;
                Map mapJ = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(zhu0.c, Integer.valueOf(l(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0Var))), new mmr0(zhu0.d, Integer.valueOf(l(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, clc0.t))), new mmr0(zhu0.e, Integer.valueOf(m(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, Collections.singleton(clc0.i)))), new mmr0(zhu0.f, Integer.valueOf(m(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW, f46.S0(new clc0[]{clc0.c, clc0.d, clc0.f, clc0.N0}))))});
                int iOrdinal = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().s().ordinal();
                boolean z4 = true;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal == 3 || iOrdinal == 4) {
                    i = 3;
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                String strB = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().B();
                strB.getClass();
                String uri3 = strB.length() > 0 ? strB : null;
                if (uri3 == null) {
                    uri3 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                }
                String str = uri3;
                str.getClass();
                av1 av1Var = (av1) this.c;
                if (!av1Var.d.contains(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri()) && !av1Var.X.contains(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri()) && (z || !yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().s())) {
                    if (!this.b) {
                        if (z2) {
                            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().s()) {
                                z4 = false;
                                break;
                            }
                            h290 h290VarY = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().y();
                            if (h290VarY.isEmpty()) {
                                if (!o(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w())) {
                                    z4 = false;
                                    break;
                                }
                            } else {
                                Iterator it2 = h290VarY.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType numberOfItemsForLinkType2 = (YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it2.next();
                                        if (numberOfItemsForLinkType2.h() != clc0Var || numberOfItemsForLinkType2.i() <= 0) {
                                        }
                                    } else if (!o(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w())) {
                                        z4 = false;
                                        break;
                                    }
                                }
                            }
                        } else {
                            YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w();
                            if (!o(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW2)) {
                                h290 h290VarY2 = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfoW2.y();
                                if (h290VarY2.isEmpty()) {
                                    z4 = false;
                                    break;
                                }
                                Iterator it3 = h290VarY2.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    numberOfItemsForLinkType = (YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it3.next();
                                } while ((numberOfItemsForLinkType.i() == 0) ^ (numberOfItemsForLinkType.h() == clc0Var));
                            }
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
                String uri4 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                ot1Var = new ot1(uri2, name2, str, zP2, strQ2, z4, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().w(), strO, z3, zS, i, mapJ, (uri4.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || uri4.equals("spotify:collection:tracks") || uri4.equals("spotify:internal:collection:tracks") || (nhc1.Y(uri4, "spotify:user:", false) && nhc1.R(uri4, ":collection", false))) ? 2 : 4, yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.w().t(), 16);
            }
            arrayList.add(ot1Var);
        }
        return arrayList;
    }

    public void r() {
        boolean z = this.b;
        WeakReference weakReference = (WeakReference) this.c;
        if (!z) {
            wnh1 wnh1Var = (wnh1) weakReference.get();
            if (wnh1Var != null) {
                wnh1Var.F();
                return;
            }
            return;
        }
        wnh1 wnh1Var2 = (wnh1) weakReference.get();
        if (wnh1Var2 != null) {
            wnh1Var2.G();
        }
        wnh1 wnh1Var3 = (wnh1) weakReference.get();
        if (wnh1Var3 != null) {
            wnh1Var3.F();
        }
    }

    public void s(jug1 jug1Var) {
        this.c = jug1Var;
    }

    public void t(kug1 kug1Var) {
        this.c = kug1Var;
    }

    public void u() {
        ((ArrayList) this.c).clear();
    }

    public void v(boolean z) {
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzak */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzf */
    public void w() throws zzf, zzak {
        jw91 jw91Var = ((ejn1) this.c).a;
        boolean z = this.b;
        String strA = bap1.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z) {
            return;
        }
        try {
            HashMap map = qin1.a;
            que0 que0Var = new que0(4);
            que0Var.g(dfp1.a, nnn1.f(x0p1.s));
            que0Var.g(dfp1.b, ccm1.a(0L));
            que0Var.g(dfp1.c, ccm1.a(1L));
            que0Var.g(dfp1.d, ccm1.a(2L));
            que0Var.g(dfp1.e, ccm1.a(3L));
            que0Var.g(dfp1.f, ccm1.a(4L));
            que0Var.g(dfp1.g, ccm1.a(7L));
            que0Var.g(dfp1.h, ccm1.a(-1L));
            que0Var.g(dfp1.i, ccm1.a(-2L));
            que0Var.g(dfp1.t, nnn1.f(izo1.b));
            que0Var.g(dfp1.X, nnn1.f(izo1.d));
            que0Var.g(dfp1.Y, nnn1.f(izo1.j));
            que0Var.g(dfp1.Z, nnn1.f(izo1.k));
            que0Var.g(dfp1.N0, nnn1.f(izo1.n));
            que0Var.g(dfp1.O0, nnn1.f(x0p1.n));
            que0Var.g(dfp1.P0, nnn1.f(izo1.f));
            que0Var.g(dfp1.Q0, nnn1.f(izo1.g));
            que0Var.g(dfp1.R0, nnn1.f(izo1.h));
            que0Var.g(dfp1.S0, nnn1.f(izo1.i));
            que0Var.g(dfp1.T0, nnn1.f(x0p1.h));
            que0Var.g(dfp1.U0, nnn1.f(x0p1.j));
            que0Var.g(dfp1.W0, nnn1.f(izo1.o));
            que0Var.g(dfp1.X0, nnn1.f(izo1.p));
            que0Var.g(dfp1.Y0, nnn1.f(izo1.s));
            que0Var.g(dfp1.Z0, nnn1.f(izo1.t));
            que0Var.g(dfp1.a1, nnn1.f(izo1.u));
            que0Var.g(dfp1.b1, nnn1.f(izo1.v));
            que0Var.g(dfp1.c1, nnn1.f(x0p1.b));
            que0Var.g(dfp1.d1, nnn1.f(x0p1.d));
            que0Var.g(dfp1.e1, nnn1.f(x0p1.e));
            que0Var.g(dfp1.f1, nnn1.f(x0p1.f));
            que0Var.g(dfp1.g1, nnn1.f(x0p1.k));
            que0Var.g(dfp1.h1, nnn1.f(x0p1.l));
            que0Var.g(dfp1.i1, nnn1.f(x0p1.p));
            que0Var.g(dfp1.j1, nnn1.f(x0p1.q));
            que0Var.g(dfp1.k1, nnn1.f(x0p1.u));
            que0Var.g(dfp1.l1, nnn1.f(x0p1.v));
            que0Var.g(dfp1.m1, nnn1.f(z7p1.b));
            que0Var.g(dfp1.n1, nnn1.f(z7p1.d));
            que0Var.g(dfp1.u1, nnn1.f(z7p1.e));
            que0Var.g(dfp1.o1, nnn1.f(z7p1.j));
            que0Var.g(dfp1.p1, nnn1.f(z7p1.k));
            que0Var.g(dfp1.q1, nnn1.f(z7p1.n));
            que0Var.g(dfp1.r1, nnn1.f(z7p1.q));
            que0Var.g(dfp1.s1, nnn1.f(izo1.q));
            que0Var.g(dfp1.t1, nnn1.f(z7p1.l));
            que0Var.g(dfp1.v1, nnn1.f(izo1.l));
            que0Var.g(dfp1.w1, nnn1.f(z7p1.g));
            que0Var.g(dfp1.x1, nnn1.f(z7p1.h));
            que0Var.g(dfp1.V0, nnn1.f(x0p1.i));
            que0Var.g(dfp1.y1, nnn1.f(z7p1.p));
            que0Var.g(dfp1.z1, nnn1.f(x0p1.m));
            que0Var.g(dfp1.A1, nnn1.f(z7p1.o));
            que0Var.g(dfp1.B1, nnn1.f(x0p1.c));
            que0Var.g(dfp1.C1, nnn1.f(z7p1.c));
            que0Var.g(dfp1.D1, nnn1.f(izo1.r));
            que0Var.g(dfp1.E1, nnn1.f(z7p1.m));
            que0Var.g(dfp1.F1, nnn1.f(izo1.e));
            que0Var.g(dfp1.G1, nnn1.f(z7p1.f));
            que0Var.g(dfp1.H1, nnn1.f(x0p1.t));
            que0Var.g(dfp1.I1, nnn1.f(izo1.c));
            que0Var.g(dfp1.J1, nnn1.f(z7p1.i));
            que0Var.g(dfp1.K1, nnn1.f(x0p1.o));
            que0Var.g(dfp1.L1, nnn1.f(izo1.m));
            que0Var.g(dfp1.M1, nnn1.f(x0p1.r));
            que0Var.g(dfp1.N1, nnn1.f(x0p1.g));
            c6p1 c6p1VarH = que0Var.h();
            for (long j = -1; j >= -89; j--) {
                dfp1 dfp1Var = (dfp1) map.get(Long.valueOf(j));
                if (dfp1Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 36);
                    sb.append(strA);
                    sb.append(j);
                    throw new zzak(sb.toString());
                }
                jw91Var.e((nnn1) c6p1VarH.get(dfp1Var));
            }
            for (int i = 89; i < 681; i++) {
                jw91Var.e(nnn1.a((Object) null));
            }
            this.b = true;
        } catch (zzah e) {
            throw new zzf(h2o1.b, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzak */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzf */
    public Object x(Optional optional) throws zzf, zzak, zzb {
        Object obj;
        long j;
        ctn1 ctn1Var;
        Object objOf;
        long j2;
        ejn1 ejn1Var = (ejn1) this.c;
        h0n1 h0n1Var = ejn1Var.b;
        jw91 jw91Var = ejn1Var.a;
        b8p1 b8p1Var = ejn1Var.c;
        try {
            try {
                if (this.b) {
                    obj = null;
                    j = 2;
                } else {
                    String strA = bap1.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap map = qin1.a;
                        obj = null;
                        que0 que0Var = new que0((byte) 4);
                        j = 2;
                        que0Var.g(dfp1.a, nnn1.f(x0p1.s));
                        que0Var.g(dfp1.b, ccm1.a(0L));
                        que0Var.g(dfp1.c, ccm1.a(1L));
                        que0Var.g(dfp1.d, ccm1.a(2L));
                        que0Var.g(dfp1.e, ccm1.a(3L));
                        que0Var.g(dfp1.f, ccm1.a(4L));
                        que0Var.g(dfp1.g, ccm1.a(7L));
                        que0Var.g(dfp1.h, ccm1.a(-1L));
                        que0Var.g(dfp1.i, ccm1.a(-2L));
                        que0Var.g(dfp1.t, nnn1.f(izo1.b));
                        que0Var.g(dfp1.X, nnn1.f(izo1.d));
                        que0Var.g(dfp1.Y, nnn1.f(izo1.j));
                        que0Var.g(dfp1.Z, nnn1.f(izo1.k));
                        que0Var.g(dfp1.N0, nnn1.f(izo1.n));
                        que0Var.g(dfp1.O0, nnn1.f(x0p1.n));
                        que0Var.g(dfp1.P0, nnn1.f(izo1.f));
                        que0Var.g(dfp1.Q0, nnn1.f(izo1.g));
                        que0Var.g(dfp1.R0, nnn1.f(izo1.h));
                        que0Var.g(dfp1.S0, nnn1.f(izo1.i));
                        que0Var.g(dfp1.T0, nnn1.f(x0p1.h));
                        que0Var.g(dfp1.U0, nnn1.f(x0p1.j));
                        que0Var.g(dfp1.W0, nnn1.f(izo1.o));
                        que0Var.g(dfp1.X0, nnn1.f(izo1.p));
                        que0Var.g(dfp1.Y0, nnn1.f(izo1.s));
                        que0Var.g(dfp1.Z0, nnn1.f(izo1.t));
                        que0Var.g(dfp1.a1, nnn1.f(izo1.u));
                        que0Var.g(dfp1.b1, nnn1.f(izo1.v));
                        que0Var.g(dfp1.c1, nnn1.f(x0p1.b));
                        que0Var.g(dfp1.d1, nnn1.f(x0p1.d));
                        que0Var.g(dfp1.e1, nnn1.f(x0p1.e));
                        que0Var.g(dfp1.f1, nnn1.f(x0p1.f));
                        que0Var.g(dfp1.g1, nnn1.f(x0p1.k));
                        que0Var.g(dfp1.h1, nnn1.f(x0p1.l));
                        que0Var.g(dfp1.i1, nnn1.f(x0p1.p));
                        que0Var.g(dfp1.j1, nnn1.f(x0p1.q));
                        que0Var.g(dfp1.k1, nnn1.f(x0p1.u));
                        que0Var.g(dfp1.l1, nnn1.f(x0p1.v));
                        que0Var.g(dfp1.m1, nnn1.f(z7p1.b));
                        que0Var.g(dfp1.n1, nnn1.f(z7p1.d));
                        que0Var.g(dfp1.u1, nnn1.f(z7p1.e));
                        que0Var.g(dfp1.o1, nnn1.f(z7p1.j));
                        que0Var.g(dfp1.p1, nnn1.f(z7p1.k));
                        que0Var.g(dfp1.q1, nnn1.f(z7p1.n));
                        que0Var.g(dfp1.r1, nnn1.f(z7p1.q));
                        que0Var.g(dfp1.s1, nnn1.f(izo1.q));
                        que0Var.g(dfp1.t1, nnn1.f(z7p1.l));
                        que0Var.g(dfp1.v1, nnn1.f(izo1.l));
                        que0Var.g(dfp1.w1, nnn1.f(z7p1.g));
                        que0Var.g(dfp1.x1, nnn1.f(z7p1.h));
                        que0Var.g(dfp1.V0, nnn1.f(x0p1.i));
                        que0Var.g(dfp1.y1, nnn1.f(z7p1.p));
                        que0Var.g(dfp1.z1, nnn1.f(x0p1.m));
                        que0Var.g(dfp1.A1, nnn1.f(z7p1.o));
                        que0Var.g(dfp1.B1, nnn1.f(x0p1.c));
                        que0Var.g(dfp1.C1, nnn1.f(z7p1.c));
                        que0Var.g(dfp1.D1, nnn1.f(izo1.r));
                        que0Var.g(dfp1.E1, nnn1.f(z7p1.m));
                        que0Var.g(dfp1.F1, nnn1.f(izo1.e));
                        que0Var.g(dfp1.G1, nnn1.f(z7p1.f));
                        que0Var.g(dfp1.H1, nnn1.f(x0p1.t));
                        que0Var.g(dfp1.I1, nnn1.f(izo1.c));
                        que0Var.g(dfp1.J1, nnn1.f(z7p1.i));
                        que0Var.g(dfp1.K1, nnn1.f(x0p1.o));
                        que0Var.g(dfp1.L1, nnn1.f(izo1.m));
                        que0Var.g(dfp1.M1, nnn1.f(x0p1.r));
                        que0Var.g(dfp1.N1, nnn1.f(x0p1.g));
                        c6p1 c6p1VarH = que0Var.h();
                        for (long j3 = -1; j3 >= -89; j3--) {
                            dfp1 dfp1Var = (dfp1) map.get(Long.valueOf(j3));
                            if (dfp1Var == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 36);
                                sb.append(strA);
                                sb.append(j3);
                                throw new zzak(sb.toString());
                            }
                            jw91Var.e((nnn1) c6p1VarH.get(dfp1Var));
                        }
                        for (int i = 89; i < 681; i++) {
                            jw91Var.e(nnn1.a((Object) null));
                        }
                        this.b = true;
                    } catch (zzah e) {
                        throw new zzf(h2o1.b, e);
                    }
                }
                try {
                    b8p1Var.C(0L);
                    b8p1Var.d = new nen1();
                    String strA2 = bap1.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String strA3 = bap1.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    try {
                        int iG = b8p1Var.G();
                        int i2 = ((iG & 65535) << 16) >> 16;
                        int i3 = (((iG >> 16) & 65535) << 16) >> 16;
                        if (i2 != -14426) {
                            throw new zzb(strA2.concat(String.format(bap1.a("e1Hk+x0="), Short.valueOf((short) i2))));
                        }
                        if (i3 != 5) {
                            throw new zzb(strA3.concat(String.format(bap1.a("e1Hk+x0="), Short.valueOf((short) i3))));
                        }
                        String strA4 = bap1.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int iG2 = b8p1Var.G();
                            if (iG2 != 78977249) {
                                throw new zzb(strA4.concat(String.format(bap1.a("e1Hk9x0="), Integer.valueOf(iG2))));
                            }
                            try {
                                int[] iArr = {b8p1Var.G()};
                                int[] iArr2 = abn1.a;
                                oen1 oen1Var = (oen1) b8p1Var.e;
                                int i4 = iArr[0];
                                oen1Var.getClass();
                                b8p1Var.d = new que0(new h4u(i4, iArr2));
                                try {
                                    b8p1Var.C(96L);
                                    i5p1 i5p1Var = lio1.a;
                                    Optional.empty();
                                    Object objA = true != optional.isPresent() ? nnn1.a(obj) : optional.get();
                                    jw91Var.e(objA instanceof nnn1 ? (nnn1) objA : nnn1.g(objA));
                                    jw91Var.e(nnn1.a(obj));
                                    h0n1Var.a(0L, 0L, jw91Var.b);
                                    while (!((ArrayDeque) h0n1Var.a).isEmpty()) {
                                        long jD = b8p1Var.D();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        objOf = jw91Var.g(b8p1Var.F()).p().apply(ejn1Var);
                                                    } catch (Throwable unused) {
                                                        ctn1Var = ctn1.W0;
                                                        objOf = Optional.of(ctn1Var);
                                                    }
                                                } catch (zzao unused2) {
                                                    ctn1Var = ctn1.d;
                                                }
                                            } catch (zzag unused3) {
                                                ctn1Var = ctn1.c;
                                            }
                                        } catch (zzz unused4) {
                                            ctn1Var = ctn1.V0;
                                        }
                                        Optional optional2 = (Optional) objOf;
                                        if (optional2.isPresent()) {
                                            if (!lio1.a.contains(optional2.get())) {
                                                throw new zzf(h2o1.h, (ctn1) optional2.get(), jD);
                                            }
                                            Object obj2 = optional2.get();
                                            long jD2 = b8p1Var.D();
                                            do {
                                                try {
                                                    j2 = h0n1Var.b().c;
                                                    Optional optionalA = ejn1Var.a();
                                                    if (optionalA.isPresent() && optionalA.get() == ctn1.X0) {
                                                        throw new zzf(h2o1.h, (ctn1) obj2, jD2);
                                                    }
                                                    if (optionalA.isPresent()) {
                                                        throw new zzf(h2o1.h, (ctn1) optionalA.get(), jD2);
                                                    }
                                                } catch (zzae unused5) {
                                                    throw new zzf(h2o1.h, (ctn1) obj2, jD2);
                                                }
                                            } while (j2 != j);
                                        }
                                    }
                                    try {
                                        nnn1 nnn1VarF = jw91Var.f();
                                        jw91Var.f();
                                        return nnn1VarF.h();
                                    } catch (zzao e2) {
                                        throw new zzf(h2o1.g, e2);
                                    } catch (zzag e3) {
                                        throw new zzf(h2o1.f, e3);
                                    }
                                } catch (zzy e4) {
                                    e = e4;
                                    throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                                } catch (zzz e5) {
                                    e = e5;
                                    throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (zzz e6) {
                                throw new zzf(h2o1.e, e6);
                            }
                        } catch (zzz e7) {
                            throw new zzb(bap1.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e7);
                        }
                    } catch (zzz e8) {
                        throw new zzb(bap1.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e8);
                    }
                } catch (zzy e9) {
                    e = e9;
                    throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                } catch (zzz e10) {
                    e = e10;
                    throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (zzad e11) {
                throw new zzf(h2o1.d, e11);
            }
        } catch (zzah e12) {
            throw new zzf(h2o1.c, e12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzak */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzb */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzf */
    public Object y(long j, Optional optional) throws zzf, zzak, zzb {
        ctn1 ctn1Var;
        Object objOf;
        long j2;
        ejn1 ejn1Var = (ejn1) this.c;
        h0n1 h0n1Var = ejn1Var.b;
        jw91 jw91Var = ejn1Var.a;
        b8p1 b8p1Var = ejn1Var.c;
        try {
            if (!this.b) {
                w();
            }
            try {
                b8p1Var.C(0L);
                b8p1Var.d = new nen1();
                try {
                    int iG = b8p1Var.G();
                    int i = ((iG & 65535) << 16) >> 16;
                    int i2 = (((iG >> 16) & 65535) << 16) >> 16;
                    if (i != -14426) {
                        throw new zzb(bap1.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(bap1.a("e1Hk+x0="), Short.valueOf((short) i))));
                    }
                    if (i2 != 5) {
                        throw new zzb(bap1.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(bap1.a("e1Hk+x0="), Short.valueOf((short) i2))));
                    }
                    int i3 = 9;
                    int[] iArr = {1562478999, 1463850529, 1260006094, 340390947, 1789747714, -1196532793, 55708026, 1386122429, 371888680};
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int i7 = iArr[3];
                    int i8 = iArr[4];
                    int i9 = (iArr[7] % 371888680) ^ (((((i5 & (~i4)) | i6) + ((i4 & i7) | i8)) - iArr[5]) + iArr[6]);
                    try {
                        int iG2 = b8p1Var.G();
                        if (iG2 != i9) {
                            throw new zzb(bap1.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(bap1.a("e1Hk9x0="), Integer.valueOf(iG2))));
                        }
                        try {
                            int[] iArr2 = {b8p1Var.G()};
                            int[] iArr3 = abn1.a;
                            oen1 oen1Var = (oen1) b8p1Var.e;
                            int i10 = iArr2[0];
                            oen1Var.getClass();
                            b8p1Var.d = new que0(new h4u(i10, iArr3));
                            try {
                                b8p1Var.C(j);
                                i5p1 i5p1Var = lio1.a;
                                Optional.empty();
                                Object objA = true != optional.isPresent() ? nnn1.a((Object) null) : optional.get();
                                jw91Var.e(objA instanceof nnn1 ? (nnn1) objA : nnn1.g(objA));
                                jw91Var.e(nnn1.a((Object) null));
                                h0n1Var.a(0L, 0L, jw91Var.b);
                                while (!((ArrayDeque) h0n1Var.a).isEmpty()) {
                                    long jD = b8p1Var.D();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    objOf = jw91Var.g(b8p1Var.F()).p().apply(ejn1Var);
                                                } catch (Throwable unused) {
                                                    ctn1Var = ctn1.W0;
                                                    objOf = Optional.of(ctn1Var);
                                                }
                                            } catch (zzao unused2) {
                                                ctn1Var = ctn1.d;
                                            }
                                        } catch (zzag unused3) {
                                            ctn1Var = ctn1.c;
                                        }
                                    } catch (zzz unused4) {
                                        ctn1Var = ctn1.V0;
                                    }
                                    Optional optional2 = (Optional) objOf;
                                    if (optional2.isPresent()) {
                                        if (!lio1.a.contains(optional2.get())) {
                                            throw new zzf(h2o1.h, (ctn1) optional2.get(), jD);
                                        }
                                        Object obj = optional2.get();
                                        long[] jArr = new long[i3];
                                        // fill-array-data instruction
                                        jArr[0] = 506959639;
                                        jArr[1] = 1442955280;
                                        jArr[2] = 62548278;
                                        jArr[3] = 1413971974;
                                        jArr[4] = 148798230;
                                        jArr[5] = 2046775638;
                                        jArr[6] = 850598623;
                                        jArr[7] = 978128825;
                                        jArr[8] = 553574882;
                                        long j3 = jArr[0];
                                        long j4 = jArr[1];
                                        long j5 = jArr[2];
                                        long j6 = jArr[3];
                                        long j7 = jArr[4];
                                        long j8 = jArr[5];
                                        long j9 = jArr[6];
                                        long j10 = jArr[7];
                                        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
                                        long j12 = j10 % 553574882;
                                        long jD2 = b8p1Var.D();
                                        do {
                                            try {
                                                j2 = h0n1Var.b().c;
                                                Optional optionalA = ejn1Var.a();
                                                if (optionalA.isPresent() && optionalA.get() == ctn1.X0) {
                                                    throw new zzf(h2o1.h, (ctn1) obj, jD2);
                                                }
                                                if (optionalA.isPresent()) {
                                                    throw new zzf(h2o1.h, (ctn1) optionalA.get(), jD2);
                                                }
                                            } catch (zzae unused5) {
                                                throw new zzf(h2o1.h, (ctn1) obj, jD2);
                                            }
                                        } while (j2 != (j11 ^ j12));
                                        i3 = 9;
                                    }
                                }
                                try {
                                    nnn1 nnn1VarF = jw91Var.f();
                                    jw91Var.f();
                                    return nnn1VarF.h();
                                } catch (zzao e) {
                                    throw new zzf(h2o1.g, e);
                                } catch (zzag e2) {
                                    throw new zzf(h2o1.f, e2);
                                }
                            } catch (zzz e3) {
                                e = e3;
                                throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                            } catch (zzy e4) {
                                e = e4;
                                throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (zzz e5) {
                            throw new zzf(h2o1.e, e5);
                        }
                    } catch (zzz e6) {
                        throw new zzb(bap1.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e6);
                    }
                } catch (zzz e7) {
                    throw new zzb(bap1.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e7);
                }
            } catch (zzz e8) {
                e = e8;
                throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
            } catch (zzy e9) {
                e = e9;
                throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (zzah e10) {
            throw new zzf(h2o1.c, e10);
        } catch (zzad e11) {
            throw new zzf(h2o1.d, e11);
        }
    }

    public jcp1 zza() {
        ikj1 ikj1Var = new ikj1();
        p0p1 p0p1Var = this.b ? p0p1.c : p0p1.b;
        q0p1 q0p1Var = (q0p1) this.c;
        ikj1Var.c = p0p1Var;
        hql1 hql1Var = new hql1();
        hql1Var.a = q0p1Var;
        ikj1Var.e = new p7p1(hql1Var);
        return new jcp1(ikj1Var, 0);
    }

    public /* synthetic */ svh0(ObservableTransformer observableTransformer, Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ svh0(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ svh0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ svh0(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ svh0(boolean z, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }

    public svh0(x8c0 x8c0Var, WeakReference weakReference) {
        this.a = (byte) 5;
        this.c = weakReference;
        x8c0Var.a(new s1r0(this, (byte) 0));
    }

    public svh0(Bundle bundle, ioc iocVar, rob robVar, etq0 etq0Var, iac0 iac0Var, iyc0 iyc0Var, String str) {
        this.a = (byte) 9;
        this.b = bundle.getBoolean("stsHasSynced", false);
        dp5 dp5Var = new dp5(iocVar.b(), (byte) 23);
        this.c = new dtq0(etq0Var, new tjf0(this, bundle, iac0Var, iyc0Var, str, (byte) 10), new v3v0(1, robVar, rob.class, "handle", "handle(Ljava/lang/Throwable;)Z", 0, (byte) 5), iocVar, dp5Var, 8);
    }

    public svh0(byte b) {
        this.a = b;
        switch (b) {
            case 25:
                jw91 jw91Var = new jw91((byte) 3);
                oen1 oen1Var = new oen1((byte) 3);
                b8p1 b8p1Var = new b8p1(tdp1.b, 0, new nen1());
                b8p1Var.e = oen1Var;
                this.c = new ejn1(jw91Var, b8p1Var);
                this.b = false;
                break;
            default:
                this.c = new ArrayList();
                this.b = false;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public svh0(f4x0 f4x0Var, boolean z) {
        this((Object) f4x0Var, (byte) 17);
        this.a = (byte) 17;
        this.b = z;
    }

    public svh0(jqd0 jqd0Var) {
        this.a = (byte) 0;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.b = false;
        if (jqd0Var != null) {
            arrayList.addAll((List) jqd0Var.d);
            this.b = jqd0Var.b;
        } else {
            hhg1.n("descriptor must not be null");
            throw null;
        }
    }

    public svh0(StringBuilder sb) {
        this.a = (byte) 12;
        this.c = sb;
        this.b = true;
    }
}
