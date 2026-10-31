package p;

import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.corex.readalong.v1.proto.ColourData;
import com.spotify.corex.readalong.v1.proto.TranscriptExcerpt;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hdn1 implements Function, Predicate {
    public static final hdn1 c;
    public static final hdn1 d;
    public static final hdn1 e;
    public static final hdn1 f;
    public final /* synthetic */ byte a;
    public final String b;

    static {
        byte b = 0;
        c = new hdn1("TINK", b);
        d = new hdn1("CRUNCHY", b);
        e = new hdn1("LEGACY", b);
        f = new hdn1("NO_PREFIX", b);
    }

    public hdn1(String str) {
        this.a = (byte) 13;
        this.b = l1d.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String b() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static boolean f() {
        return u890.j(Environment.getExternalStorageState(), "mounted");
    }

    public static String i(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = gvg.h(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return f4i1.f(str, " : ", str2);
    }

    public String a() {
        bma1 bma1Var = t6b1.t;
        return f4i1.f("Android/data/", this.b, "/files/spotifycache");
    }

    public Object apply(Object obj) {
        Object objInvoke;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                myv0 myv0Var = ((uv00) obj).a(myv0.class, str).b;
                return new wg7(myv0Var != null ? myv0Var.a : "", myv0Var != null ? myv0Var.c.b : "");
            case 2:
                j78 j78Var = (j78) obj;
                String str2 = j78Var.a;
                String str3 = str2 == null ? "" : str2;
                String str4 = j78Var.b;
                String str5 = str4 == null ? "" : str4;
                String str6 = j78Var.c;
                String str7 = str6 == null ? "" : str6;
                String str8 = j78Var.d;
                String str9 = j78Var.e;
                String str10 = j78Var.f;
                String str11 = (str10 == null || ihc1.y0(str10)) ? null : str10;
                String str12 = j78Var.g;
                return new f78(this.b, str3, str5, str7, str8, str11, (str12 == null || ihc1.y0(str12)) ? null : str12, str9);
            case 3:
                f7h f7hVar = (f7h) ((Map) obj).get(str);
                return Boolean.valueOf(f7hVar != null ? f7hVar.a : false);
            case 4:
            case 5:
            case 6:
            case 8:
            default:
                ly21 ly21Var = (py21) obj;
                bek1 bek1Var = new bek1(str, (byte) 4);
                if (ly21Var instanceof ly21) {
                    objInvoke = Single.error(new Exception(l1d.m("Failed to set description: ", ly21Var.a.b())));
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = bek1Var.invoke(((oy21) ly21Var).a);
                }
                return (SingleSource) objInvoke;
            case 7:
                return new e4a1(str, true);
            case 9:
                Logger.e((Throwable) obj, "Error on screenshotEventSource for feature ".concat(str), new Object[0]);
                return Observable.empty();
            case 10:
                return ((yze1) obj).a(str);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                sy21 sy21Var = (sy21) obj;
                TranscriptExcerpt transcriptExcerpt = (TranscriptExcerpt) sy21Var.b;
                ry21 ry21Var = sy21Var.a;
                if (!ry21Var.Q0 || transcriptExcerpt == null) {
                    return Single.error(new Throwable(f4i1.c(ry21Var.d, "Failed to fetch excerpts: ")));
                }
                String strS = transcriptExcerpt.s();
                String strQ = transcriptExcerpt.q();
                String language = transcriptExcerpt.getLanguage();
                h290<TranscriptExcerpt.Sentence> h290VarR = transcriptExcerpt.r();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
                for (TranscriptExcerpt.Sentence sentence : h290VarR) {
                    arrayList.add(new l561(sentence.o(), sentence.n()));
                }
                ColourData colourDataN = transcriptExcerpt.n();
                return Single.just(new hag1(this.b, strS, strQ, language, arrayList, new m8h((int) (((long) colourDataN.n()) | 4278190080L), (int) (((long) colourDataN.q()) | 4278190080L), (int) (4278190080L | ((long) colourDataN.p()))), transcriptExcerpt.o(), transcriptExcerpt.p()));
        }
    }

    public String c() {
        return "Android/data/".concat(this.b).concat("/cache");
    }

    public String d() {
        return "Android/data/".concat(this.b).concat("/files");
    }

    public String e() {
        return f4i1.f("Android/data/", this.b, "/cache");
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            i(this.b, str, objArr);
        }
    }

    public void h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            i(this.b, str, objArr);
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 5:
                return u890.j(str, ((PlayerState) obj).contextUri());
            default:
                return u890.j((String) ((mmr0) obj).a, str);
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hdn1(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public /* synthetic */ hdn1(byte b, Object obj, String str) {
        this.a = b;
        this.b = str;
    }

    public hdn1(ajg ajgVar) {
        this.a = (byte) 8;
        this.b = ((zym0) ajgVar).a;
    }
}
