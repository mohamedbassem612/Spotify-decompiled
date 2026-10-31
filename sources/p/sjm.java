package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PreparePlayOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sjm {
    public final String a;
    public final Context b;
    public final PreparePlayOptions c;
    public final tv80 d;

    public sjm(String str, Context context, PreparePlayOptions preparePlayOptions, tv80 tv80Var) {
        this.a = str;
        this.b = context;
        this.c = preparePlayOptions;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjm)) {
            return false;
        }
        sjm sjmVar = (sjm) obj;
        return this.a.equals(sjmVar.a) && this.b.equals(sjmVar.b) && u890.j(this.c, sjmVar.c) && this.d.equals(sjmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        PreparePlayOptions preparePlayOptions = this.c;
        return this.d.hashCode() + ((iHashCode + (preparePlayOptions == null ? 0 : preparePlayOptions.hashCode())) * 31);
    }
}
