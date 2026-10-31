package p;

import android.graphics.Rect;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a2w implements Connectable {
    public static final List X0 = k4p1.x(new InputFilter.LengthFilter(32));
    public static final List Y0 = p7h.M(new InputFilter.LengthFilter(50), pr3.b, pr3.c);
    public static final List Z0 = k4p1.x(new InputFilter.LengthFilter(100));
    public final ScrollView N0;
    public final ViewGroup O0;
    public final qzh P0;
    public final qzh Q0;
    public final qzh R0;
    public final qzh S0;
    public final qzh T0;
    public final qzh U0;
    public final Rect V0;
    public final x22 W0;
    public final View X;
    public final StateListAnimatorImageButton Y;
    public final StateListAnimatorButton Z;
    public final dg30 a;
    public final af10 b;
    public final Scheduler c;
    public final mzr0 d;
    public final r0w e;
    public final pp f;
    public final l7m0 g;
    public final kt91 h;
    public final View i;
    public final FaceView t;

    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.widget.TextView, com.spotify.legacyglue.widgetstate.StateListAnimatorButton] */
    public a2w(dg30 dg30Var, LayoutInflater layoutInflater, ViewGroup viewGroup, af10 af10Var, Scheduler scheduler, mzr0 mzr0Var, r0w r0wVar, pp ppVar, l7m0 l7m0Var, kt91 kt91Var) {
        this.a = dg30Var;
        this.b = af10Var;
        this.c = scheduler;
        this.d = mzr0Var;
        this.e = r0wVar;
        this.f = ppVar;
        this.g = l7m0Var;
        this.h = kt91Var;
        View viewInflate = layoutInflater.inflate(2131623996, viewGroup, false);
        this.i = viewInflate;
        this.t = viewInflate.findViewById(2131428559);
        this.X = viewInflate.findViewById(2131428560);
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(dg30Var);
        this.Y = stateListAnimatorImageButton;
        ?? stateListAnimatorButton = new StateListAnimatorButton(dg30Var);
        this.Z = stateListAnimatorButton;
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(2131428581);
        this.N0 = scrollView;
        this.O0 = (ViewGroup) viewInflate.findViewById(2131428578);
        List list = X0;
        this.P0 = a(new z0w(list, 12));
        this.Q0 = a(new z0w((List) null, 23));
        this.R0 = a(new z0w((List) null, 23));
        this.S0 = a(new z0w(list, 22));
        this.T0 = a(new z0w(Y0, 18));
        this.U0 = a(new z0w(Z0, 28));
        this.V0 = new Rect();
        x22 x22Var = new x22(this, (byte) 4);
        this.W0 = x22Var;
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131431411);
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar(dg30Var, viewGroup2);
        glueToolbarCreateGlueToolbar.setTitle(dg30Var.getString(2131955350));
        viewGroup2.addView(glueToolbarCreateGlueToolbar.getView());
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorImageButton.setBackground(null);
        g4b1 g4b1Var = new g4b1(dg30Var, j4b1.X, dg30Var.getResources().getDimensionPixelSize(2131167143));
        g4b1Var.b(x74.D(dg30Var.getBaseContext(), 2131104462));
        stateListAnimatorImageButton.setImageDrawable(g4b1Var);
        stateListAnimatorImageButton.setContentDescription(dg30Var.getString(2131956217));
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.START, stateListAnimatorImageButton, 2131431410);
        stateListAnimatorButton.setBackground(null);
        stateListAnimatorButton.setText(2131955339);
        foo1.F(dg30Var, (TextView) stateListAnimatorButton, 2130969932);
        stateListAnimatorButton.setPadding(0, 0, 0, 0);
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.END, (View) stateListAnimatorButton, 2131431408);
        scrollView.addOnLayoutChangeListener(new eg7(this, (byte) 12));
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(x22Var);
    }

    public static Disposable b(PublishSubject publishSubject, bey0 bey0Var, kma0 kma0Var, iu30 iu30Var, Function0 function0) {
        return publishSubject.distinctUntilChanged((BiPredicate) new jut(iu30Var, kma0Var, (byte) 15)).subscribe((Consumer) new y43(bey0Var, iu30Var, kma0Var, new idd1(new z9t(function0, (byte) 23)), (byte) 5));
    }

    public static Disposable c(PublishSubject publishSubject, bey0 bey0Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, Function0 function0) {
        l811 l811Var = new l811();
        return publishSubject.filter(new gmt(l811Var, iu30Var2, (byte) 18)).distinctUntilChanged((BiPredicate) new bas(iu30Var3, iu30Var)).subscribe((Consumer) new lba(bey0Var, iu30Var3, iu30Var, l811Var, new idd1(new z9t(function0, (byte) 24))));
    }

    public static final Disposable d(PublishSubject publishSubject, a2w a2wVar, iu30 iu30Var, iu30 iu30Var2) {
        return publishSubject.map(new z1w(iu30Var, (byte) 0)).filter(e4y.b1).take(1L).subscribe((Consumer) new lgr(iu30Var2, a2wVar, (byte) 10));
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(com.spotify.mobius.functions.Consumer consumer) {
        ydb ydbVar = new ydb(consumer, (byte) 6);
        this.a.J().b(ydbVar);
        this.X.setOnClickListener(new zfs(new y1w(consumer, this, (byte) 1), (byte) 5));
        this.Y.setOnClickListener(new f1b(consumer, (byte) 5));
        this.Z.setOnClickListener(new m1w(consumer, this, (byte) 0));
        this.t.setOnClickListener(new m1w(consumer, this, (byte) 1));
        this.d.u(new kf(consumer, (byte) 2), new kf(consumer, (byte) 3));
        this.P0.n(new y1w(consumer, this, (byte) 0));
        this.Q0.n(new m42(consumer, (byte) 13));
        this.R0.n(new m42(consumer, (byte) 14));
        this.S0.n(new nit(this, (byte) 24));
        this.T0.n(new m42(consumer, (byte) 11));
        this.U0.n(new m42(consumer, (byte) 12));
        PublishSubject publishSubject = new PublishSubject();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.b(d(publishSubject, this, axv.i, axv.t));
        compositeDisposable.b(d(publishSubject, this, axv.X, axv.Y));
        compositeDisposable.b(d(publishSubject, this, axv.Z, axv.N0));
        compositeDisposable.b(publishSubject.distinctUntilChanged((BiPredicate) new ubc(this, (byte) 8)).subscribe((Consumer) new h1w(this, (byte) 0)));
        compositeDisposable.b(publishSubject.map(q9w.b1).distinctUntilChanged().doOnNext(new h1w(this, (byte) 1)).map(s9w.a1).distinctUntilChanged().throttleLatest(1000L, TimeUnit.MILLISECONDS, this.c).subscribe((Consumer) new h1w(this, (byte) 2)));
        compositeDisposable.b(c(publishSubject, new i1w(this, (byte) 0), j1w.b, k1w.b, axv.O0, new l1w(this, (byte) 0)));
        compositeDisposable.b(b(publishSubject, new i1w(this, (byte) 1), n1w.b, o1w.b, new l1w(this, (byte) 1)));
        compositeDisposable.b(publishSubject.map(t9w.Z0).distinctUntilChanged().subscribe((Consumer) new h1w(this, (byte) 3)));
        compositeDisposable.b(b(publishSubject, new i1w(this, (byte) 2), p1w.b, axv.P0, new l1w(this, (byte) 2)));
        compositeDisposable.b(c(publishSubject, new i1w(this, (byte) 3), q1w.b, r1w.b, s1w.b, new l1w(this, (byte) 3)));
        compositeDisposable.b(b(publishSubject, new i1w(this, (byte) 4), t1w.b, u1w.b, new l1w(this, (byte) 4)));
        compositeDisposable.b(c(publishSubject, new i1w(this, (byte) 5), v1w.b, w1w.b, x1w.b, new l1w(this, (byte) 5)));
        return new w2h(publishSubject, this, ydbVar, compositeDisposable);
    }

    public final qzh a(z0w z0wVar) {
        rhr rhrVarA = this.f.a(z0wVar);
        this.O0.addView(rhrVarA.getView());
        return rhrVarA;
    }
}
