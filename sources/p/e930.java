package p;

import androidx.compose.ui.text.font.FontFamily;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e930 {
    public final FontFamily a;
    public final u7h b;

    public e930(FontFamily fontFamily, u7h u7hVar) {
        this.a = fontFamily;
        this.b = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e930)) {
            return false;
        }
        e930 e930Var = (e930) obj;
        return u890.j(this.a, e930Var.a) && u890.j(this.b, e930Var.b);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.a;
        int iHashCode = (fontFamily == null ? 0 : fontFamily.hashCode()) * 31;
        u7h u7hVar = this.b;
        return iHashCode + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
