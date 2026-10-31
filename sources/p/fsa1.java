package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fsa1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsa1(bs0 bs0Var, byte b) {
        super(4);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                return new FlowableSingleSingle(new FlowableTake((FlowableMap) bs0Var.b)).flatMapCompletable(new esa1(bs0Var, (csa1) obj3, (byte) 0));
            default:
                Context context = (Context) obj2;
                iu30 iu30Var = (iu30) obj4;
                if (!((iy4) bs0Var.e).b()) {
                    EncoreButton encoreButton = new EncoreButton(context, (AttributeSet) null, 2130969239, (eix) null, 10, (DefaultConstructorMarker) null);
                    encoreButton.setContentDescription(context.getResources().getString(2131959261));
                    encoreButton.setIconResource(2131232366);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167033);
                    encoreButton.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    encoreButton.setOnClickListener(new zl51(iu30Var, (byte) 10));
                    return new vh(encoreButton, context);
                }
                Resources resources = context.getResources();
                float dimensionPixelSize2 = resources.getDimensionPixelSize(2131166773);
                float dimensionPixelSize3 = resources.getDimensionPixelSize(2131166772);
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                appCompatTextView.setImportantForAccessibility(2);
                et61 et61Var = new et61(iu30Var, (byte) 19);
                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(2131166771);
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
                appCompatTextView.setGravity(8388629);
                Typeface typefaceB = qx21.b(context, 2131296274);
                if (typefaceB != null) {
                    appCompatTextView.setTypeface(typefaceB);
                }
                appCompatTextView.setLineSpacing(0.0f, 0.75f);
                appCompatTextView.setIncludeFontPadding(false);
                appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                frameLayout.setMinimumWidth(dimensionPixelSize4);
                frameLayout.setMinimumHeight(dimensionPixelSize4);
                frameLayout.setBackgroundResource(typedValue.resourceId);
                frameLayout.setClickable(true);
                frameLayout.setFocusable(true);
                frameLayout.setContentDescription(context.getResources().getString(2131959261));
                frameLayout.addView(appCompatTextView);
                frameLayout.setOnClickListener(new wa21(et61Var, frameLayout, (byte) 15));
                return new gsa1(frameLayout, appCompatTextView, dimensionPixelSize2, dimensionPixelSize3, context);
        }
    }
}
