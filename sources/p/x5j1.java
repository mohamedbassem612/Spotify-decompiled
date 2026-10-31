package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5j1 implements o5d0, Function, jrn0, SingleOnSubscribe, hs31, Predicate, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public x5j1(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.a = (byte) 21;
        int i2 = 1;
        int length = fArr.length - 1;
        p26[][] p26VarArr = new p26[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            p26[] p26VarArr2 = new p26[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                p26VarArr2[i11] = new p26(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            p26VarArr[i5] = p26VarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.b = p26VarArr;
    }

    public static x5j1 h(int i, int i2, int i3, boolean z) {
        return new x5j1(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3), (byte) 1);
    }

    public void a(int i) {
        int i2;
        String str;
        rm3 rm3Var = (rm3) this.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            i2 = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            i2 = 2;
        }
        ij81 ij81Var = new ij81(i2, (byte) 2);
        int iC2 = l1d.C(i2);
        if (iC2 == 0) {
            str = "audiobook-onboarding";
        } else {
            if (iC2 != 1) {
                eg.o();
                return;
            }
            str = "podcast-onboarding";
        }
        rm3Var.a.a(str).p(ij81Var);
    }

    public boolean accept(Object obj) {
        return ((rxj0) this.b).d0;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                ou71 ou71Var = ((u11) obj2).b;
                return new qn81(ou71Var.a.e(ou71.b, (String) null), ou71Var.a.e(ou71.c, (String) null));
            case 7:
                String str = ((gz01) obj2).b;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new wz01(str, message);
            case 8:
                on01 on01Var = ((cz1) obj2).b;
                String str2 = ((dcc1) obj).c;
                return j2h1.D(o6xVar, new nn01(on01Var, str2, null, null, (byte) 0)).o(Functions.h).d(Observable.just(new jcc1(str2)));
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                zwe0 zwe0Var = (zwe0) obj;
                return rqt0.F(o6xVar, new k96((km8) obj2, zwe0Var, (lnm) null, (byte) 18)).flatMap(new t4d1((Object) zwe0Var, (byte) 22)).doOnDispose(new f72(zwe0Var, (byte) 3));
            case 10:
                return new hey(((bh90) obj2).b, (List) obj);
            case 15:
                return Single.create(new lan1((bk4) obj2, (byte) 17));
            case 16:
                return Single.create(new lan1((jk4) obj2, (byte) 18));
            case 17:
                return Single.create(new lan1((ox4) obj2, (byte) 20));
            case 22:
                f7h f7hVar = (f7h) ((Map) obj).get(((jx6) obj2).a);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 24:
                ix7 ix7Var = (ix7) obj2;
                return new jx7(((ut71) ix7Var.b).b((Context) ix7Var.d, (String) obj), (bx7) ix7Var.c);
            case 25:
                return ((lhc) obj2).k((hp40) obj);
            case 26:
                ze8 ze8Var = (ze8) obj2;
                t7o0 t7o0Var = ze8Var.a;
                ye8 ye8Var = ze8Var.b;
                bma1 bma1Var = ye8.d;
                return ljg.c((ljg) t7o0Var.b, i5x0.p(((u54) ye8Var.b.b).c()), (TriggerType) null, "spotify:home", (List) null, (tv80) null, (uy31) null, new DynamicTagsMetadata("spotify:home", (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), (ConflictResolutionStrategy) null, (d3j0) null, 442).flatMapObservable(new be8(t7o0Var));
        }
    }

    public void b(int i, int i2) {
        ((z511) this.b).k(i, i2);
    }

    public void c(int i, int i2) {
        ((z511) this.b).l(i, i2);
    }

    public void d(int i, int i2, Object obj) {
        ((z511) this.b).a.d(i, i2, obj);
    }

    public void e(int i, int i2) {
        ((z511) this.b).j(i, i2);
    }

    public oj80 f() {
        return new oj80(this, "hit");
    }

    public void g(slc0 slc0Var, int i, String str) {
        lvc lvcVar = (lvc) this.b;
        if (str == null) {
            str = "";
        }
        lvcVar.f(slc0Var, "alexa", false, "", jup0.i(i), str);
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        kqi0 kqi0Var = (kqi0) ((b72) this.b).b;
        nw40 nw40Var = (nw40) kqi0Var.d;
        Activity activity = (Activity) kqi0Var.b;
        mw40 mw40VarT = yoi1.T(nw40Var.a, activity.getString(2131959096), activity.getString(2131959093));
        String string = activity.getString(2131959094);
        mun0 mun0Var = new mun0(kqi0Var, (byte) 0);
        mw40VarT.a = string;
        mw40VarT.c = mun0Var;
        String string2 = activity.getString(2131959095);
        mun0 mun0Var2 = new mun0(kqi0Var, (byte) 1);
        mw40VarT.b = string2;
        mw40VarT.d = mun0Var2;
        mw40VarT.e = true;
        mw40VarT.b().b();
        rok0 rok0Var = (rok0) kqi0Var.c;
        i8h1 i8h1Var = (i8h1) rok0Var.b;
        jqk0 jqk0Var = (jqk0) rok0Var.c;
        x6h1 x6h1VarC = jqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("language_update_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = jqk0Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        ov2 ov2Var = (ov2) this.b;
        fn31.T(ov2Var.c, (o8n) null, 0, new qm(ov2Var, (lnm) null, (byte) 20), 3);
        return crn0.a;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                o84 o84Var = (o84) obj;
                luk lukVar = o84Var.c;
                if (lukVar == null || !lukVar.i("android-cal-rollout-service.enable_cal")) {
                    lukVar = o84Var.d;
                }
                if (lukVar != null) {
                    lukVar.e(new e44(singleEmitter, o84Var, (byte) 1));
                }
                break;
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.enable_rate_limiter")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 2));
                }
                break;
        }
    }

    public boolean test(Object obj) {
        wq8 wq8Var = ((xq8) obj).a;
        return wq8Var == null || u890.j(wq8Var.a, ((wq8) this.b).a);
    }

    public /* synthetic */ x5j1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
