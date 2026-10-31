package p;

import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class dqe extends tv30 implements vu30 {
    public static final dqe a = new dqe(2, sqe.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/agentcoordinator/chatbubble/api/ChatBubbleElement$Props;Lcom/spotify/agentcoordinator/chatbubble/api/ChatBubbleElement$State;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        ope opeVar = (ope) obj;
        ppe ppeVar = (ppe) obj2;
        boolean z = opeVar.c;
        zzq0 zzq0Var = opeVar.b;
        jre jreVar = opeVar.a;
        jre jreVar2 = ppeVar.a;
        if (u890.j(jreVar, jreVar2) && zzq0Var.equals(ppeVar.b) && z == ppeVar.c) {
            return Next.j();
        }
        return Next.h(new ppe(jreVar, zzq0Var, z, !u890.j(jreVar, jreVar2) ? false : ppeVar.d));
    }
}
