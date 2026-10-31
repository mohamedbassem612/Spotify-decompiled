package p;

import android.content.ClipData;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f5e1 implements e4v {
    public final /* synthetic */ t4e1 a;
    public final /* synthetic */ u4e1 b;
    public final /* synthetic */ t4e1 c;
    public final /* synthetic */ t4e1 d;
    public final /* synthetic */ t4e1 e;
    public final /* synthetic */ t4e1 f;

    public f5e1(t4e1 t4e1Var, u4e1 u4e1Var, t4e1 t4e1Var2, t4e1 t4e1Var3, t4e1 t4e1Var4, t4e1 t4e1Var5) {
        this.a = t4e1Var;
        this.b = u4e1Var;
        this.c = t4e1Var2;
        this.d = t4e1Var3;
        this.e = t4e1Var4;
        this.f = t4e1Var5;
    }

    public final void I0(x3v x3vVar) {
        this.f.invoke(x3vVar);
    }

    public final void O0(x3v x3vVar) {
        this.c.invoke(x3vVar);
    }

    public final boolean Y0(x3v x3vVar) {
        String string;
        this.a.invoke(x3vVar);
        DragEvent dragEvent = x3vVar.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        z4e1 z4e1Var = this.b.b;
        z4e1Var.L1();
        z4e1Var.S0.b();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        s3o1.r(z4e1Var);
        if (string != null) {
            ggg1.m(z4e1Var.Q0, string, false, false, 30);
        }
        return true;
    }

    public final void a0(x3v x3vVar) {
        DragEvent dragEvent = x3vVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        this.d.invoke(new Offset((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L)));
    }

    public final void q(x3v x3vVar) {
        this.e.invoke(x3vVar);
    }

    public final void W0(x3v x3vVar) {
    }
}
