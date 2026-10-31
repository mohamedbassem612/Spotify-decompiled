package p;

import android.graphics.Canvas;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m890 implements lpb1 {
    public final /* synthetic */ byte a;
    public float b;
    public float c;
    public final Object d;

    public m890(StateListAnimatorButton stateListAnimatorButton) {
        this.a = (byte) 1;
        this.d = stateListAnimatorButton;
        this.b = 1.0f;
        this.c = 1.0f;
    }

    public static m890 g(float f) {
        return h(0.0f, f) ? new m890(0.0f, 0.0f, new j890(0.0f)) : new m890(0.0f, f, new ir20((byte) 1, f));
    }

    public static boolean h(float f, float f2) {
        return ((double) Math.abs(f - f2)) < 1.0E-6d;
    }

    public void a(float f) {
        this.b = f;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.d;
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorButton.postInvalidateOnAnimation();
    }

    public void b(Canvas canvas) {
        canvas.save();
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.d;
        canvas.translate(stateListAnimatorButton.getWidth() / 2.0f, stateListAnimatorButton.getHeight() / 2.0f);
        canvas.scale(this.b, this.c);
        canvas.translate((-stateListAnimatorButton.getWidth()) / 2.0f, (-stateListAnimatorButton.getHeight()) / 2.0f);
        StateListAnimatorButton.b(stateListAnimatorButton, canvas);
        canvas.restore();
    }

    public float c() {
        return this.b;
    }

    public void d(float f) {
        this.c = f;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.d;
        WeakHashMap weakHashMap = b8k1.a;
        stateListAnimatorButton.postInvalidateOnAnimation();
    }

    public float e() {
        return this.c;
    }

    public m890 f() {
        float f = this.b;
        float f2 = this.c;
        return h(f, f2) ? this : new m890(f, f2, new ro30(this, new m890(f, f2, new l7m0(this, (byte) 24))));
    }

    public float i() {
        return this.c;
    }

    public float j() {
        return this.b;
    }

    public m890 k(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (!h(f2, f3)) {
            return h(f, 0.0f) ? new m890(f, f, new j890(f)) : new m890(f, 0.0f, new ro30(this, new m890(f, 0.0f, new k890(f2, f3, f))));
        }
        hhg1.n("Can't remap from an empty domain");
        return null;
    }

    public float l(float f) {
        float f2 = this.b;
        float f3 = this.c;
        return h(f2, f3) ? f2 : ((l890) this.d).q(f2, f3, f);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return String.format(Locale.US, "IntervalTransformer: %s", (l890) this.d);
            default:
                return super.toString();
        }
    }

    public m890(float f, float f2, l890 l890Var) {
        this.a = (byte) 0;
        this.b = f;
        this.c = f2;
        this.d = l890Var;
    }
}
