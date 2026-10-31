package com.spotify.profile.editprofile.pictureselection;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.FileProvider;
import com.spotify.profile.editprofile.imageutils.CroppingImageView;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.dg30;
import p.dys0;
import p.e1r0;
import p.ewn0;
import p.eys0;
import p.fys0;
import p.g4b1;
import p.gg;
import p.gh0;
import p.gw70;
import p.hh0;
import p.j4b1;
import p.kx40;
import p.l2a;
import p.l420;
import p.mgn0;
import p.mir0;
import p.mvs0;
import p.oi;
import p.p6r0;
import p.pbo1;
import p.qh0;
import p.qir0;
import p.r0w;
import p.rwq0;
import p.sra;
import p.st60;
import p.t3b1;
import p.u890;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/spotify/profile/editprofile/pictureselection/PictureSelectionActivity;", "Lp/t3b1;", "<init>", "()V", "p/yxs0", "p/cys0", "p/e1r0", "src_main_java_com_spotify_profile_editprofile_pictureselection-pictureselection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PictureSelectionActivity extends t3b1 {
    public static final /* synthetic */ int y1 = 0;
    public Scheduler f1;
    public Scheduler g1;
    public gw70 h1;
    public st60 i1;
    public r0w j1;
    public CroppingImageView l1;
    public Button m1;
    public Button n1;
    public boolean o1;
    public View p1;
    public Uri q1;
    public Uri r1;
    public Uri s1;
    public qh0 w1;
    public qh0 x1;
    public final SerialDisposable k1 = new SerialDisposable();
    public final dys0 t1 = new dys0(this, 2);
    public final dys0 u1 = new dys0(this, 1);
    public final dys0 v1 = new dys0(this, 0);

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.m4(), (qir0) null, 4));
    }

    public final void o0() {
        Single singleFromCallable = Single.fromCallable(new sra(this, (byte) 13));
        Scheduler scheduler = this.g1;
        if (scheduler == null) {
            u890.C("ioScheduler");
            throw null;
        }
        Single singleSubscribeOn = singleFromCallable.subscribeOn(scheduler);
        Scheduler scheduler2 = this.f1;
        if (scheduler2 == null) {
            u890.C("mainThreadScheduler");
            throw null;
        }
        DisposableHelper.f(this.k1.a, singleSubscribeOn.observeOn(scheduler2).subscribe(new eys0(this, (byte) 0), new eys0(this, (byte) 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o1 = getIntent().getBooleanExtra("using-camera", false);
        getIntent().getBooleanExtra("using-android-14-photo-picker", false);
        this.w1 = a0(new fys0(this, (byte) 0), new e1r0((byte) 2));
        this.x1 = a0(new fys0(this, (byte) 1), new e1r0((byte) 7));
        if (bundle != null) {
            this.q1 = (Uri) bundle.getParcelable("camera-output-image-uri");
            this.r1 = (Uri) bundle.getParcelable("image-uri");
            this.s1 = (Uri) bundle.getParcelable("preview-image-uri");
        }
        setContentView(2131623992);
        rwq0.s(getWindow().getDecorView().getRootView(), mgn0.Z);
        this.l1 = (CroppingImageView) findViewById(2131430488);
        Button button = (Button) findViewById(2131427829);
        this.n1 = button;
        if (button != null) {
            button.setOnClickListener(this.t1);
        }
        Button button2 = (Button) findViewById(2131427823);
        this.m1 = button2;
        if (button2 != null) {
            button2.setOnClickListener(this.u1);
        }
        this.p1 = findViewById(2131429840);
        ImageButton imageButton = (ImageButton) findViewById(2131427810);
        g4b1 g4b1Var = new g4b1(this, j4b1.Q7, getResources().getDimensionPixelSize(2131165277));
        g4b1Var.b(getColor(2131104462));
        imageButton.setImageDrawable(g4b1Var);
        imageButton.setOnClickListener(this.v1);
        s0(false);
        if (this.r1 != null || bundle != null) {
            if (this.s1 == null) {
                o0();
                return;
            } else {
                q0();
                return;
            }
        }
        if (this.o1) {
            r0();
            return;
        }
        gh0 gh0Var = gh0.a;
        try {
            int iN = gg.n();
            pbo1 pbo1Var = pbo1.b;
            hh0 hh0Var = hh0.a;
            mvs0 mvs0Var = new mvs0();
            mvs0Var.a = gh0Var;
            gg.n();
            mvs0Var.a = hh0Var;
            mvs0Var.b = iN;
            mvs0Var.c = pbo1Var;
            qh0 qh0Var = this.w1;
            if (qh0Var != null) {
                qh0Var.a(mvs0Var);
            }
        } catch (ActivityNotFoundException unused) {
            setResult(0);
            finish();
        }
    }

    public final void onDestroy() {
        super/*p.dac0*/.onDestroy();
        this.k1.a(EmptyDisposable.a);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.dac0*/.onSaveInstanceState(bundle);
        Uri uri = this.q1;
        if (uri != null) {
            bundle.putParcelable("camera-output-image-uri", uri);
        }
        Uri uri2 = this.r1;
        if (uri2 != null) {
            bundle.putParcelable("image-uri", uri2);
        }
        Uri uri3 = this.s1;
        if (uri3 != null) {
            bundle.putParcelable("preview-image-uri", uri3);
        }
    }

    public final r0w p0() {
        r0w r0wVar = this.j1;
        if (r0wVar != null) {
            return r0wVar;
        }
        u890.C("logger");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.ImageView, com.spotify.profile.editprofile.imageutils.CroppingImageView, java.lang.Object] */
    public final void q0() {
        ?? r0 = this.l1;
        if (r0 != 0) {
            gw70 gw70Var = this.h1;
            if (gw70Var == null) {
                u890.C("imageLoader");
                throw null;
            }
            Uri uri = this.s1;
            uri.getClass();
            r0.c1 = new ewn0(this, (byte) 20);
            gw70Var.a(uri);
            gw70Var.b(uri).k((ImageView) r0, new l2a((Object) r0, (byte) 24));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0() {
        qh0 qh0Var;
        try {
            st60 st60Var = this.i1;
            Uri uriForFile = null;
            if (st60Var == null) {
                u890.C("imageFileHelper");
                throw null;
            }
            l420 l420VarQ = st60Var.q(false);
            if (l420VarQ != null) {
                uriForFile = FileProvider.getUriForFile((dg30) st60Var.d, String.format("%s.%s", Arrays.copyOf(new Object[]{(String) st60Var.b, "profile"}, 2)), ((oi) st60Var.c).k(l420VarQ.b.getPath()));
            }
            this.q1 = uriForFile;
            if (uriForFile == null || (qh0Var = this.x1) == null) {
                return;
            }
            qh0Var.a(uriForFile);
        } catch (ActivityNotFoundException unused) {
            setResult(0);
            finish();
        }
    }

    public final void s0(boolean z) {
        AppCompatImageView appCompatImageView = this.l1;
        if (z) {
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            Button button = this.n1;
            if (button != null) {
                button.setVisibility(0);
            }
            Button button2 = this.m1;
            if (button2 != null) {
                button2.setVisibility(this.o1 ? 0 : 8);
            }
            View view = this.p1;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        Button button3 = this.n1;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        Button button4 = this.m1;
        if (button4 != null) {
            button4.setVisibility(8);
        }
        View view2 = this.p1;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
