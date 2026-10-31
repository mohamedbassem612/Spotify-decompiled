package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z610 {
    public final String a;
    public final Context b;
    public final Map c;
    public final PreparePlayOptions d;
    public final PlayOrigin e;
    public final LoggingParams f;

    public /* synthetic */ z610(String str, Context context, Map map, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams, int i) {
        this(str, (i & 2) != 0 ? null : context, (i & 4) != 0 ? b7x.a : map, (i & 8) != 0 ? null : preparePlayOptions, playOrigin, (i & 32) != 0 ? null : loggingParams);
    }

    public static z610 b(z610 z610Var, PlayOrigin playOrigin) {
        return new z610(z610Var.a, z610Var.b, z610Var.c, z610Var.d, playOrigin, z610Var.f);
    }

    public final Context a() {
        return this.b;
    }

    public final LoggingParams c() {
        return this.f;
    }

    public final Map d() {
        return this.c;
    }

    public final PlayOrigin e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z610)) {
            return false;
        }
        z610 z610Var = (z610) obj;
        return u890.j(this.a, z610Var.a) && u890.j(this.b, z610Var.b) && u890.j(this.c, z610Var.c) && u890.j(this.d, z610Var.d) && u890.j(this.e, z610Var.e) && u890.j(this.f, z610Var.f);
    }

    public final PreparePlayOptions f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Context context = this.b;
        int iE = cy30.e((iHashCode + (context == null ? 0 : context.hashCode())) * 31, 31, this.c);
        PreparePlayOptions preparePlayOptions = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iE + (preparePlayOptions == null ? 0 : preparePlayOptions.hashCode())) * 31)) * 31;
        LoggingParams loggingParams = this.f;
        return iHashCode2 + (loggingParams != null ? loggingParams.hashCode() : 0);
    }

    public z610(String str, Context context, Map map, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        this.a = str;
        this.b = context;
        this.c = map;
        this.d = preparePlayOptions;
        this.e = playOrigin;
        this.f = loggingParams;
    }
}
