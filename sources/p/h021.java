package p;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp/h021;", "Lp/zf30;", "Lp/ug30;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_remoteconfig_debugfeature-debugfeature"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class h021 extends zf30 implements ug30, o6r0 {
    public Button F1;
    public TextView G1;
    public TextView H1;
    public TextView I1;
    public TextView J1;
    public TextView K1;
    public lw21 M1;
    public o241 N1;
    public Observable O1;
    public Observable P1;
    public Optional Q1;
    public luw0 R1;
    public Scheduler S1;
    public c26 T1;
    public final CompositeDisposable L1 = new CompositeDisposable();
    public final h021 U1 = this;
    public final gn10 V1 = mno1.c0;

    public final String A(Context context) {
        return context.getString(2131961118);
    }

    public final void H0() {
        this.L1.dispose();
        ((zf30) this).h1 = true;
    }

    public final void I0(View view, Bundle bundle) {
        Observable observableJust;
        p241 p241Var = this.N1;
        if (p241Var == null) {
            u890.C("rxProductState");
            throw null;
        }
        final byte b = 0;
        Disposable disposableSubscribe = p241Var.a("com.spotify.madprops.delivered.by.ucs", "N/A").observeOn(Y0()).subscribe(new Consumer(this) { // from class: p.f021
            public final /* synthetic */ h021 b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b2 = b;
                h021 h021Var = this.b;
                switch (b2) {
                    case 0:
                        String str = (String) obj;
                        TextView textView = h021Var.I1;
                        if (textView != null) {
                            textView.setText(str);
                            return;
                        } else {
                            u890.C("productStateDeliveredTextView");
                            throw null;
                        }
                    case 1:
                        String str2 = (String) obj;
                        TextView textView2 = h021Var.J1;
                        if (textView2 != null) {
                            textView2.setText(str2);
                            return;
                        } else {
                            u890.C("productStateUseTextView");
                            throw null;
                        }
                    case 2:
                        EsRemoteConfigDummy.ResolveDummyResponse resolveDummyResponse = (EsRemoteConfigDummy.ResolveDummyResponse) obj;
                        TextView textView3 = h021Var.K1;
                        if (textView3 != null) {
                            textView3.setText(resolveDummyResponse.getValue());
                            return;
                        } else {
                            u890.C("corePropertyValueTextView");
                            throw null;
                        }
                    case 3:
                        String str3 = (String) obj;
                        TextView textView4 = h021Var.H1;
                        if (textView4 == null) {
                            u890.C("unauthColorValueTextView");
                            throw null;
                        }
                        textView4.setText(str3);
                        Optional optional = h021Var.Q1;
                        if (optional != null) {
                            optional.ifPresent(g021.c);
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                    default:
                        y16 y16Var = (y16) obj;
                        ike1.a.v("BUTTON COLOR -> " + y16Var, new Object[0]);
                        String string = y16Var.toString();
                        Button button = h021Var.F1;
                        if (button == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button.setBackgroundColor(Color.parseColor(string));
                        Button button2 = h021Var.F1;
                        if (button2 == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button2.setText(string);
                        Optional optional2 = h021Var.Q1;
                        if (optional2 != null) {
                            optional2.ifPresent(new zie0(y16Var));
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                }
            }
        });
        p241 p241Var2 = this.N1;
        if (p241Var2 == null) {
            u890.C("rxProductState");
            throw null;
        }
        final byte b2 = 1;
        Disposable disposableSubscribe2 = p241Var2.a("com.spotify.madprops.use.ucs.product.state", "N/A").observeOn(Y0()).subscribe(new Consumer(this) { // from class: p.f021
            public final /* synthetic */ h021 b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b3 = b2;
                h021 h021Var = this.b;
                switch (b3) {
                    case 0:
                        String str = (String) obj;
                        TextView textView = h021Var.I1;
                        if (textView != null) {
                            textView.setText(str);
                            return;
                        } else {
                            u890.C("productStateDeliveredTextView");
                            throw null;
                        }
                    case 1:
                        String str2 = (String) obj;
                        TextView textView2 = h021Var.J1;
                        if (textView2 != null) {
                            textView2.setText(str2);
                            return;
                        } else {
                            u890.C("productStateUseTextView");
                            throw null;
                        }
                    case 2:
                        EsRemoteConfigDummy.ResolveDummyResponse resolveDummyResponse = (EsRemoteConfigDummy.ResolveDummyResponse) obj;
                        TextView textView3 = h021Var.K1;
                        if (textView3 != null) {
                            textView3.setText(resolveDummyResponse.getValue());
                            return;
                        } else {
                            u890.C("corePropertyValueTextView");
                            throw null;
                        }
                    case 3:
                        String str3 = (String) obj;
                        TextView textView4 = h021Var.H1;
                        if (textView4 == null) {
                            u890.C("unauthColorValueTextView");
                            throw null;
                        }
                        textView4.setText(str3);
                        Optional optional = h021Var.Q1;
                        if (optional != null) {
                            optional.ifPresent(g021.c);
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                    default:
                        y16 y16Var = (y16) obj;
                        ike1.a.v("BUTTON COLOR -> " + y16Var, new Object[0]);
                        String string = y16Var.toString();
                        Button button = h021Var.F1;
                        if (button == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button.setBackgroundColor(Color.parseColor(string));
                        Button button2 = h021Var.F1;
                        if (button2 == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button2.setText(string);
                        Optional optional2 = h021Var.Q1;
                        if (optional2 != null) {
                            optional2.ifPresent(new zie0(y16Var));
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                }
            }
        });
        Observable observable = this.O1;
        if (observable == null) {
            u890.C("esperantoClientObservable");
            throw null;
        }
        final byte b3 = 2;
        Disposable disposableSubscribe3 = observable.flatMap(u3x0.g).observeOn(Y0()).subscribe(new Consumer(this) { // from class: p.f021
            public final /* synthetic */ h021 b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b4 = b3;
                h021 h021Var = this.b;
                switch (b4) {
                    case 0:
                        String str = (String) obj;
                        TextView textView = h021Var.I1;
                        if (textView != null) {
                            textView.setText(str);
                            return;
                        } else {
                            u890.C("productStateDeliveredTextView");
                            throw null;
                        }
                    case 1:
                        String str2 = (String) obj;
                        TextView textView2 = h021Var.J1;
                        if (textView2 != null) {
                            textView2.setText(str2);
                            return;
                        } else {
                            u890.C("productStateUseTextView");
                            throw null;
                        }
                    case 2:
                        EsRemoteConfigDummy.ResolveDummyResponse resolveDummyResponse = (EsRemoteConfigDummy.ResolveDummyResponse) obj;
                        TextView textView3 = h021Var.K1;
                        if (textView3 != null) {
                            textView3.setText(resolveDummyResponse.getValue());
                            return;
                        } else {
                            u890.C("corePropertyValueTextView");
                            throw null;
                        }
                    case 3:
                        String str3 = (String) obj;
                        TextView textView4 = h021Var.H1;
                        if (textView4 == null) {
                            u890.C("unauthColorValueTextView");
                            throw null;
                        }
                        textView4.setText(str3);
                        Optional optional = h021Var.Q1;
                        if (optional != null) {
                            optional.ifPresent(g021.c);
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                    default:
                        y16 y16Var = (y16) obj;
                        ike1.a.v("BUTTON COLOR -> " + y16Var, new Object[0]);
                        String string = y16Var.toString();
                        Button button = h021Var.F1;
                        if (button == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button.setBackgroundColor(Color.parseColor(string));
                        Button button2 = h021Var.F1;
                        if (button2 == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button2.setText(string);
                        Optional optional2 = h021Var.Q1;
                        if (optional2 != null) {
                            optional2.ifPresent(new zie0(y16Var));
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                }
            }
        });
        Observable observable2 = this.P1;
        if (observable2 == null) {
            u890.C("remoteConfigUnauthConsumerObservable");
            throw null;
        }
        final byte b4 = 3;
        Disposable disposableSubscribe4 = observable2.observeOn(Y0()).map(a4x0.g).subscribe(new Consumer(this) { // from class: p.f021
            public final /* synthetic */ h021 b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b5 = b4;
                h021 h021Var = this.b;
                switch (b5) {
                    case 0:
                        String str = (String) obj;
                        TextView textView = h021Var.I1;
                        if (textView != null) {
                            textView.setText(str);
                            return;
                        } else {
                            u890.C("productStateDeliveredTextView");
                            throw null;
                        }
                    case 1:
                        String str2 = (String) obj;
                        TextView textView2 = h021Var.J1;
                        if (textView2 != null) {
                            textView2.setText(str2);
                            return;
                        } else {
                            u890.C("productStateUseTextView");
                            throw null;
                        }
                    case 2:
                        EsRemoteConfigDummy.ResolveDummyResponse resolveDummyResponse = (EsRemoteConfigDummy.ResolveDummyResponse) obj;
                        TextView textView3 = h021Var.K1;
                        if (textView3 != null) {
                            textView3.setText(resolveDummyResponse.getValue());
                            return;
                        } else {
                            u890.C("corePropertyValueTextView");
                            throw null;
                        }
                    case 3:
                        String str3 = (String) obj;
                        TextView textView4 = h021Var.H1;
                        if (textView4 == null) {
                            u890.C("unauthColorValueTextView");
                            throw null;
                        }
                        textView4.setText(str3);
                        Optional optional = h021Var.Q1;
                        if (optional != null) {
                            optional.ifPresent(g021.c);
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                    default:
                        y16 y16Var = (y16) obj;
                        ike1.a.v("BUTTON COLOR -> " + y16Var, new Object[0]);
                        String string = y16Var.toString();
                        Button button = h021Var.F1;
                        if (button == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button.setBackgroundColor(Color.parseColor(string));
                        Button button2 = h021Var.F1;
                        if (button2 == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button2.setText(string);
                        Optional optional2 = h021Var.Q1;
                        if (optional2 != null) {
                            optional2.ifPresent(new zie0(y16Var));
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                }
            }
        });
        c26 c26Var = this.T1;
        if (c26Var == null) {
            u890.C("properties");
            throw null;
        }
        if (c26Var.d != null) {
            observableJust = ((Observable) c26Var.f.getValue()).map(j561.h).distinctUntilChanged();
            observableJust.getClass();
        } else {
            observableJust = Observable.just(c26Var.b);
            observableJust.getClass();
        }
        final byte b5 = 4;
        this.L1.f(new Disposable[]{disposableSubscribe, disposableSubscribe2, disposableSubscribe3, disposableSubscribe4, observableJust.observeOn(Y0()).distinctUntilChanged().subscribe(new Consumer(this) { // from class: p.f021
            public final /* synthetic */ h021 b;

            {
                this.b = this;
            }

            public final void accept(Object obj) {
                byte b6 = b5;
                h021 h021Var = this.b;
                switch (b6) {
                    case 0:
                        String str = (String) obj;
                        TextView textView = h021Var.I1;
                        if (textView != null) {
                            textView.setText(str);
                            return;
                        } else {
                            u890.C("productStateDeliveredTextView");
                            throw null;
                        }
                    case 1:
                        String str2 = (String) obj;
                        TextView textView2 = h021Var.J1;
                        if (textView2 != null) {
                            textView2.setText(str2);
                            return;
                        } else {
                            u890.C("productStateUseTextView");
                            throw null;
                        }
                    case 2:
                        EsRemoteConfigDummy.ResolveDummyResponse resolveDummyResponse = (EsRemoteConfigDummy.ResolveDummyResponse) obj;
                        TextView textView3 = h021Var.K1;
                        if (textView3 != null) {
                            textView3.setText(resolveDummyResponse.getValue());
                            return;
                        } else {
                            u890.C("corePropertyValueTextView");
                            throw null;
                        }
                    case 3:
                        String str3 = (String) obj;
                        TextView textView4 = h021Var.H1;
                        if (textView4 == null) {
                            u890.C("unauthColorValueTextView");
                            throw null;
                        }
                        textView4.setText(str3);
                        Optional optional = h021Var.Q1;
                        if (optional != null) {
                            optional.ifPresent(g021.c);
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                    default:
                        y16 y16Var = (y16) obj;
                        ike1.a.v("BUTTON COLOR -> " + y16Var, new Object[0]);
                        String string = y16Var.toString();
                        Button button = h021Var.F1;
                        if (button == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button.setBackgroundColor(Color.parseColor(string));
                        Button button2 = h021Var.F1;
                        if (button2 == null) {
                            u890.C("testButton");
                            throw null;
                        }
                        button2.setText(string);
                        Optional optional2 = h021Var.Q1;
                        if (optional2 != null) {
                            optional2.ifPresent(new zie0(y16Var));
                            return;
                        } else {
                            u890.C("dataLoaded");
                            throw null;
                        }
                }
            }
        })});
        Optional optional = this.Q1;
        if (optional != null) {
            optional.ifPresent(g021.b);
        } else {
            u890.C("dataLoaded");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getV1() {
        return this.V1;
    }

    public final Scheduler Y0() {
        Scheduler scheduler = this.S1;
        if (scheduler != null) {
            return scheduler;
        }
        u890.C("mainScheduler");
        throw null;
    }

    public final zf30 b() {
        return this.U1;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("REMOTECONFIGURATION_DEBUG", "remoteconfiguration/debug", 1649, "remoteconfiguration"), (qir0) null, 4));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("REMOTECONFIGURATION_DEBUG", "remoteconfiguration/debug", 1649, "remoteconfiguration");
    }

    public final String s() {
        return "fragment_remoteconfiguration";
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131624693, viewGroup, false);
        Button button = (Button) viewGroup2.findViewById(2131430636);
        Button button2 = (Button) viewGroup2.findViewById(2131430635);
        Button button3 = (Button) viewGroup2.findViewById(2131430634);
        this.I1 = (TextView) viewGroup2.findViewById(2131430639);
        this.J1 = (TextView) viewGroup2.findViewById(2131430641);
        this.K1 = (TextView) viewGroup2.findViewById(2131430637);
        this.F1 = (Button) viewGroup2.findViewById(2131430633);
        this.G1 = (TextView) viewGroup2.findViewById(2131430643);
        this.H1 = (TextView) viewGroup2.findViewById(2131430644);
        button.setOnClickListener(new e021(this, (byte) 0));
        button3.setOnClickListener(new e021(this, (byte) 1));
        button2.setOnClickListener(new e021(this, (byte) 2));
        return viewGroup2;
    }
}
