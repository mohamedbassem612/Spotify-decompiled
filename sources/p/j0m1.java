package p;

import com.spotify.messages.WorkoutCuePipelineEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j0m1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ruc0 a;

    public j0m1(ruc0 ruc0Var) {
        this.a = ruc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l3t0 l3t0Var;
        String str;
        String str2;
        String str3;
        t1m1 t1m1Var;
        vzl1 vzl1Var = (vzl1) obj;
        ruc0 ruc0Var = this.a;
        int i = vzl1Var.a;
        pb00 pb00Var = (pb00) ruc0Var.b;
        Boolean bool = null;
        if (i == 1) {
            v1m1 v1m1VarG = ((vi11) pb00Var.b).G(vzl1Var.j);
            if (v1m1VarG != null && (t1m1Var = v1m1VarG.a) != null) {
                bool = t1m1Var.f;
            }
            zhq0 zhq0Var = (zhq0) pb00Var.c;
            String str4 = (String) pb00Var.d;
            long jE = ((yqg) zhq0Var.b).e();
            zhq0Var.c = new m3t0(vzl1Var, str4, bool, jE, jE);
        } else {
            String str5 = vzl1Var.b;
            veo veoVar = vzl1Var.k;
            zhq0 zhq0Var2 = (zhq0) pb00Var.c;
            m3t0 m3t0Var = (m3t0) zhq0Var2.c;
            if (m3t0Var != null && ((vzl1) m3t0Var.d).b.equals(str5)) {
                long jE2 = ((yqg) zhq0Var2.b).e();
                l3t0Var = new l3t0((vzl1) m3t0Var.d, m3t0Var.a, (Boolean) m3t0Var.e, (int) (jE2 - m3t0Var.c), (int) (jE2 - m3t0Var.b));
                m3t0Var.c = jE2;
                int iC = l1d.C(i);
                if (iC != 4 && iC != 7) {
                    switch (iC) {
                        case 9:
                        case 10:
                        case 11:
                            zhq0Var2.c = null;
                            break;
                    }
                } else {
                    zhq0Var2.c = null;
                }
            } else {
                l3t0Var = null;
            }
            if (l3t0Var != null) {
                vzl1 vzl1Var2 = l3t0Var.a;
                lyl1 lyl1VarN = WorkoutCuePipelineEvent.n();
                lyl1VarN.z(vzl1Var2.b);
                switch (i) {
                    case 1:
                        str = "pipeline_started";
                        break;
                    case 2:
                        str = "cache_hit";
                        break;
                    case 3:
                        str = "cache_cue_miss";
                        break;
                    case 4:
                        str = "tts_resolved";
                        break;
                    case 5:
                        str = "tts_failed";
                        break;
                    case 6:
                        str = "duck_completed";
                        break;
                    case 7:
                        str = "download_completed";
                        break;
                    case 8:
                        str = "download_failed";
                        break;
                    case 9:
                        str = "audio_finished";
                        break;
                    case 10:
                        str = "audio_failed";
                        break;
                    case 11:
                        str = "unduck_completed";
                        break;
                    case 12:
                        str = "pipeline_cancelled";
                        break;
                    default:
                        throw null;
                }
                lyl1VarN.C(str);
                lyl1VarN.D(l3t0Var.d);
                lyl1VarN.y(l3t0Var.e);
                lyl1VarN.t(vzl1Var2.c);
                lyl1VarN.H(vzl1Var2.d);
                lyl1VarN.s(vzl1Var2.e);
                lyl1VarN.A(vzl1Var2.f);
                lyl1VarN.F(vzl1Var2.g);
                lyl1VarN.G(vzl1Var2.h);
                lyl1VarN.E(vzl1Var2.i);
                lyl1VarN.B(vzl1Var2.j);
                int i2 = veoVar.a;
                if (i2 != 0) {
                    switch (i2) {
                        case 1:
                            str3 = "network_timeout";
                            break;
                        case 2:
                            str3 = "http_error";
                            break;
                        case 3:
                            str3 = "invalid_input";
                            break;
                        case 4:
                            str3 = "decode_error";
                            break;
                        case 5:
                            str3 = "playback_error";
                            break;
                        case 6:
                            str3 = "url_error";
                            break;
                        default:
                            throw null;
                    }
                    lyl1VarN.u(str3);
                }
                Integer num = veoVar.b;
                if (num != null) {
                    lyl1VarN.v(num.intValue());
                }
                Integer num2 = veoVar.c;
                if (num2 != null) {
                    lyl1VarN.n(num2.intValue());
                }
                int i3 = veoVar.d;
                if (i3 != 0) {
                    lyl1VarN.r(pzm.s(i3).toLowerCase(Locale.ROOT));
                }
                int i4 = veoVar.e;
                if (i4 != 0) {
                    if (i4 == 1) {
                        str2 = "SESSION_STOPPED";
                    } else if (i4 == 2) {
                        str2 = "TRACK_CHANGED";
                    } else if (i4 == 3) {
                        str2 = "COACHING_DISABLED";
                    } else {
                        if (i4 != 4) {
                            throw null;
                        }
                        str2 = "PAUSED";
                    }
                    lyl1VarN.q(str2.toLowerCase(Locale.ROOT));
                }
                Boolean bool2 = l3t0Var.c;
                if (bool2 != null) {
                    lyl1VarN.w(bool2.booleanValue());
                }
                String str6 = l3t0Var.b;
                if (str6 != null) {
                    lyl1VarN.x(str6);
                }
                WorkoutCuePipelineEvent workoutCuePipelineEventBuild = lyl1VarN.build();
                t2j0 t2j0Var = (t2j0) pb00Var.a;
                workoutCuePipelineEventBuild.getClass();
                t2j0Var.a(workoutCuePipelineEventBuild);
            }
        }
        return rih1.a;
    }
}
