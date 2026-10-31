package p;

import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMemberVolumeRequest;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationRequest;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationStartResult;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlVolumeStartResult;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ua6 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArtisanalCastGroupControlMutationRequest artisanalCastGroupControlMutationRequest, onm onmVar) {
        qa6 qa6Var;
        if (onmVar instanceof qa6) {
            qa6Var = (qa6) onmVar;
            int i = qa6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa6Var.c = i - Integer.MIN_VALUE;
            } else {
                qa6Var = new qa6(this, onmVar);
            }
        } else {
            qa6Var = new qa6(this, onmVar);
        }
        Object objCallSingle = qa6Var.a;
        int i2 = qa6Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            qa6Var.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.ArtisanalCastGroupControlService", "AddMember", artisanalCastGroupControlMutationRequest, qa6Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ArtisanalCastGroupControlMutationStartResult.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationStartResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ArtisanalCastGroupControlMutationRequest artisanalCastGroupControlMutationRequest, onm onmVar) {
        ra6 ra6Var;
        if (onmVar instanceof ra6) {
            ra6Var = (ra6) onmVar;
            int i = ra6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ra6Var.c = i - Integer.MIN_VALUE;
            } else {
                ra6Var = new ra6(this, onmVar);
            }
        } else {
            ra6Var = new ra6(this, onmVar);
        }
        Object objCallSingle = ra6Var.a;
        int i2 = ra6Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ra6Var.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.ArtisanalCastGroupControlService", "RemoveMember", artisanalCastGroupControlMutationRequest, ra6Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ArtisanalCastGroupControlMutationStartResult.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationStartResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ArtisanalCastGroupControlMemberVolumeRequest artisanalCastGroupControlMemberVolumeRequest, onm onmVar) {
        sa6 sa6Var;
        if (onmVar instanceof sa6) {
            sa6Var = (sa6) onmVar;
            int i = sa6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sa6Var.c = i - Integer.MIN_VALUE;
            } else {
                sa6Var = new sa6(this, onmVar);
            }
        } else {
            sa6Var = new sa6(this, onmVar);
        }
        Object objCallSingle = sa6Var.a;
        int i2 = sa6Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            sa6Var.c = 1;
            objCallSingle = callSingle("spotify.connect.discovery.cast.esperanto.proto.ArtisanalCastGroupControlService", "SetMemberVolume", artisanalCastGroupControlMemberVolumeRequest, sa6Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ArtisanalCastGroupControlVolumeStartResult.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlVolumeStartResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
