package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wcm {
    public final String a;
    public final String b;
    public final String c;
    public final ucm d;
    public final Function0 e;
    public final Function0 f;
    public final boolean g;
    public final String h;
    public final pcm i;
    public final String j;

    public /* synthetic */ wcm(String str, String str2, String str3, ucm ucmVar, Function0 function0, Function0 function1, boolean z, String str4, String str5, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? rcm.a : ucmVar, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? aok.c1 : function1, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? ncm.a : ocm.a, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : str5);
    }

    public static wcm a(wcm wcmVar, Function0 function0, nx2 nx2Var, boolean z, String str, int i) {
        String str2 = wcmVar.a;
        String str3 = wcmVar.b;
        String str4 = wcmVar.c;
        ucm ucmVar = wcmVar.d;
        if ((i & 16) != 0) {
            function0 = wcmVar.e;
        }
        Function0 function1 = function0;
        if ((i & 32) != 0) {
            nx2Var = wcmVar.f;
        }
        nx2 nx2Var2 = nx2Var;
        if ((i & 64) != 0) {
            z = wcmVar.g;
        }
        boolean z2 = z;
        String str5 = wcmVar.h;
        pcm pcmVar = wcmVar.i;
        String str6 = (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? wcmVar.j : str;
        wcmVar.getClass();
        return new wcm(str2, str3, str4, ucmVar, function1, (Function0) nx2Var2, z2, str5, pcmVar, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcm)) {
            return false;
        }
        wcm wcmVar = (wcm) obj;
        return u890.j(this.a, wcmVar.a) && u890.j(this.b, wcmVar.b) && u890.j(this.d, wcmVar.d) && this.g == wcmVar.g && u890.j(this.h, wcmVar.h) && u890.j(this.i, wcmVar.i) && u890.j(this.j, wcmVar.j) && u890.j(this.f.invoke(), wcmVar.f.invoke());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.g);
        String str2 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((iG + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        String str3 = this.j;
        return ((tgm) this.f.invoke()).hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public wcm(String str, String str2, String str3, ucm ucmVar, Function0 function0, Function0 function1, boolean z, String str4, pcm pcmVar, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ucmVar;
        this.e = function0;
        this.f = function1;
        this.g = z;
        this.h = str4;
        this.i = pcmVar;
        this.j = str5;
    }
}
