package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class agk extends nln {
    public final ArrayList e;
    public final qjk f;
    public final String g;
    public final String h;

    public agk(ArrayList arrayList, qjk qjkVar, String str, String str2) {
        super((byte) 4);
        this.e = arrayList;
        this.f = qjkVar;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agk) {
            agk agkVar = (agk) obj;
            if (this.e.equals(agkVar.e) && this.f == agkVar.f && this.g.equals(agkVar.g) && u890.j(this.h, agkVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = cy30.d((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g);
        String str = this.h;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
