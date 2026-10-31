package com.spotify.encoremobile.facepile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.af10;
import p.gw70;
import p.hvp0;
import p.ihc1;
import p.ird1;
import p.ixg;
import p.ixp0;
import p.lvx;
import p.lz6;
import p.mww0;
import p.nww0;
import p.rd10;
import p.td10;
import p.xfs0;
import p.xi20;
import p.yi20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@adt
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/spotify/encoremobile/facepile/FaceView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "radiusPx", "Lp/rih1;", "setCornerRadius", "(F)V", "p/af10", "src_main_java_com_spotify_encoremobile_facepile-facepile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FaceView extends AppCompatImageView {
    public static final /* synthetic */ int f = 0;
    public gw70 d;
    public Disposable e;

    /* JADX WARN: Multi-variable type inference failed */
    public FaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        lvx.t(this, Float.MAX_VALUE);
    }

    public static final void c(FaceView faceView, gw70 gw70Var, td10 td10Var, mww0 mww0Var) {
        Integer num = mww0Var.a;
        if (num != null) {
            td10Var = new td10(td10Var.a, td10Var.b, td10Var.c, new rd10(num.intValue()));
        }
        faceView.d(gw70Var, td10Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(gw70 gw70Var, td10 td10Var) {
        String str = td10Var.a;
        Drawable drawableH = td10Var.h(getContext());
        if (str == null || str.length() == 0) {
            setImageDrawable(drawableH);
        } else {
            ixg ixgVarB = gw70Var.b(Uri.parse(str));
            ixgVarB.e();
            ixgVarB.f(drawableH);
            ixgVarB.k(this, (ird1) null);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setVisibility(0);
    }

    public final void e(af10 af10Var, td10 td10Var) {
        g(af10Var.a, td10Var, af10Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(gw70 gw70Var, td10 td10Var, nww0 nww0Var) {
        String str;
        Single singleJust;
        gw70 gw70Var2 = this.d;
        if (gw70Var2 != null) {
            gw70Var2.d(this);
        }
        Disposable disposable = this.e;
        if (disposable != null) {
            disposable.dispose();
        }
        if (td10Var == null) {
            setVisibility(8);
            this.d = null;
            return;
        }
        if (nww0Var == null || !(((str = td10Var.a) == null || str.length() == 0) && td10Var.d == null)) {
            d(gw70Var, td10Var);
            this.d = gw70Var;
            return;
        }
        String str2 = td10Var.b;
        lz6 lz6Var = new lz6(this, gw70Var, td10Var, (byte) 2);
        if (ihc1.y0(str2)) {
            singleJust = Single.just(new mww0(null));
            singleJust.getClass();
        } else {
            singleJust = nww0Var.a.b(str2).map(xi20.f1).firstOrError().map(new hvp0(nww0Var, (byte) 20)).onErrorReturn(yi20.d1);
            singleJust.getClass();
        }
        this.e = singleJust.subscribeOn(nww0Var.b).observeOn(nww0Var.c).subscribe(new ixp0(lz6Var, (byte) 28), xfs0.Z0, nww0Var.d);
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(iMin, iMin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCornerRadius(float radiusPx) {
        lvx.t(this, radiusPx);
    }

    public FaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FaceView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FaceView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
