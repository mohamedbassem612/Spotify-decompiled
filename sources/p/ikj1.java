package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.functions.Function;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ikj1 implements Function {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public ikj1(cfo1 cfo1Var) {
        this.e = Optional.empty();
        Optional.empty();
        this.a = cfo1Var.a;
        this.b = cfo1Var.b;
        this.c = cfo1Var.c;
        this.d = cfo1Var.d;
        this.e = cfo1Var.e;
        this.f = cfo1Var.f;
    }

    public cfo1 a() {
        String str;
        n02 n02Var;
        v311 v311Var;
        String str2 = (String) this.a;
        if (str2 != null && (str = (String) this.b) != null && (n02Var = (n02) this.c) != null && (v311Var = (v311) this.d) != null) {
            return new cfo1(str2, str, n02Var, v311Var, (Optional) this.e, (Optional) this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.a) == null) {
            sb.append(" meetingCode");
        }
        if (((String) this.b) == null) {
            sb.append(" meetingUrl");
        }
        if (((n02) this.c) == null) {
            sb.append(" meetingStatus");
        }
        if (((v311) this.d) == null) {
            sb.append(" recordingInfo");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public Object apply(Object obj) {
        SearchEndpointRequest searchEndpointRequest = (SearchEndpointRequest) obj;
        tp7 tp7Var = (tp7) this.a;
        PlayIntent playIntent = (PlayIntent) this.b;
        VoiceAssistantLoggingContext voiceAssistantLoggingContext = new VoiceAssistantLoggingContext((String) this.c, playIntent.getUri().toString(), null, (String) this.d);
        return ((aoa1) tp7Var.k).a(playIntent.getUri(), searchEndpointRequest, (zle1) this.e, (t45) this.f, voiceAssistantLoggingContext).p(new bih1(tp7Var, voiceAssistantLoggingContext, (byte) 13));
    }

    public void b(hug hugVar) {
        this.f = Optional.of(hugVar);
    }

    public void c(svg svgVar) {
        this.e = Optional.of(svgVar);
    }

    public void d(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("Null meetingCode");
        }
    }

    public void e(n02 n02Var) {
        if (n02Var != null) {
            this.c = n02Var;
        } else {
            bhn0.i("Null meetingStatus");
        }
    }

    public void f(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null meetingUrl");
        }
    }

    public void g(v311 v311Var) {
        if (v311Var != null) {
            this.d = v311Var;
        } else {
            bhn0.i("Null recordingInfo");
        }
    }

    public /* synthetic */ ikj1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public ikj1() {
        this.e = Optional.empty();
        this.f = Optional.empty();
    }
}
