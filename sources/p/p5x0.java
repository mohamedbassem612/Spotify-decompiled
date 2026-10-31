package p;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.graphics.Brush;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p5x0 implements Function, Predicate, BiFunction, BiPredicate, m2a1, g4u, d8k1 {
    public final /* synthetic */ byte a;
    public static final p5x0 b = new p5x0((byte) 0);
    public static final p5x0 c = new p5x0((byte) 1);
    public static final p5x0 d = new p5x0((byte) 2);
    public static final p5x0 e = new p5x0((byte) 3);
    public static final p5x0 f = new p5x0((byte) 4);
    public static final p5x0 g = new p5x0((byte) 5);
    public static final p5x0 h = new p5x0((byte) 6);
    public static final p5x0 i = new p5x0((byte) 7);
    public static final p5x0 t = new p5x0((byte) 8);
    public static final p5x0 X = new p5x0((byte) 9);
    public static final p5x0 Y = new p5x0((byte) 10);
    public static final p5x0 Z = new p5x0((byte) 11);
    public static final p5x0 N0 = new p5x0((byte) 12);
    public static final p5x0 O0 = new p5x0((byte) 13);
    public static final p5x0 P0 = new p5x0((byte) 14);
    public static final p5x0 Q0 = new p5x0((byte) 15);
    public static final p5x0 R0 = new p5x0((byte) 16);
    public static final p5x0 S0 = new p5x0((byte) 18);
    public static final p5x0 T0 = new p5x0((byte) 19);
    public static final p5x0 U0 = new p5x0((byte) 20);
    public static final p5x0 V0 = new p5x0((byte) 21);
    public static final p5x0 W0 = new p5x0((byte) 22);
    public static final p5x0 X0 = new p5x0((byte) 23);
    public static final p5x0 Y0 = new p5x0((byte) 24);
    public static final p5x0 Z0 = new p5x0((byte) 25);
    public static final p5x0 a1 = new p5x0((byte) 26);

    public p5x0(ye8 ye8Var) {
        this.a = (byte) 29;
    }

    public static j8e1 a(Brush brush, float f2) {
        if (brush == null) {
            return i8e1.a;
        }
        if (brush instanceof n6a1) {
            return b(ila0.A(f2, ((n6a1) brush).a));
        }
        if (brush instanceof zv61) {
            return new z9c((zv61) brush, f2);
        }
        eg.o();
        return null;
    }

    public static j8e1 b(long j) {
        return j != 16 ? new mah(j) : i8e1.a;
    }

    public static Intent d(Context context, int i2) {
        Intent intent = new Intent();
        intent.setClass(context, AccountPickerActivity.class);
        intent.setFlags(i2);
        return intent;
    }

    public Object apply(Object obj) {
        boolean z;
        int i2;
        String strN;
        int i3;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                return Observable.empty();
            case 1:
            case 2:
            case 4:
            case 8:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 21:
            case 22:
            default:
                dma1 dma1Var = (dma1) obj;
                if (dma1Var.l(ye8.d, 0) != 1) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.f(ye8.e);
                    hma1VarEdit.f(ye8.f);
                    hma1VarEdit.f(ye8.g);
                    for (t54 t54Var : t54.values()) {
                        bma1 bma1Var = ye8.d;
                        hma1VarEdit.f(i5x0.j(t54Var));
                        hma1VarEdit.f(i5x0.k(t54Var));
                        hma1VarEdit.f(i5x0.l(t54Var));
                    }
                    hma1VarEdit.b(ye8.d, 1);
                    hma1VarEdit.g();
                }
                return dma1Var;
            case 3:
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c()) {
                    l0l l0lVar = (l0l) spq0Var.b();
                    if (!l0lVar.l() && !l0lVar.x().contains("audio/media")) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 5:
                return Integer.valueOf(((f8c0) obj).a);
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return ResumptionProgressEsperanto.ContentResumedEvent.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.ContentResumedEvent: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return new ob41(((th61) obj).a);
            case 9:
                return new mmr0((da61) obj, (Object) null);
            case 10:
                Boolean bool = (Boolean) ((cma1) obj).a;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 11:
                return new xp81((qjn0) obj);
            case 16:
                return new xac1((o7c1) obj);
            case 18:
                return new i5w0((wsc0) obj);
            case 19:
                mmr0 mmr0Var = (mmr0) obj;
                mmr0 mmr0Var2 = (mmr0) mmr0Var.a;
                va81 va81Var = (va81) mmr0Var.b;
                mdz mdzVar = (mdz) mmr0Var2.a;
                n131 n131Var = (n131) mmr0Var2.b;
                if (va81Var == null || mdzVar == null) {
                    return l5g1.a;
                }
                String string = mdzVar.a.toString();
                String str = mdzVar.c;
                int iT = jfv.t(fdg1.l0(mdzVar.n, ngv.d), ngv.e);
                boolean z3 = (mdzVar.i && n131Var.a) || (qqn1.X(mdzVar) && n131Var.b);
                Set setA = mdzVar.a();
                if ((setA instanceof Collection) && setA.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = setA.iterator();
                    while (it.hasNext()) {
                        if (((jdz) it.next()) == jdz.b) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return new k5g1(new o5g1(iT, string, str, mdzVar.e.b, z3, z, qqn1.X(mdzVar), mdzVar.i));
            case 20:
                return new m7z0(((r5z0) obj).d);
            case 23:
                return new e331(new m231((Throwable) obj));
            case 24:
                h290<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : h290VarN) {
                    yourLibraryDecoratedEntity.getClass();
                    String uri = yourLibraryDecoratedEntity.e().getUri();
                    String name = yourLibraryDecoratedEntity.e().getName();
                    List listSingletonList = Collections.singletonList(yourLibraryDecoratedEntity.e().q());
                    long jR = yourLibraryDecoratedEntity.e().r();
                    gtm1 gtm1VarS = yourLibraryDecoratedEntity.s();
                    switch (gtm1VarS == null ? -1 : vsp0.a[gtm1VarS.ordinal()]) {
                        case 1:
                            i2 = 1;
                            break;
                        case 2:
                            i2 = 2;
                            break;
                        case 3:
                            i2 = 3;
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case 5:
                            String uri2 = yourLibraryDecoratedEntity.e().getUri();
                            i2 = (!uri2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !uri2.equals("spotify:collection:tracks") && !uri2.equals("spotify:internal:collection:tracks") && (!nhc1.Y(uri2, "spotify:user:", false) || !nhc1.R(uri2, ":collection", false))) ? 7 : 5;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        default:
                            i2 = 10;
                            break;
                    }
                    gtm1 gtm1VarS2 = yourLibraryDecoratedEntity.s();
                    int i4 = gtm1VarS2 == null ? -1 : vsp0.a[gtm1VarS2.ordinal()];
                    if (i4 == 1) {
                        strN = yourLibraryDecoratedEntity.n().n();
                    } else if (i4 == 3) {
                        strN = yourLibraryDecoratedEntity.p().o();
                    } else if (i4 != 5) {
                        strN = i4 != 6 ? "" : yourLibraryDecoratedEntity.y().n();
                    } else {
                        strN = yourLibraryDecoratedEntity.w().o();
                    }
                    gtm1 gtm1VarS3 = yourLibraryDecoratedEntity.s();
                    int i5 = gtm1VarS3 == null ? -1 : vsp0.a[gtm1VarS3.ordinal()];
                    List listSingletonList2 = i5 != 3 ? i5 != 6 ? Collections.singletonList(tsp0.a) : Collections.singletonList(tsp0.b) : Collections.singletonList(tsp0.c);
                    gtm1 gtm1VarS4 = yourLibraryDecoratedEntity.s();
                    if ((gtm1VarS4 != null ? vsp0.a[gtm1VarS4.ordinal()] : -1) == 5) {
                        Iterator it2 = yourLibraryDecoratedEntity.w().y().iterator();
                        int i6 = 0;
                        while (it2.hasNext()) {
                            i6 += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it2.next()).i();
                        }
                        i3 = i6;
                    } else {
                        i3 = 0;
                    }
                    arrayList.add(new ssp0(uri, name, listSingletonList, i2, true, strN, (String) null, i3, (usp0) null, listSingletonList2, jR, 2368));
                }
                return arrayList;
        }
    }

    public Function0 c(o6 o6Var) {
        if (!o6Var.isAttachedToWindow()) {
            p811 p811Var = new p811();
            c9s c9sVar = new c9s(o6Var, p811Var, (byte) 16);
            o6Var.addOnAttachStateChangeListener(c9sVar);
            p811Var.a = new qga0(o6Var, c9sVar, (byte) 26);
            return new fg01(p811Var, (byte) 1);
        }
        iac0 iac0VarH = x9p1.h(o6Var);
        if (iac0VarH != null) {
            return w6p1.r(o6Var, iac0VarH.getLifecycle());
        }
        qf80.d("View tree for " + o6Var + " has no ViewTreeLifecycleOwner");
        jah.d();
        return null;
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                on91 on91Var = (on91) obj;
                on91 on91Var2 = (on91) obj2;
                return u890.j(on91Var.a, on91Var2.a) && u890.j(on91Var.b, on91Var2.b) && on91Var.d == on91Var2.d;
            default:
                ouj1 ouj1Var = (ouj1) obj;
                ouj1 ouj1Var2 = (ouj1) obj2;
                return (ouj1Var.a.equals(ouj1Var2.a) && ouj1Var.d.equals(ouj1Var2.d)) ? false : true;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p5x0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((cma1) obj).b == 1;
            case 2:
                return !((Map) obj).isEmpty();
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return new mmr0((spq0) obj, (fvf1) obj2);
            default:
                return new mmr0((List) obj, Boolean.valueOf(!((bva1) obj2).equals(ava1.a)));
        }
    }
}
