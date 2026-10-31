package p;

import com.google.protobuf.h;
import com.spotify.lyrics.complianceitgc.proto.LyricsSnippetViewEvent;
import com.spotify.lyrics.complianceitgc.proto.MinimumLyricsCharactersSeen;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ykf0 {
    public final t2j0 a;
    public final zwz0 b;

    public ykf0(t2j0 t2j0Var, zwz0 zwz0Var) {
        this.a = t2j0Var;
        this.b = zwz0Var;
    }

    public final void a(int i, String str, String str2, bef0 bef0Var, dhf0 dhf0Var, boolean z, boolean z2) {
        h hVarBuild;
        if (z) {
            dhf0Var.toString();
            rpf0 rpf0VarN = LyricsSnippetViewEvent.n();
            rpf0VarN.u(str);
            rpf0VarN.q(str2);
            rpf0VarN.n(dhf0Var.getId());
            rpf0VarN.r(bef0Var.getName());
            rpf0VarN.s(bef0Var.getId());
            rpf0VarN.t(pze0.q(i));
            hVarBuild = rpf0VarN.build();
        } else {
            dhf0Var.toString();
            xsj0 xsj0VarN = MinimumLyricsCharactersSeen.n();
            xsj0VarN.w(str);
            xsj0VarN.s(str2);
            xsj0VarN.r(dhf0Var.getId());
            xsj0VarN.t(bef0Var.getName());
            xsj0VarN.u(bef0Var.getId());
            xsj0VarN.v(pze0.q(i));
            xsj0VarN.n(((Boolean) c921.D(new p6d0(this, (lnm) null, (byte) 21))).booleanValue());
            xsj0VarN.q(z2);
            hVarBuild = xsj0VarN.build();
        }
        hVarBuild.getClass();
        this.a.a(hVarBuild);
    }
}
