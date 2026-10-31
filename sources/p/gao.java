package p;

import androidx.compose.ui.graphics.Brush;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gao {
    public final Brush a;
    public final Function0 b;

    public gao(Brush brush, Function0 function0) {
        this.a = brush;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gao)) {
            return false;
        }
        gao gaoVar = (gao) obj;
        return u890.j(this.a, gaoVar.a) && u890.j(this.b, gaoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
