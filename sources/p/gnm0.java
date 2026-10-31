package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gnm0 implements View.OnClickListener {
    public final hnm0 a;
    public final int b;
    public final int c;

    public gnm0(Context context, hnm0 hnm0Var, XmlResourceParser xmlResourceParser) {
        this.b = -1;
        this.c = 17;
        this.a = hnm0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.n);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 0) {
                this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void a(MotionLayout motionLayout, int i, hnm0 hnm0Var) {
        boolean z;
        View viewFindViewById;
        int i2 = this.b;
        ?? r8 = motionLayout;
        if (i2 != -1) {
            viewFindViewById = motionLayout.findViewById(i2);
        }
        if (r8 == 0) {
            r8 = viewFindViewById;
            return;
        }
        int i3 = hnm0Var.d;
        int i4 = hnm0Var.c;
        if (i3 == -1) {
            r8 = viewFindViewById;
            r8.setOnClickListener(this);
            return;
        }
        int i5 = this.c;
        int i6 = i5 & 1;
        boolean z2 = false;
        if (i6 == 0 || i != i3) {
            r8 = viewFindViewById;
            z = false;
        } else {
            z = true;
        }
        boolean z3 = (i6 != 0 && i == i3) | z | ((i5 & SemanticState.Hidden) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
        if ((i5 & SemanticState.Obscured) != 0 && i == i4) {
            z2 = true;
        }
        if (z3 || z2) {
            r8.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hnm0 hnm0Var = this.a;
        inm0 inm0Var = hnm0Var.j;
        MotionLayout motionLayout = inm0Var.a;
        if (motionLayout.c1) {
            if (hnm0Var.d == -1) {
                int currentState = motionLayout.getCurrentState();
                if (currentState == -1) {
                    motionLayout.M(hnm0Var.c);
                    return;
                }
                hnm0 hnm0Var2 = new hnm0(inm0Var, hnm0Var);
                hnm0Var2.d = currentState;
                hnm0Var2.c = hnm0Var.c;
                motionLayout.setTransition(hnm0Var2);
                motionLayout.y(1.0f);
                motionLayout.O1 = null;
                return;
            }
            hnm0 hnm0Var3 = inm0Var.c;
            int i = this.c;
            int i2 = i & 1;
            boolean z = false;
            boolean z2 = true;
            boolean z3 = (i2 == 0 && (i & SemanticState.Hidden) == 0) ? false : true;
            int i3 = i & 16;
            if (i3 == 0 && (i & SemanticState.Obscured) == 0) {
                z2 = false;
            }
            if (z3 && z2) {
                if (hnm0Var3 != hnm0Var) {
                    motionLayout.setTransition(hnm0Var);
                }
                if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                    z2 = false;
                    z = z3;
                }
            } else {
                z = z3;
            }
            if (hnm0Var != hnm0Var3) {
                int i4 = hnm0Var.c;
                int i5 = hnm0Var.d;
                int i6 = motionLayout.Y0;
                if (i5 == -1) {
                    if (i6 == i4) {
                        return;
                    }
                } else if (i6 != i5 && i6 != i4) {
                    return;
                }
            }
            if (z && i2 != 0) {
                motionLayout.setTransition(hnm0Var);
                motionLayout.y(1.0f);
                motionLayout.O1 = null;
                return;
            }
            if (z2 && i3 != 0) {
                motionLayout.setTransition(hnm0Var);
                motionLayout.y(0.0f);
            } else if (z && (i & SemanticState.Hidden) != 0) {
                motionLayout.setTransition(hnm0Var);
                motionLayout.setProgress(1.0f);
            } else {
                if (!z2 || (i & SemanticState.Obscured) == 0) {
                    return;
                }
                motionLayout.setTransition(hnm0Var);
                motionLayout.setProgress(0.0f);
            }
        }
    }
}
