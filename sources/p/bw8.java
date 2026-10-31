package p;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bw8 {
    public final Context a;

    public static int a(List list, m9m m9mVar) {
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((ws01) it.next()).a == m9mVar) {
                    return i;
                }
                i++;
            }
            return -1;
        } catch (NoSuchElementException unused) {
            n57.e("Could not find position for chip with contentTag: " + m9mVar);
            return -1;
        }
    }

    public static int b(List list, m9m m9mVar, br01 br01Var) {
        try {
            for (Object obj : list) {
                if (((ws01) obj).a == m9mVar) {
                    Iterator it = ((ws01) obj).b.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((br01) it.next()) == br01Var) {
                            return i;
                        }
                        i++;
                    }
                    return -1;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (NoSuchElementException unused) {
            n57.e("Could not find position for chip with contentTag: " + m9mVar + ", and source: " + br01Var);
            return -1;
        }
    }

    public static br01 c(oix oixVar) {
        String str = oixVar.a;
        if (u890.j(str, "played")) {
            return br01.d;
        }
        if (u890.j(str, "saved")) {
            return br01.b;
        }
        n57.e("Unknown content source: " + str);
        return null;
    }

    public static m9m d(nix nixVar) {
        String str = nixVar.a;
        if (u890.j(str, "music")) {
            return m9m.b;
        }
        if (u890.j(str, "podcasts")) {
            return m9m.c;
        }
        if (u890.j(str, "audiobooks")) {
            return m9m.d;
        }
        n57.e("Unknown content tag: " + str);
        return null;
    }
}
