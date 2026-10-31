package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dwh0 {
    public static final dwh0 c = new dwh0(new Bundle(), null);
    public final Bundle a;
    public List b;

    public dwh0(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwh0)) {
            return false;
        }
        dwh0 dwh0Var = (dwh0) obj;
        a();
        dwh0Var.a();
        return this.b.equals(dwh0Var.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
