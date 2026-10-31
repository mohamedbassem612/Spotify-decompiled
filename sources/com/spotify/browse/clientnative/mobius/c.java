package com.spotify.browse.clientnative.mobius;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.mmr0;
import p.nvo;
import p.s7c;
import p.sfu;
import p.sqg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class c {
    public static final nvo a = new nvo();

    public static final BrowseState.Content a(BrowseState browseState) {
        if (browseState instanceof BrowseState.Content) {
            return (BrowseState.Content) browseState;
        }
        return null;
    }

    public static final Map b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s7c s7cVar = (s7c) it.next();
            mmr0 mmr0Var = (s7cVar instanceof sfu ? (sfu) s7cVar : null) != null ? new mmr0(((sfu) s7cVar).c(), s7cVar) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }
}
