package p;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class cfa0 {
    public final String a;

    public cfa0(String str) {
        str.getClass();
        this.a = str;
    }

    public static CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final void b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(d(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(d(it.next()));
                }
            }
        } catch (IOException e) {
            eg.f(e);
        }
    }

    public final String c(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        b(sb, it);
        return sb.toString();
    }
}
