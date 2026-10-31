package androidx.compose.ui.text.style;

import java.util.ArrayList;
import p.f4i1;
import p.gvg;
import p.iu30;
import p.p5d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class TextDecoration {
    public static final TextDecoration b = new TextDecoration(0);
    public static final TextDecoration c = new TextDecoration(1);
    public static final TextDecoration d = new TextDecoration(2);
    public final int a;

    public TextDecoration(int i) {
        this.a = i;
    }

    public final boolean a(TextDecoration textDecoration) {
        int i = textDecoration.a;
        int i2 = this.a;
        return (i | i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextDecoration) {
            return this.a == ((TextDecoration) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        return arrayList.size() == 1 ? gvg.g(arrayList.get(0), "TextDecoration.") : f4i1.f("TextDecoration[", p5d0.b(arrayList, ", ", (iu30) null, 62), "]");
    }
}
