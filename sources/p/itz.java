package p;

import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMemberVolumeRequest;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationRequest;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlMutationStartResult;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlVolumeStartResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class itz {
    public final kly0 a;
    public final jo20 b;
    public final q8n c;
    public final bpb1 d;
    public final bpb1 e;
    public c9n f;

    public itz(kly0 kly0Var, jo20 jo20Var, q8n q8nVar) {
        this.a = kly0Var;
        this.b = jo20Var;
        this.c = q8nVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        this.e = bpb1VarB;
        this.f = i3a.k(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        etz etzVar;
        if (onmVar instanceof etz) {
            etzVar = (etz) onmVar;
            int i = etzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                etzVar.d = i - Integer.MIN_VALUE;
            } else {
                etzVar = new etz(this, onmVar);
            }
        } else {
            etzVar = new etz(this, onmVar);
        }
        Object objA = etzVar.b;
        int i2 = etzVar.d;
        if (i2 == 0) {
            hm5.M(objA);
            ua6 ua6Var = (ua6) this.a.get();
            oa6 oa6VarN = ArtisanalCastGroupControlMutationRequest.n();
            oa6VarN.n(str);
            ArtisanalCastGroupControlMutationRequest artisanalCastGroupControlMutationRequest = (ArtisanalCastGroupControlMutationRequest) oa6VarN.build();
            etzVar.a = this;
            etzVar.d = 1;
            objA = ua6Var.a(artisanalCastGroupControlMutationRequest, etzVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = etzVar.a;
            hm5.M(objA);
        }
        ArtisanalCastGroupControlMutationStartResult artisanalCastGroupControlMutationStartResult = (ArtisanalCastGroupControlMutationStartResult) objA;
        this.getClass();
        ma6 ma6VarN = artisanalCastGroupControlMutationStartResult.n();
        if (ma6VarN == ma6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NONE) {
            ma6VarN = null;
        }
        String strName = ma6VarN != null ? ma6VarN.name() : null;
        return strName != null ? new jfn0(strName) : new kfn0(artisanalCastGroupControlMutationStartResult.o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        gtz gtzVar;
        if (onmVar instanceof gtz) {
            gtzVar = (gtz) onmVar;
            int i = gtzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gtzVar.d = i - Integer.MIN_VALUE;
            } else {
                gtzVar = new gtz(this, onmVar);
            }
        } else {
            gtzVar = new gtz(this, onmVar);
        }
        Object objB = gtzVar.b;
        int i2 = gtzVar.d;
        if (i2 == 0) {
            hm5.M(objB);
            ua6 ua6Var = (ua6) this.a.get();
            oa6 oa6VarN = ArtisanalCastGroupControlMutationRequest.n();
            oa6VarN.n(str);
            ArtisanalCastGroupControlMutationRequest artisanalCastGroupControlMutationRequest = (ArtisanalCastGroupControlMutationRequest) oa6VarN.build();
            gtzVar.a = this;
            gtzVar.d = 1;
            objB = ua6Var.b(artisanalCastGroupControlMutationRequest, gtzVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = gtzVar.a;
            hm5.M(objB);
        }
        ArtisanalCastGroupControlMutationStartResult artisanalCastGroupControlMutationStartResult = (ArtisanalCastGroupControlMutationStartResult) objB;
        this.getClass();
        ma6 ma6VarN = artisanalCastGroupControlMutationStartResult.n();
        if (ma6VarN == ma6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NONE) {
            ma6VarN = null;
        }
        String strName = ma6VarN != null ? ma6VarN.name() : null;
        return strName != null ? new jfn0(strName) : new kfn0(artisanalCastGroupControlMutationStartResult.o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, double d, onm onmVar) {
        htz htzVar;
        if (onmVar instanceof htz) {
            htzVar = (htz) onmVar;
            int i = htzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                htzVar.d = i - Integer.MIN_VALUE;
            } else {
                htzVar = new htz(this, onmVar);
            }
        } else {
            htzVar = new htz(this, onmVar);
        }
        Object objC = htzVar.b;
        int i2 = htzVar.d;
        if (i2 == 0) {
            hm5.M(objC);
            ua6 ua6Var = (ua6) this.a.get();
            la6 la6VarN = ArtisanalCastGroupControlMemberVolumeRequest.n();
            la6VarN.n(str);
            la6VarN.q(d);
            ArtisanalCastGroupControlMemberVolumeRequest artisanalCastGroupControlMemberVolumeRequest = (ArtisanalCastGroupControlMemberVolumeRequest) la6VarN.build();
            htzVar.a = this;
            htzVar.d = 1;
            objC = ua6Var.c(artisanalCastGroupControlMemberVolumeRequest, htzVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = htzVar.a;
            hm5.M(objC);
        }
        ArtisanalCastGroupControlVolumeStartResult artisanalCastGroupControlVolumeStartResult = (ArtisanalCastGroupControlVolumeStartResult) objC;
        this.getClass();
        ma6 ma6VarN = artisanalCastGroupControlVolumeStartResult.n();
        if (ma6VarN == ma6.ARTISANAL_CAST_GROUP_CONTROL_MUTATION_ERROR_NONE) {
            ma6VarN = null;
        }
        String strName = ma6VarN != null ? ma6VarN.name() : null;
        return strName != null ? new ytk1(strName) : new ztk1(artisanalCastGroupControlVolumeStartResult.o());
    }
}
