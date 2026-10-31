package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import com.spotify.widget.widget.WidgetPickerService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u8g {
    public final Context a;

    public f9g a() {
        Context context = this.a;
        String string = context.getString(2131955759);
        String string2 = context.getString(2131955672);
        String string3 = context.getString(2131955675);
        z8g z8gVar = z8g.a;
        return new f9g(string, string2, z8gVar, null, new e9g(string3, z8gVar), 8);
    }

    public f9g b() {
        Context context = this.a;
        String string = context.getString(2131955759);
        String string2 = context.getString(2131955674);
        e9g e9gVar = new e9g(context.getString(2131955677), c9g.a);
        String string3 = context.getString(R.string.cancel);
        z8g z8gVar = z8g.a;
        return new f9g(string, string2, z8gVar, e9gVar, new e9g(string3, z8gVar));
    }

    public f9g c() {
        Context context = this.a;
        String string = context.getString(2131955759);
        String string2 = context.getString(2131955673);
        e9g e9gVar = new e9g(context.getString(2131955676), c9g.a);
        String string3 = context.getString(2131955675);
        a9g a9gVar = a9g.a;
        return new f9g(string, string2, a9gVar, e9gVar, new e9g(string3, a9gVar));
    }

    public Intent d() {
        Intent intent = new Intent(this.a, (Class<?>) WidgetPickerService.class);
        intent.setAction("com.spotify.widget.widget.PROMO_ADD_NEW_WIDGET");
        return intent;
    }
}
