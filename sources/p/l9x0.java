package p;

import android.os.Build;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.musicvideos.musicvideowidget.proto.v1.NpvWidgetResponse;
import com.spotify.musicvideos.musicvideowidget.proto.v1.VideoCard;
import com.spotify.player.model.ContextTrack;
import com.spotify.profile.mainprofilesections.artists.ArtistlistResponse;
import com.spotify.watchfeedentrypoints.api.v1.DiscoveryFromSeedResponse;
import com.spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCarouselComponent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l9x0 implements Function, Predicate, Init, Function3, av30, BiFunction, k1q0, oti0 {
    public final /* synthetic */ byte a;
    public static final l9x0 b = new l9x0(0);
    public static final l9x0 c = new l9x0(1);
    public static final l9x0 d = new l9x0(2);
    public static final l9x0 e = new l9x0(3);
    public static final l9x0 f = new l9x0(4);
    public static final l9x0 g = new l9x0(5);
    public static final l9x0 h = new l9x0(6);
    public static final l9x0 i = new l9x0(7);
    public static final l9x0 t = new l9x0(8);
    public static final l9x0 X = new l9x0(9);
    public static final l9x0 Y = new l9x0(10);
    public static final l9x0 Z = new l9x0(11);
    public static final l9x0 N0 = new l9x0(12);
    public static final l9x0 O0 = new l9x0(13);
    public static final l9x0 P0 = new l9x0(14);
    public static final l9x0 Q0 = new l9x0(15);
    public static final l9x0 R0 = new l9x0(16);
    public static final l9x0 S0 = new l9x0(17);
    public static final l9x0 T0 = new l9x0(18);
    public static final l9x0 U0 = new l9x0(19);
    public static final l9x0 V0 = new l9x0(20);
    public static final l9x0 W0 = new l9x0(21);
    public static final l9x0 X0 = new l9x0(22);
    public static final l9x0 Y0 = new l9x0(23);
    public static final l9x0 Z0 = new l9x0(24);
    public static final l9x0 a1 = new l9x0(25);
    public static final l9x0 b1 = new l9x0(26);

    public /* synthetic */ l9x0(byte b2) {
        this.a = b2;
    }

    public static final void a(ha4 ha4Var) {
        Class cls = ha4.j2;
        if (Build.VERSION.SDK_INT <= 28 || !ha4Var.isAttachedToWindow()) {
            return;
        }
        if (ha4.n2 == null) {
            k kVar = new k((byte) 5);
            ha4.n2 = kVar;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (ha4.j2 == null) {
                    ha4.j2 = Class.forName("android.os.SystemProperties");
                }
                Method declaredMethod = ha4.l2;
                if (declaredMethod == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls2 = ha4.j2;
                    declaredMethod = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    ha4.l2 = declaredMethod;
                }
                if (declaredMethod != null) {
                    declaredMethod.invoke(null, kVar);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        wdn0 wdn0Var = ha4.m2;
        synchronized (wdn0Var) {
            wdn0Var.b(ha4Var);
        }
    }

    public static final void d(ha4 ha4Var) {
        Class cls = ha4.j2;
        if (Build.VERSION.SDK_INT > 28) {
            wdn0 wdn0Var = ha4.m2;
            synchronized (wdn0Var) {
                wdn0Var.k(ha4Var);
            }
        }
    }

    public static View e(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = ha4.p2;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                ha4.p2 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (u890.j(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewE = e(viewGroup.getChildAt(i3), i2);
                    if (viewE != null) {
                        return viewE;
                    }
                }
            }
        }
        return null;
    }

    public static View f(int i2, ha4 ha4Var) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return e(ha4Var, i2);
            }
            Class cls = ha4.j2;
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(ha4Var, Integer.valueOf(i2));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static boolean i() {
        try {
            if (ha4.j2 == null) {
                ha4.j2 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = ha4.k2;
            if (declaredMethod == null) {
                Class cls = ha4.j2;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                ha4.k2 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return u890.j(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ntj0 */
    public Object apply(Object obj) throws ntj0 {
        Boolean bool;
        boolean zBooleanValue = false;
        switch (this.a) {
            case 0:
                return Observable.empty();
            case 1:
                return pry0.a;
            case 2:
            case 4:
            case 6:
            case 12:
            case 15:
            case 17:
            case 18:
            case 20:
            case 22:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return YourLibraryContainsResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 3:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0) {
                    throw new ntj0(String.format("Something went wrong while trying to load the Recently\n                Played Artist section in the profile platform. Status code: %s\n            ", Arrays.copyOf(new Object[]{Integer.valueOf(ry21Var.d)}, 1)));
                }
                Object obj2 = sy21Var.b;
                obj2.getClass();
                return (ArtistlistResponse.RecentlyPlayedArtistsList) obj2;
            case 5:
                sy21 sy21Var2 = (sy21) obj;
                if (sy21Var2.a.Q0 && (bool = (Boolean) sy21Var2.b) != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 7:
                return new kb41(false);
            case 8:
                return (ContextTrack) ((spq0) obj).b();
            case 9:
                n57.e("[Puffin] SetCoreFiltersUseCase failed");
                return Completable.j(new m9((byte) 3));
            case 10:
                return new p781(((c481) obj).a);
            case 11:
                return new up81();
            case 13:
                return new zxo0((lo91) obj);
            case 14:
                return new q3a1((ga61) obj);
            case 16:
                return vac1.a;
            case 19:
                return b7x.a;
            case 21:
                hcn0 hcn0Var = (hcn0) obj;
                NpvWidgetResponse npvWidgetResponse = hcn0Var.a;
                h290 h290VarP = npvWidgetResponse.p();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it = h290VarP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoCard) it.next()).n());
                }
                String str = hcn0Var.d;
                h290 h290VarP2 = npvWidgetResponse.p();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP2, 10));
                Iterator it2 = h290VarP2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((VideoCard) it2.next()).n());
                }
                return new cyo0(str, arrayList, arrayList2);
            case 23:
                DiscoveryFromSeedResponse discoveryFromSeedResponse = (DiscoveryFromSeedResponse) obj;
                Any anyN = discoveryFromSeedResponse.n();
                return u890.j(anyN != null ? anyN.p() : null, "type.googleapis.com/spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCarouselComponent") ? new pal1(WatchFeedVideoCarouselComponent.n(discoveryFromSeedResponse.n().q())) : new oal1(l1d.m("Unknown type: ", discoveryFromSeedResponse.n().p()));
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 4:
                return First.b((hh11) obj);
            default:
                return First.b((vrh1) obj);
        }
    }

    public boolean g(msi0 msi0Var) {
        return false;
    }

    public eyh0 h() {
        eyh0 eyh0Var;
        eyh0 eyh0Var2 = eyh0.g;
        if (eyh0Var2 != null) {
            return eyh0Var2;
        }
        synchronized (this) {
            eyh0Var = eyh0.g;
            if (eyh0Var == null) {
                eyh0 eyh0Var3 = new eyh0(zce0.a(wf10.a()), new ps7((byte) 3), (byte) 1);
                eyh0.g = eyh0Var3;
                eyh0Var = eyh0Var3;
            }
        }
        return eyh0Var;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 12:
                return new yvg1((String) obj, (t380) obj2, (fvf1) obj3);
            case 15:
                return new yvg1((String) obj, (Integer) obj2, (Boolean) obj3);
            default:
                return new mie1(lhe1.b, (((Boolean) obj3).booleanValue() || ((Boolean) obj).booleanValue()) ? false : true);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((sp91) obj).i.isEmpty();
            default:
                return ((tv00) ((mmr0) obj).a).b != null;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        hju hjuVarH = esl1Var.h();
        if (hjuVarH != null && Build.VERSION.SDK_INT >= 28) {
            ph5.x(hjuVarH.a);
        }
        hju hjuVarH2 = esl1Var.h();
        int iZ = (hjuVarH2 == null || Build.VERSION.SDK_INT < 28) ? 0 : ph5.z(hjuVarH2.a);
        hju hjuVarH3 = esl1Var.h();
        if (hjuVarH3 != null && Build.VERSION.SDK_INT >= 28) {
            ph5.y(hjuVarH3.a);
        }
        hju hjuVarH4 = esl1Var.h();
        int iW = (hjuVarH4 == null || Build.VERSION.SDK_INT < 28) ? 0 : ph5.w(hjuVarH4.a);
        nk80 nk80VarI = esl1Var.i(647);
        int i2 = nk80VarI.b;
        int i3 = nk80VarI.d;
        if (iZ < i2) {
            iZ = i2;
        }
        if (iW < i3) {
            iW = i3;
        }
        view.setPadding(0, iZ, 0, iW);
        view.requestLayout();
        return hsl1Var;
    }

    public void b(msi0 msi0Var, boolean z) {
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (((Boolean) obj).booleanValue()) {
            return new i5w0(bool);
        }
        return j5.a;
    }
}
