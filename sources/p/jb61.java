package p;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jb61 {
    public final ib61 a;

    public jb61(ArrayList arrayList, g661 g661Var, t2d t2dVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new hb61(arrayList, g661Var, t2dVar);
        } else {
            this.a = new gb61(arrayList, g661Var, t2dVar);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((utq0) it.next()).a.c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jb61)) {
            return false;
        }
        return this.a.equals(((jb61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
