package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dqh {
    public final tuw a;
    public final Comment b;
    public final boolean c;
    public final boolean d;

    public dqh(tuw tuwVar, Comment comment, boolean z, boolean z2) {
        this.a = tuwVar;
        this.b = comment;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqh)) {
            return false;
        }
        dqh dqhVar = (dqh) obj;
        return this.a == dqhVar.a && u890.j(this.b, dqhVar.b) && this.c == dqhVar.c && this.d == dqhVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Comment comment = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (comment == null ? 0 : comment.hashCode())) * 31, 31, this.c);
    }
}
