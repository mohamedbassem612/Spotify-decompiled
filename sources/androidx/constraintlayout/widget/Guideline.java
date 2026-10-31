package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p.qhl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        qhl qhlVar = (qhl) getLayoutParams();
        if (this.a && qhlVar.a == i) {
            return;
        }
        qhlVar.a = i;
        setLayoutParams(qhlVar);
    }

    public void setGuidelineEnd(int i) {
        qhl qhlVar = (qhl) getLayoutParams();
        if (this.a && qhlVar.b == i) {
            return;
        }
        qhlVar.b = i;
        setLayoutParams(qhlVar);
    }

    public void setGuidelinePercent(float f) {
        qhl qhlVar = (qhl) getLayoutParams();
        if (this.a && qhlVar.c == f) {
            return;
        }
        qhlVar.c = f;
        setLayoutParams(qhlVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }
}
