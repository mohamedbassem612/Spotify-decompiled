package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import android.text.StaticLayout;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.mlkit.common.MlKitException;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n9m implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public n9m(String str, tv80 tv80Var, Bundle bundle, tzr0 tzr0Var, zxf zxfVar) {
        this.a = (byte) 5;
        this.b = str;
        this.c = tv80Var;
        this.d = bundle;
        this.e = tzr0Var;
        this.f = zxfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    @Override // java.lang.Runnable
    public final void run() throws MlKitException {
        lgy lgyVar;
        tv80 tv80Var;
        Bundle bundle;
        wp20 wp20Var;
        dsk0 dsk0Var;
        p410 p410Var;
        ds91 es91Var = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                TextView textView = (TextView) this.d;
                String str = (String) this.b;
                Float f = (Float) this.e;
                rr80 rr80Var = (rr80) this.f;
                int i = rr80Var.a;
                int i2 = rr80Var.b;
                int i3 = rr80Var.c;
                if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                    return;
                }
                while (true) {
                    float f2 = i;
                    textView.getPaint().setTextSize(TypedValue.applyDimension(2, f2, textView.getContext().getResources().getDisplayMetrics()));
                    StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textView.getPaint(), textView.getWidth()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).build();
                    boolean z2 = staticLayoutBuild.getLineCount() <= textView.getMaxLines() && (f == null || (((float) staticLayoutBuild.getHeight()) > f.floatValue() ? 1 : (((float) staticLayoutBuild.getHeight()) == f.floatValue() ? 0 : -1)) <= 0);
                    if (rr80Var.isEmpty()) {
                        throw new NoSuchElementException("Progression " + rr80Var + " is empty.");
                    }
                    if (i == i2 || z2) {
                        textView.setTextSize(2, f2);
                        textView.setText(str);
                        return;
                    } else if (i == i2) {
                        return;
                    } else {
                        i += i3;
                    }
                }
                break;
            case 1:
                ux70 ux70Var = ((ser) this.c).b;
                Activity activity = (Activity) this.d;
                a1r0 a1r0Var = (a1r0) ux70Var.invoke(activity);
                a1r0Var.n((String) this.b, (String) this.e, (Bundle) this.f, a1r0Var.h(activity));
                return;
            case 2:
                kp5 kp5Var = (kp5) this.c;
                Context context = (Context) kp5Var.a;
                ((ke71) kp5Var.c).m();
                String str2 = (String) this.b;
                if (str2.length() > 0) {
                    String string = context.getString(2131952241, str2);
                    lgyVar = new lgy();
                    lgyVar.c = string;
                    lgyVar.a = false;
                } else {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952249});
                    lgy lgyVar2 = new lgy();
                    Integer num = (Integer) lgyVar2.d;
                    if (num != null && num.intValue() == 0) {
                        z = false;
                    }
                    n57.k(z, "Invalid resource ID provided: %s", new Object[]{num});
                    lgyVar2.d = 2131952249;
                    lgyVar2.a = false;
                    lgyVar = lgyVar2;
                }
                String str3 = (String) this.d;
                cvr cvrVar = str3 != null ? new cvr(kp5Var, str3, (byte) 16) : null;
                ykt yktVar = (alt) this.e;
                if (yktVar != null) {
                    if (yktVar instanceof ykt) {
                        es91Var = new ds91(yktVar.a);
                    } else {
                        if (!(yktVar instanceof zkt)) {
                            eg.o();
                            return;
                        }
                        es91Var = new es91(((zkt) yktVar).a, qz70.c(context, 2131232417, 3, 16));
                    }
                }
                lgyVar.b = es91Var;
                lgyVar.h = cvrVar;
                lgyVar.b(2131952248);
                lgyVar.g = new cvr(kp5Var, (gs91) this.f, (byte) 15);
                er91 er91VarC = lgyVar.c();
                kt91 kt91Var = (kt91) kp5Var.d;
                if (kt91Var.g()) {
                    kt91Var.k(er91VarC);
                    return;
                } else {
                    kt91Var.o(er91VarC);
                    return;
                }
            case 3:
                IBinder binder = ((Messenger) ((d4e0) this.c).b).getBinder();
                SpotifyMediaBrowserService spotifyMediaBrowserService = (jih0) ((hod0) this.f).b;
                zhh0 zhh0Var = (zhh0) ((jih0) spotifyMediaBrowserService).d.get(binder);
                if (zhh0Var == null) {
                    return;
                }
                HashMap map = zhh0Var.e;
                String str4 = (String) this.b;
                IBinder iBinder = (IBinder) this.d;
                Bundle bundle2 = (Bundle) this.e;
                List<nmr0> arrayList = (List) map.get(str4);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (nmr0 nmr0Var : arrayList) {
                    if (iBinder == nmr0Var.a) {
                        Bundle bundle3 = (Bundle) nmr0Var.b;
                        if (bundle2 == bundle3) {
                            return;
                        }
                        if (bundle2 == null) {
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle3 == null) {
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == bundle3.getInt("android.media.browse.extra.PAGE", -1) && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                arrayList.add(new nmr0(iBinder, bundle2));
                map.put(str4, arrayList);
                spotifyMediaBrowserService.b(str4, zhh0Var, bundle2);
                spotifyMediaBrowserService.d().l(new vsr0(str4));
                return;
            case 4:
                IBinder binder2 = ((Messenger) ((d4e0) this.c).b).getBinder();
                SpotifyMediaBrowserService spotifyMediaBrowserService2 = (jih0) ((hod0) this.f).b;
                if (((zhh0) ((jih0) spotifyMediaBrowserService2).d.get(binder2)) == null) {
                    return;
                }
                String str5 = (String) this.b;
                Bundle bundle4 = (Bundle) this.d;
                yhh0 yhh0Var = new yhh0(str5, (ResultReceiver) this.e, (byte) 1);
                SpotifyMediaBrowserService spotifyMediaBrowserService3 = spotifyMediaBrowserService2;
                String string2 = bundle4 != null ? bundle4.getString("com.spotify.music.extras.SEARCH_INTEGRATION") : null;
                hs41 hs41Var = spotifyMediaBrowserService3.X;
                if (hs41Var == null) {
                    u890.C("searchLatencyMeasurementFactory");
                    throw null;
                }
                q1m q1mVarA = hs41Var.a();
                q1mVarA.d(1, string2);
                yhh0Var.a();
                spotifyMediaBrowserService3.d().k(str5, bundle4, string2, q1mVarA, new iv81(q1mVarA, yhh0Var, (byte) 27), new qm71(str5, q1mVarA, yhh0Var, (byte) 22), new m551(str5, q1mVarA, yhh0Var, (byte) 24));
                if (yhh0Var.b()) {
                    return;
                }
                eg.m("onSearch must call detach() or sendResult() before returning for query=".concat(str5));
                return;
            case 5:
                tzr0 tzr0Var = (tzr0) this.e;
                String str6 = (String) this.b;
                if (!nhc1.Y(str6, "spotify:", false) || (tv80Var = (tv80) this.c) == null || (bundle = (Bundle) this.d) == null) {
                    huj.b((lzn0) tzr0Var.c, (Activity) tzr0Var.e, (ryf) tzr0Var.d, (zxf) this.f, (String) this.b, (tv80) this.c);
                    return;
                } else {
                    ((lzn0) tzr0Var.c).a(str6, tv80Var, bundle);
                    return;
                }
            case 6:
                ywv0 ywv0Var = (ywv0) this.c;
                i5q i5qVar = (i5q) ywv0Var.e;
                muz muzVar = (muz) ywv0Var.h;
                switch (i5qVar.a) {
                    case 0:
                        thq thqVar = i5qVar.b;
                        v5q v5qVar = thqVar.c;
                        wp20Var = new wp20(muzVar, (Activity) v5qVar.i.a, (j5q) v5qVar.H7.get(), (i8h1) thqVar.b.A5.get());
                        break;
                    case 1:
                        r7q r7qVar = i5qVar.b;
                        s7q s7qVar = r7qVar.d;
                        wp20Var = new wp20(muzVar, (Activity) s7qVar.t.a, (j5q) s7qVar.m5.get(), (i8h1) r7qVar.b.A5.get());
                        break;
                    default:
                        r7q r7qVar2 = i5qVar.b;
                        teq teqVar = r7qVar2.d;
                        wp20Var = new wp20(muzVar, (Activity) teqVar.f.a, (j5q) teqVar.bb.get(), (i8h1) r7qVar2.b.A5.get());
                        break;
                }
                wp20 wp20Var2 = wp20Var;
                idd1 idd1Var = (idd1) wp20Var2.e;
                String str7 = (String) this.b;
                Function0 function0 = (Function0) this.d;
                Function0 function1 = (Function0) this.e;
                Function0 function2 = (Function0) this.f;
                dsk0 dsk0Var2 = new dsk0(str7, (byte) 16);
                j5q j5qVar = (j5q) wp20Var2.c;
                switch (j5qVar.a) {
                    case 0:
                        dsk0Var = dsk0Var2;
                        thq thqVar2 = j5qVar.b;
                        daq daqVar = thqVar2.b;
                        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
                        p410Var = new p410(i8h1Var, (zor) daqVar.V6.get(), (g0l) daqVar.E5.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), dsk0Var);
                        break;
                    case 1:
                        dsk0Var = dsk0Var2;
                        r7q r7qVar3 = j5qVar.b;
                        daq daqVar2 = r7qVar3.b;
                        i8h1 i8h1Var2 = (i8h1) daqVar2.A5.get();
                        p410Var = new p410(i8h1Var2, (zor) daqVar2.V6.get(), (g0l) daqVar2.E5.get(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), dsk0Var);
                        break;
                    default:
                        r7q r7qVar4 = j5qVar.b;
                        daq daqVar3 = r7qVar4.b;
                        i8h1 i8h1Var3 = (i8h1) daqVar3.A5.get();
                        dsk0Var = dsk0Var2;
                        p410Var = new p410(i8h1Var3, (zor) daqVar3.V6.get(), (g0l) daqVar3.E5.get(), (Scheduler) daqVar3.z1.get(), (Scheduler) daqVar3.r3.get(), dsk0Var);
                        break;
                }
                p410 p410Var2 = p410Var;
                ConstraintLayout constraintLayoutInflate = LayoutInflater.from((Activity) wp20Var2.b).inflate(2131626308, (ViewGroup) null, false);
                int i4 = 2131427737;
                View viewT = m5n1.t(constraintLayoutInflate, 2131427737);
                if (viewT != null) {
                    i4 = 2131430157;
                    EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutInflate, 2131430157);
                    if (encoreTextViewT != null) {
                        i4 = 2131430399;
                        EncoreProgressIndicatorButton encoreProgressIndicatorButtonT = m5n1.t(constraintLayoutInflate, 2131430399);
                        if (encoreProgressIndicatorButtonT != null) {
                            i4 = 2131431356;
                            if (m5n1.t(constraintLayoutInflate, 2131431356) != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                bih1 bih1Var = new bih1(constraintLayout, viewT, encoreTextViewT, encoreProgressIndicatorButtonT);
                                p811 p811Var = new p811();
                                ((cwb) idd1Var.getValue()).setOnDismissListener(new v090(wp20Var2, dsk0Var, p410Var2, p811Var, function2, function1, function0));
                                encoreProgressIndicatorButtonT.setOnClickListener(new jl5(wp20Var2, bih1Var, p410Var2, p811Var, (byte) 6));
                                encoreTextViewT.setOnClickListener(new zfs(wp20Var2, (byte) 21));
                                cwb cwbVar = (cwb) idd1Var.getValue();
                                cwbVar.setCancelable(true);
                                cwbVar.setContentView(constraintLayout);
                                ((cwb) idd1Var.getValue()).show();
                                return;
                            }
                        }
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i4)));
                return;
            default:
                lce1 lce1Var = (lce1) this.c;
                y1t0 y1t0Var = (y1t0) this.d;
                dp5 dp5Var = (dp5) this.b;
                Callable callable = (Callable) this.e;
                bsd1 bsd1Var = (bsd1) this.f;
                AtomicBoolean atomicBoolean = lce1Var.c;
                hfp1 hfp1Var = (hfp1) y1t0Var.b;
                try {
                    if (hfp1Var.i()) {
                        dp5Var.e();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            synchronized (lce1Var) {
                                lce1Var.d.zzb();
                            }
                            atomicBoolean.set(true);
                        }
                        if (hfp1Var.i()) {
                            dp5Var.e();
                            return;
                        }
                        Object objCall = callable.call();
                        if (hfp1Var.i()) {
                            dp5Var.e();
                            return;
                        } else {
                            bsd1Var.b(objCall);
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e2) {
                    if (hfp1Var.i()) {
                        dp5Var.e();
                        return;
                    } else {
                        bsd1Var.a(e2);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ n9m(Object obj, String str, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n9m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ n9m(hod0 hod0Var, d4e0 d4e0Var, String str, Object obj, Parcelable parcelable, byte b) {
        this.a = b;
        this.f = hod0Var;
        this.c = d4e0Var;
        this.b = str;
        this.d = obj;
        this.e = parcelable;
    }
}
