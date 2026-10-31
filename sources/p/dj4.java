package p;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dj4 implements a930 {
    public final ja30 a;
    public final FontWeight b;
    public boolean c;
    public Typeface d;
    public final File e;

    public dj4(File file, FontWeight fontWeight, ja30 ja30Var) {
        this.a = ja30Var;
        this.b = fontWeight;
        this.e = file;
        this.d = Build.VERSION.SDK_INT >= 26 ? no80.q(file, null, ja30Var) : Typeface.createFromFile(file);
    }

    @Override // p.a930
    public final int a() {
        return 0;
    }

    @Override // p.a930
    public final int b() {
        return 0;
    }

    @Override // p.a930
    public final FontWeight getWeight() {
        return this.b;
    }

    public final String toString() {
        String strA = FontStyle.a(0);
        StringBuilder sb = new StringBuilder("Font(file=");
        sb.append(this.e);
        sb.append(", weight=");
        sb.append(this.b);
        sb.append(", style=");
        return l1d.n(strA, ")", sb);
    }
}
