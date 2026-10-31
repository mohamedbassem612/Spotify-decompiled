package p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cks0 {
    public final zle1 a;
    public t45 b;
    public boolean c;

    public cks0(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final void a(int i) {
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.g.put(VoiceAssistantsPerformance.DIMENSION_OUTCOME, k4s0.e(i));
            t45Var.g("chat_invite_link");
            this.a.b(t45Var.e());
        }
        this.b = null;
    }

    public final void b(int i, Boolean bool, String str) {
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, k4s0.e(i));
            if (str != null) {
                Set set = s4b1.f;
                String strZ = uic.x(str).z();
                if (strZ == null) {
                    strZ = "";
                }
                t45Var.b("entity_uri", strZ);
            }
            if (bool != null) {
                t45Var.a("hierarchy_existed", String.valueOf(bool.booleanValue()));
            }
            t45Var.g("off_platform_share_link");
            this.a.b(t45Var.e());
        }
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b A[PHI: r1
      0x001b: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:5:0x0008, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(int i) {
        int iC = l1d.C(i);
        int i2 = 1;
        if (iC != 0) {
            int i3 = 2;
            if (iC != 1) {
                i2 = 3;
                if (iC != 2) {
                    i3 = 4;
                    if (iC != 3) {
                        i2 = 5;
                        if (iC != 4) {
                            if (iC != 5) {
                                eg.o();
                                return;
                            }
                            i2 = 6;
                        }
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        t45 t45Var = this.b;
        if (t45Var != null) {
            t45Var.g.put(VoiceAssistantsPerformance.DIMENSION_OUTCOME, k4s0.e(i2));
            t45Var.g(this.c ? "chat_invite_link" : "off_platform_share_link");
            this.a.b(t45Var.e());
        }
        this.b = null;
    }

    public final void d(piz pizVar, boolean z) {
        int i;
        if (z) {
            i = 8;
        } else if (u890.j(pizVar, giz.a)) {
            i = 7;
        } else if (u890.j(pizVar, jiz.a)) {
            i = 9;
        } else if (u890.j(pizVar, kiz.a)) {
            i = 10;
        } else if (pizVar instanceof liz) {
            i = 11;
        } else if (u890.j(pizVar, miz.a)) {
            i = 12;
        } else if (u890.j(pizVar, niz.a)) {
            i = 13;
        } else if (u890.j(pizVar, hiz.a)) {
            i = 15;
        } else {
            if (!u890.j(pizVar, iiz.a) && pizVar != null) {
                eg.o();
                return;
            }
            i = 14;
        }
        a(i);
    }

    public final void e(xmp0 xmp0Var, String str) {
        int i;
        if (xmp0Var instanceof wmp0) {
            wmp0 wmp0Var = (wmp0) xmp0Var;
            b(wmp0Var.a ? 17 : 16, Boolean.valueOf(wmp0Var.d), str);
            return;
        }
        if (!(xmp0Var instanceof vmp0)) {
            eg.o();
            return;
        }
        piz pizVar = ((vmp0) xmp0Var).a;
        if (u890.j(pizVar, giz.a)) {
            i = 7;
        } else if (u890.j(pizVar, jiz.a)) {
            i = 9;
        } else if (u890.j(pizVar, kiz.a)) {
            i = 10;
        } else if (pizVar instanceof liz) {
            i = 11;
        } else if (u890.j(pizVar, miz.a)) {
            i = 12;
        } else if (u890.j(pizVar, niz.a)) {
            i = 13;
        } else if (u890.j(pizVar, hiz.a)) {
            i = 15;
        } else {
            if (!u890.j(pizVar, iiz.a) && pizVar != null) {
                eg.o();
                return;
            }
            i = 14;
        }
        b(i, null, null);
    }
}
