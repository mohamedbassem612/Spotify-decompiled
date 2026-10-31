package p;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uyb1 extends LinearLayout {
    public final j2i a;
    public final i8h1 b;
    public final l6h1 c;
    public final gw70 d;
    public final idd1 e;
    public final ien0 f;
    public final idd1 g;
    public final FrameLayout h;
    public FrameLayout i;

    public uyb1(Activity activity, j2i j2iVar, i8h1 i8h1Var, l6h1 l6h1Var, gw70 gw70Var, op80 op80Var) {
        super(activity);
        this.a = j2iVar;
        this.b = i8h1Var;
        this.c = l6h1Var;
        this.d = gw70Var;
        this.e = new idd1(new tyb1(this, (byte) 0));
        ien0 ien0Var = new ien0(op80Var == null ? getFallbackInstrumentationEnvironment() : op80Var);
        this.f = ien0Var;
        this.g = new idd1(new tyb1(this, (byte) 1));
        this.h = (FrameLayout) activity.findViewById(2131427755);
        ViewGroup.LayoutParams h3nVar = new h3n(-1, -2);
        ((h3n) h3nVar).c = 81;
        setLayoutParams(h3nVar);
        setOrientation(1);
        setTranslationY(getResources().getDisplayMetrics().heightPixels);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, view.getResources().getDimensionPixelSize(2131167077)));
        view.setBackground(activity.getDrawable(2131233958));
        addView(view);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setClickable(true);
        frameLayout.setBackgroundColor(activity.getColor(2131101162));
        this.i = frameLayout;
        addView(frameLayout);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(2131427751);
        if (viewGroup != null) {
            BottomSheetBehavior.z(viewGroup).t(new jph(this, (byte) 8));
        }
        ComposeView composeView = new ComposeView(activity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        xhk1.f(composeView, ien0Var);
        composeView.setContent(new j2i(664949967, new syb1(this, (byte) 2), true));
        this.i.addView(composeView);
        post(new xfz0(this, (byte) 22));
    }

    private final op80 getFallbackInstrumentationEnvironment() {
        return (op80) this.e.getValue();
    }

    private final int getSheetMaxWidth() {
        return ((Number) this.g.getValue()).intValue();
    }

    public final void a(op80 op80Var) {
        if (op80Var == null) {
            op80Var = getFallbackInstrumentationEnvironment();
        }
        this.f.c(op80Var);
    }

    public final FrameLayout getContentContainer() {
        return this.i;
    }

    public final ien0 getInstrumentationEnvironment$src_main_java_com_spotify_connect_devicepickerpage_devicepickerpage() {
        return this.f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null && frameLayout.getPaddingBottom() > 0) {
            FrameLayout frameLayout2 = this.i;
            frameLayout2.setPadding(frameLayout2.getPaddingLeft(), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout.getPaddingBottom());
        }
        int size = View.MeasureSpec.getSize(i);
        int sheetMaxWidth = getSheetMaxWidth();
        if (size > sheetMaxWidth) {
            size = sheetMaxWidth;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public final void setContentContainer(FrameLayout frameLayout) {
        this.i = frameLayout;
    }
}
