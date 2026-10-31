package com.spotify.home.evopage.mobius;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p.bhn0;
import p.eg;
import p.eqq;
import p.jn60;
import p.mmr0;
import p.oqn1;
import p.rfu;
import p.sqg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class a {
    public static final String a() {
        return eqq.m("session-", UUID.randomUUID());
    }

    public static final String b(State state) {
        if (state instanceof State.Loading) {
            return ((State.Loading) state).getSessionId();
        }
        if (state instanceof State.Content) {
            return ((State.Content) state).getModel().f;
        }
        if (state instanceof State.Error) {
            return ((State.Error) state).getSessionId();
        }
        eg.o();
        return null;
    }

    public static final State.Content c(State state) {
        State.Content content = state instanceof State.Content ? (State.Content) state : null;
        if (content != null) {
            return content;
        }
        bhn0.s(state, "Invalid State, expected content but was ");
        return null;
    }

    public static final Map d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rfu rfuVar = (jn60) it.next();
            mmr0 mmr0VarN = (rfuVar instanceof rfu ? rfuVar : null) != null ? oqn1.n(rfuVar.c(), rfuVar) : null;
            if (mmr0VarN != null) {
                arrayList.add(mmr0VarN);
            }
        }
        return sqg0.T(arrayList);
    }
}
