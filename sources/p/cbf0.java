package p;

import android.text.Annotation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cbf0 implements rjc0 {
    public final /* synthetic */ Annotation a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ awg1 c;

    public cbf0(Annotation annotation, iu30 iu30Var, awg1 awg1Var) {
        this.a = annotation;
        this.b = iu30Var;
        this.c = awg1Var;
    }

    public final void a(mjc0 mjc0Var) {
        Object raf0Var;
        String value = this.a.getValue();
        if (value != null) {
            int iHashCode = value.hashCode();
            iu30 iu30Var = this.b;
            if (iHashCode == -247030562) {
                if (value.equals("data-saver-settings")) {
                    iu30Var.invoke(new laf0(pro1.t("dataSaverMode")));
                    return;
                }
                return;
            }
            if (iHashCode == -61097853) {
                if (value.equals("auto-adjust-settings")) {
                    iu30Var.invoke(new faf0(pro1.t("allowAudioQualityDowngrade")));
                    return;
                }
                return;
            }
            if (iHashCode == 1283718728 && value.equals("audio-quality-settings")) {
                String str = nik1.d3.a;
                switch (this.c.ordinal()) {
                    case 9:
                        raf0Var = new raf0(str);
                        break;
                    case 10:
                        raf0Var = new taf0(str);
                        break;
                    case 11:
                        raf0Var = new saf0(str);
                        break;
                    case 12:
                        raf0Var = new qaf0(str);
                        break;
                    default:
                        raf0Var = new raf0(str);
                        break;
                }
                iu30Var.invoke(raf0Var);
            }
        }
    }
}
