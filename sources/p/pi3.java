package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lp/pi3;", "", "Lp/dwb;", "<init>", "()V", "p/ki3", "src_main_java_com_spotify_partneraccountlinking_alexafragmentlinking-alexafragmentlinking"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class pi3 extends dwb {
    public oj80 V1;
    public x5j1 W1;
    public ajq0 X1;
    public kt91 Y1;
    public x6o0 Z1;
    public Scheduler a2;
    public final vku b2 = new vku();
    public ki3 c2 = ki3.a;
    public boolean d2;
    public Button e2;
    public Button f2;
    public ImageView g2;
    public View h2;
    public TextView i2;
    public TextView j2;
    public slc0 k2;

    public final void F0(Bundle bundle) {
        bundle.putSerializable("state_key", this.c2);
        super/*p.t2u*/.F0(bundle);
    }

    public final void I0(View view, Bundle bundle) {
        Serializable serializable;
        int i = O0().getInt("times_shown_extra");
        j1().q(i);
        oj80 oj80VarJ1 = j1();
        String str = ((i8h1) oj80VarJ1.b).f(((wqk0) oj80VarJ1.c).e(), (Set) null).a.a;
        slc0 slc0Var = new slc0(UUID.randomUUID().toString());
        this.k2 = slc0Var;
        x5j1 x5j1Var = this.W1;
        if (x5j1Var == null) {
            u890.C("linkingLogger");
            throw null;
        }
        ((lvc) x5j1Var.b).b(i, str, "alexa", "", slc0Var);
        this.e2 = (Button) view.findViewById(2131429778);
        this.f2 = (Button) view.findViewById(2131429728);
        this.g2 = (ImageView) view.findViewById(2131429859);
        this.h2 = view.findViewById(2131430931);
        this.i2 = (TextView) view.findViewById(2131427559);
        this.j2 = (TextView) view.findViewById(2131427558);
        if (bundle == null || (serializable = bundle.getSerializable("state_key")) == null) {
            serializable = ki3.a;
        }
        this.c2 = (ki3) serializable;
        l1();
    }

    public final int b1() {
        return 2132017174;
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVarC1 = super.c1(bundle);
        cwbVarC1.g().J(0);
        cwbVarC1.setOnShowListener(new li3(cwbVarC1, (byte) 0));
        cwbVarC1.g().t(new mi3(cwbVarC1, (byte) 0));
        return cwbVarC1;
    }

    public final String i1() {
        String string;
        String string2;
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || (string = dg30VarF0.getString(2131952217)) == null) {
            string = "";
        }
        dg30 dg30VarF1 = f0();
        return (dg30VarF1 == null || (string2 = dg30VarF1.getString(2131952216, string)) == null) ? "" : string2;
    }

    public final oj80 j1() {
        oj80 oj80Var = this.V1;
        if (oj80Var != null) {
            return oj80Var;
        }
        u890.C("dialogLogger");
        throw null;
    }

    public final void k1(int i) {
        String strL = j1().l();
        this.c2 = ki3.b;
        l1();
        ajq0 ajq0Var = this.X1;
        if (ajq0Var == null) {
            u890.C("linkingExecutor");
            throw null;
        }
        slc0 slc0Var = this.k2;
        if (slc0Var == null) {
            u890.C("linkingId");
            throw null;
        }
        MaybeFlatMapCompletable maybeFlatMapCompletableU = ajq0Var.u(slc0Var, i, strL);
        Scheduler scheduler = this.a2;
        if (scheduler == null) {
            u890.C("mainScheduler");
            throw null;
        }
        this.b2.a(maybeFlatMapCompletableU.n(scheduler).subscribe(new f72(this, (byte) 2), new ni3(this, (byte) 0)));
    }

    public final void l1() {
        int iOrdinal = this.c2.ordinal();
        if (iOrdinal == 0) {
            TextView textView = this.i2;
            if (textView == null) {
                u890.C("titleTextView");
                throw null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.j2;
            if (textView2 == null) {
                u890.C("descriptionTextView");
                throw null;
            }
            textView2.setText(i1());
            ImageView imageView = this.g2;
            if (imageView == null) {
                u890.C("iconImageView");
                throw null;
            }
            imageView.setImageResource(2131230934);
            ImageView imageView2 = this.g2;
            if (imageView2 == null) {
                u890.C("iconImageView");
                throw null;
            }
            imageView2.setVisibility(0);
            View view = this.h2;
            if (view == null) {
                u890.C("setAsDefaultView");
                throw null;
            }
            view.setVisibility(8);
            Button button = this.e2;
            if (button == null) {
                u890.C("actionButton");
                throw null;
            }
            button.setText(2131957339);
            Button button2 = this.e2;
            if (button2 == null) {
                u890.C("actionButton");
                throw null;
            }
            button2.setEnabled(true);
            Button button3 = this.e2;
            if (button3 == null) {
                u890.C("actionButton");
                throw null;
            }
            button3.setOnClickListener(new oi3(this, (byte) 2));
            Button button4 = this.f2;
            if (button4 != null) {
                button4.setOnClickListener(new oi3(this, (byte) 3));
                return;
            } else {
                u890.C("dismissButton");
                throw null;
            }
        }
        if (iOrdinal == 1) {
            TextView textView3 = this.i2;
            if (textView3 == null) {
                u890.C("titleTextView");
                throw null;
            }
            textView3.setText(2131952218);
            TextView textView4 = this.j2;
            if (textView4 == null) {
                u890.C("descriptionTextView");
                throw null;
            }
            textView4.setText(i1());
            ImageView imageView3 = this.g2;
            if (imageView3 == null) {
                u890.C("iconImageView");
                throw null;
            }
            imageView3.setImageResource(2131230934);
            ImageView imageView4 = this.g2;
            if (imageView4 == null) {
                u890.C("iconImageView");
                throw null;
            }
            imageView4.setVisibility(0);
            View view2 = this.h2;
            if (view2 == null) {
                u890.C("setAsDefaultView");
                throw null;
            }
            view2.setVisibility(8);
            Button button5 = this.e2;
            if (button5 == null) {
                u890.C("actionButton");
                throw null;
            }
            button5.setText(2131957345);
            Button button6 = this.e2;
            if (button6 == null) {
                u890.C("actionButton");
                throw null;
            }
            button6.setEnabled(false);
            if (this.d2) {
                return;
            }
            ajq0 ajq0Var = this.X1;
            if (ajq0Var == null) {
                u890.C("linkingExecutor");
                throw null;
            }
            Flowable flowable = ((bn5) ajq0Var.a).c.toFlowable(BackpressureStrategy.d);
            Scheduler scheduler = this.a2;
            if (scheduler == null) {
                u890.C("mainScheduler");
                throw null;
            }
            Disposable disposableSubscribe = flowable.L(scheduler).subscribe(new ni3(this, (byte) 1));
            vku vkuVar = this.b2;
            vkuVar.a(disposableSubscribe);
            Observable observableTimer = Observable.timer(3L, TimeUnit.SECONDS);
            Scheduler scheduler2 = this.a2;
            if (scheduler2 != null) {
                vkuVar.a(observableTimer.observeOn(scheduler2).subscribe(new ni3(this, (byte) 2)));
                return;
            } else {
                u890.C("mainScheduler");
                throw null;
            }
        }
        if (iOrdinal == 2) {
            TextView textView5 = this.i2;
            if (textView5 == null) {
                u890.C("titleTextView");
                throw null;
            }
            textView5.setVisibility(8);
            TextView textView6 = this.j2;
            if (textView6 == null) {
                u890.C("descriptionTextView");
                throw null;
            }
            textView6.setText(2131961650);
            ImageView imageView5 = this.g2;
            if (imageView5 == null) {
                u890.C("iconImageView");
                throw null;
            }
            imageView5.setVisibility(8);
            View view3 = this.h2;
            if (view3 == null) {
                u890.C("setAsDefaultView");
                throw null;
            }
            view3.setVisibility(0);
            Button button7 = this.e2;
            if (button7 == null) {
                u890.C("actionButton");
                throw null;
            }
            button7.setEnabled(true);
            Button button8 = this.e2;
            if (button8 == null) {
                u890.C("actionButton");
                throw null;
            }
            button8.setText(2131961649);
            Button button9 = this.e2;
            if (button9 == null) {
                u890.C("actionButton");
                throw null;
            }
            button9.setOnClickListener(new oi3(this, (byte) 4));
            Button button10 = this.f2;
            if (button10 != null) {
                button10.setOnClickListener(new oi3(this, (byte) 5));
                return;
            } else {
                u890.C("dismissButton");
                throw null;
            }
        }
        if (iOrdinal != 3) {
            eg.o();
            return;
        }
        TextView textView7 = this.i2;
        if (textView7 == null) {
            u890.C("titleTextView");
            throw null;
        }
        textView7.setVisibility(0);
        TextView textView8 = this.i2;
        if (textView8 == null) {
            u890.C("titleTextView");
            throw null;
        }
        textView8.setText(2131952214);
        TextView textView9 = this.j2;
        if (textView9 == null) {
            u890.C("descriptionTextView");
            throw null;
        }
        textView9.setText(2131956770);
        ImageView imageView6 = this.g2;
        if (imageView6 == null) {
            u890.C("iconImageView");
            throw null;
        }
        imageView6.setImageResource(2131230932);
        ImageView imageView7 = this.g2;
        if (imageView7 == null) {
            u890.C("iconImageView");
            throw null;
        }
        imageView7.setVisibility(0);
        View view4 = this.h2;
        if (view4 == null) {
            u890.C("setAsDefaultView");
            throw null;
        }
        view4.setVisibility(8);
        Button button11 = this.e2;
        if (button11 == null) {
            u890.C("actionButton");
            throw null;
        }
        button11.setText(2131961069);
        Button button12 = this.e2;
        if (button12 == null) {
            u890.C("actionButton");
            throw null;
        }
        button12.setEnabled(true);
        Button button13 = this.e2;
        if (button13 == null) {
            u890.C("actionButton");
            throw null;
        }
        button13.setOnClickListener(new oi3(this, (byte) 0));
        Button button14 = this.f2;
        if (button14 != null) {
            button14.setOnClickListener(new oi3(this, (byte) 1));
        } else {
            u890.C("dismissButton");
            throw null;
        }
    }

    public final void m1() {
        kt91 kt91Var = this.Y1;
        if (kt91Var == null) {
            u890.C("snackbarManager");
            throw null;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957342});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131957342, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m1();
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624037, viewGroup, false);
    }

    public final void y0() {
        this.b2.c();
        ((zf30) this).h1 = true;
    }
}
