package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sf91 implements rij0 {
    public final ArrayList a;

    public sf91(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((rf91) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((rf91) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((rf91) arrayList.get(i)).b;
            }
        }
        dm5.m(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sf91.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sf91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
