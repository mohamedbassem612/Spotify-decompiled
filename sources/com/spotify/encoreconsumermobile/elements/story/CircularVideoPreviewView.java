package com.spotify.encoreconsumermobile.elements.story;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.b8k1;
import p.c20;
import p.d9c1;
import p.eg;
import p.ek2;
import p.iac0;
import p.iu30;
import p.lo9;
import p.pvc;
import p.r4u;
import p.tlv;
import p.u890;
import p.xcg;
import p.ycg;
import p.zcg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/spotify/encoreconsumermobile/elements/story/CircularVideoPreviewView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/r4u;", "Lp/xcg;", "getDiffuser", "()Lp/r4u;", "Lp/ycg;", "viewContext", "Lp/rih1;", "setViewContext", "(Lp/ycg;)V", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "src_main_java_com_spotify_encoreconsumermobile_elements_story-story"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CircularVideoPreviewView extends FrameLayout implements tlv {
    public static final /* synthetic */ int h = 0;
    public final ImageView a;
    public final CircularVideoPreviewSpinner b;
    public final ViewStub c;
    public View d;
    public final r4u e;
    public ycg f;
    public iu30 g;

    public CircularVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = getDiffuser();
        View.inflate(context, 2131624332, this);
        CircleFrameLayout circleFrameLayoutN = b8k1.n(this, 2131428087);
        this.a = (ImageView) b8k1.n(this, 2131428089);
        this.c = (ViewStub) b8k1.n(this, 2131428086);
        this.b = b8k1.n(this, 2131428088);
        circleFrameLayoutN.setOnClickListener(new c20(this, (byte) 16));
    }

    private final r4u getDiffuser() {
        zcg zcgVar = zcg.b;
        return r4u.c(new r4u[]{r4u.d(new pvc((byte) 1), r4u.a(new lo9((Object) this, (byte) 16)))});
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void f(xcg xcgVar) {
        String str = xcgVar.a;
        ycg ycgVar = this.f;
        if (ycgVar == null) {
            u890.C("viewContext");
            throw null;
        }
        d9c1 d9c1Var = ycgVar.a;
        if (d9c1Var.e == null) {
            eg.m("loadContent called before onContentViewInflated");
            return;
        }
        if (str.length() == 0) {
            d9c1Var.q();
        } else {
            d9c1Var.g = str;
            d9c1Var.a();
        }
        this.e.e(xcgVar);
    }

    public View getContentView() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        u890.C("contentView");
        throw null;
    }

    public final void n(iu30 iu30Var) {
        this.g = iu30Var;
    }

    public final void setViewContext(ycg viewContext) {
        d9c1 d9c1Var = viewContext.a;
        ek2 ek2Var = d9c1Var.d;
        iac0 iac0Var = d9c1Var.c;
        this.f = viewContext;
        if (this.d == null) {
            ViewStub viewStub = this.c;
            viewStub.setLayoutResource(2131626206);
            this.d = viewStub.inflate();
            d9c1Var.q();
            iac0Var.getLifecycle().d(ek2Var);
            iac0Var.getLifecycle().a(ek2Var);
            d9c1Var.e = this;
        }
    }

    public CircularVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CircularVideoPreviewView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CircularVideoPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
