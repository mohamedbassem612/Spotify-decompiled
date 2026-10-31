package p;

import com.spotify.wrapped.v1.proto.StoryCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c8m1 implements w8l1 {
    public final String a;
    public final vq71 b;
    public final StoryCard c;
    public final String d;
    public final r160 e;
    public final z0i f;

    public c8m1(String str, vq71 vq71Var, StoryCard storyCard, String str2, r160 r160Var, z0i z0iVar) {
        this.a = str;
        this.b = vq71Var;
        this.c = storyCard;
        this.d = str2;
        this.e = r160Var;
        this.f = z0iVar;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8m1)) {
            return false;
        }
        c8m1 c8m1Var = (c8m1) obj;
        return this.a.equals(c8m1Var.a) && this.b.equals(c8m1Var.b) && this.c.equals(c8m1Var.c) && this.d.equals(c8m1Var.d) && u890.j(this.e, c8m1Var.e) && u890.j(this.f, c8m1Var.f);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.a;
    }

    @Override // p.w8l1
    public final vq71 h() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        r160 r160Var = this.e;
        int iHashCode = (iD + (r160Var == null ? 0 : r160Var.hashCode())) * 31;
        z0i z0iVar = this.f;
        return iHashCode + (z0iVar != null ? z0iVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String strF;
        vq71 vq71Var = this.b;
        String strP = cy30.p("SharedAudio(groupId=", vq71Var.a, ", audioUrl=", vq71Var.b, ", )");
        String id = this.c.getId();
        String str2 = null;
        r160 r160Var = this.e;
        if (r160Var != null) {
            boolean z = r160Var.a != null;
            str = "HeaderOverrides(hasBody=" + z + ", tintColor=" + r160Var.b + ", hideBody=" + r160Var.c + ", buttonAppearance=" + r160Var.d + ")";
        } else {
            str = null;
        }
        btb btbVar = this.f;
        if (btbVar != null) {
            if (btbVar instanceof btb) {
                btb btbVar2 = btbVar;
                boolean z2 = btbVar2.a != null;
                boolean z3 = btbVar2.b != null;
                int size = btbVar2.c.size();
                StringBuilder sb = new StringBuilder("BottomBar(hasProgress=");
                sb.append(z2);
                sb.append(", hasNudge=");
                sb.append(z3);
                sb.append(", actionItemsCount=");
                strF = gvg.j(sb, size, ")");
            } else {
                strF = f4i1.f("ComponentModel[type=", rc11.a.b(btbVar.getClass()).r(), "]");
            }
            str2 = strF;
        }
        StringBuilder sbN = gvg.n("WrappedComponent(itemId='", this.a, "', sharedAudioInfo=", strP, ", storyCard=");
        bb00.j(sbN, id, ", navigateUri=", this.d, ", headerOverrides=");
        return rjx.o(sbN, str, ", bottomComponent=", str2, ")");
    }
}
