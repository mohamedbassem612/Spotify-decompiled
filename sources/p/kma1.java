package p;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kma1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SharedPreferences b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kma1(SharedPreferences sharedPreferences, String str, byte b) {
        super(0);
        this.a = b;
        this.b = sharedPreferences;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        String str = this.c;
        SharedPreferences sharedPreferences = this.b;
        switch (b) {
            case 0:
                String string = sharedPreferences.getString(str, "");
                string.getClass();
                return string;
            default:
                Set<String> stringSet = sharedPreferences.getStringSet(str, w7x.a);
                stringSet.getClass();
                return stringSet;
        }
    }
}
