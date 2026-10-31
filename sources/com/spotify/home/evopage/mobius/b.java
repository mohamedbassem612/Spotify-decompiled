package com.spotify.home.evopage.mobius;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a181;
import p.be81;
import p.chm0;
import p.dm61;
import p.dzz;
import p.eg;
import p.ezz;
import p.gvg;
import p.ice0;
import p.ihc1;
import p.jn60;
import p.mmr0;
import p.niu;
import p.o7h;
import p.sqg0;
import p.u890;
import p.w7x;
import p.x450;
import p.x4e0;
import p.yz21;
import p.z6x;
import p.zbj1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class b {
    /* JADX WARN: Code duplicated, block: B:186:0x0571  */
    public static Next a(State state, Event event, boolean z) {
        Next nextA;
        String str;
        State.Content contentCopy$default;
        State.Content contentCopy$default2;
        boolean z2;
        chm0 model;
        boolean z3 = event instanceof dzz;
        int i = -1;
        Set setA = w7x.a;
        ice0 ice0Var = ice0.c;
        List list = z6x.a;
        State.Content refreshToken = null;
        if (z3) {
            dzz dzzVar = (dzz) event;
            List list2 = dzzVar.a;
            x4e0 x4e0Var = dzzVar.g;
            boolean z4 = dzzVar.f;
            boolean z5 = state instanceof State.Content;
            boolean z6 = z5 && !z4;
            State.Content content = z5 ? (State.Content) state : null;
            List loadingHistory = content != null ? content.getLoadingHistory() : null;
            chm0 chm0Var = new chm0(list2, dzzVar.b, dzzVar.c, dzzVar.d, list, a.b(state));
            boolean z7 = dzzVar.f;
            String str2 = dzzVar.k;
            String str3 = dzzVar.l;
            List listSingletonList = Collections.singletonList(x4e0Var.name());
            if (loadingHistory != null) {
                list = loadingHistory;
            }
            State.Content content2 = new State.Content(chm0Var, z7, str2, str3, o7h.N0(list, listSingletonList));
            if (x450.a[dzzVar.j.ordinal()] != 1) {
                yz21 yz21Var = dzzVar.e;
                Iterator it = content2.getModel().a.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((jn60) it.next()) instanceof a181) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                setA = Collections.singleton(new Effect.TryAddingBrandAdPreview(Math.max(0, i), yz21Var));
            } else if (z4) {
                setA = Collections.singleton(new Effect.LoadHomeStructure(ice0Var, (String) null, a.b(state), 2, (DefaultConstructorMarker) null));
            }
            Set setO1 = o7h.o1(setA);
            State.Content content3 = z5 ? (State.Content) state : null;
            if (content3 != null && (model = content3.getModel()) != null) {
                refreshToken = model.a;
            }
            if (!u890.j(refreshToken, list2)) {
                setO1.add(new Effect.UpdateOnDemandSet(x4e0Var, dzzVar.h, dzzVar.i));
            }
            nextA = z6 ? Next.i(State.Content.copy$default(content2, chm0.a(content2.getModel(), (ArrayList) null, (Set) null, (Set) null, a.c(state).getModel().e, (String) null, 47), false, (String) null, (String) null, (List) null, 30, (Object) null), setO1) : Next.i(content2, setO1);
        } else if (event instanceof Event.GotSlotBasedHomeContent) {
            Event.GotSlotBasedHomeContent gotSlotBasedHomeContent = (Event.GotSlotBasedHomeContent) event;
            z2 = (state instanceof State.Content) && !gotSlotBasedHomeContent.isConnected();
            State.Content content4 = new State.Content(new chm0(gotSlotBasedHomeContent.getSectionDataList(), gotSlotBasedHomeContent.getDismissedSectionUris(), gotSlotBasedHomeContent.getTempAdDismissedSectionUris(), gotSlotBasedHomeContent.getEagerLoadedTraits(), list, a.b(state)), gotSlotBasedHomeContent.isConnected(), gotSlotBasedHomeContent.getPageToken(), gotSlotBasedHomeContent.getRefreshToken(), (List) null, 16, (DefaultConstructorMarker) null);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = content4.getModel().a.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                if (((jn60) it2.next()) instanceof a181) {
                    i = i3;
                    break;
                }
                i3++;
            }
            linkedHashSet.add(new Effect.TryAddingBrandAdPreview(Math.max(0, i), gotSlotBasedHomeContent.getResponseInstrumentationData()));
            nextA = z2 ? Next.i(State.Content.copy$default(content4, chm0.a(content4.getModel(), (ArrayList) null, (Set) null, (Set) null, a.c(state).getModel().e, (String) null, 47), false, (String) null, (String) null, (List) null, 30, (Object) null), linkedHashSet) : Next.i(content4, linkedHashSet);
        } else {
            boolean z8 = event instanceof Event.FailedToLoadHomeStructure;
            ice0 ice0Var2 = ice0.f;
            if (z8) {
                Event.FailedToLoadHomeStructure failedToLoadHomeStructure = (Event.FailedToLoadHomeStructure) event;
                if (failedToLoadHomeStructure.getLoadingStrategy() == ice0.a) {
                    nextA = Next.a(Collections.singleton(new Effect.LoadHomeStructure(ice0Var, (String) null, a.b(state), 2, (DefaultConstructorMarker) null)));
                } else if (failedToLoadHomeStructure.isConnected() || !u890.j(failedToLoadHomeStructure.getFilterValue(), "default") || failedToLoadHomeStructure.getLoadingStrategy() == ice0Var2) {
                    Throwable error = failedToLoadHomeStructure.getError();
                    if (state instanceof State.Content) {
                        refreshToken = ((State.Content) state).getRefreshToken();
                    } else if (state instanceof State.Error) {
                        refreshToken = ((State.Error) state).getRefreshToken();
                    }
                    nextA = Next.h(new State.Error(error, refreshToken, a.b(state)));
                } else {
                    nextA = Next.a(Collections.singleton(new Effect.OfflineFallbackResponse(failedToLoadHomeStructure.getFilterValue())));
                }
            } else if (event instanceof Event.ExplicitFeedbackListChanged) {
                Event.ExplicitFeedbackListChanged explicitFeedbackListChanged = (Event.ExplicitFeedbackListChanged) event;
                State.Content content5 = state instanceof State.Content ? (State.Content) state : null;
                if (content5 == null) {
                    nextA = Next.j();
                } else {
                    chm0 model2 = content5.getModel();
                    Set set = content5.getModel().b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (((com.spotify.home.evopage.structureapi.DismissedEntity) obj).getType() != com.spotify.home.evopage.structureapi.DismissedEntity.Type.EXPLICIT_FEEDBACK) {
                            arrayList.add(obj);
                        }
                    }
                    Set setP1 = o7h.p1(arrayList);
                    Map mapD = a.d(model2.a);
                    Set entityUris = explicitFeedbackListChanged.getEntityUris();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = entityUris.iterator();
                    while (it3.hasNext()) {
                        jn60 jn60Var = (jn60) mapD.get((String) it3.next());
                        com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity = (jn60Var == null || (jn60Var instanceof be81)) ? null : new com.spotify.home.evopage.structureapi.DismissedEntity(jn60Var.getId(), com.spotify.home.evopage.structureapi.DismissedEntity.Type.EXPLICIT_FEEDBACK);
                        if (dismissedEntity != null) {
                            arrayList2.add(dismissedEntity);
                        }
                    }
                    nextA = Next.h(State.Content.copy$default(content5, chm0.a(model2, (ArrayList) null, dm61.y0(setP1, arrayList2), (Set) null, (List) null, (String) null, 61), false, (String) null, (String) null, (List) null, 30, (Object) null));
                }
            } else if (event instanceof Event.ConsumptionStateChanged) {
                Event.ConsumptionStateChanged consumptionStateChanged = (Event.ConsumptionStateChanged) event;
                State.Content content6 = state instanceof State.Content ? (State.Content) state : null;
                if (content6 == null) {
                    nextA = Next.j();
                } else {
                    chm0 model3 = content6.getModel();
                    Map entityUriToWasPlayed = consumptionStateChanged.getEntityUriToWasPlayed();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : entityUriToWasPlayed.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Boolean bool = (Boolean) entry.getValue();
                        bool.getClass();
                        jn60 jn60Var2 = (jn60) a.d(model3.a).get(str4);
                        mmr0 mmr0Var = jn60Var2 == null ? null : new mmr0(jn60Var2.getId(), bool);
                        if (mmr0Var != null) {
                            arrayList3.add(mmr0Var);
                        }
                    }
                    Map mapT = sqg0.T(arrayList3);
                    Set setO2 = o7h.o1(model3.b);
                    for (Map.Entry entry2 : mapT.entrySet()) {
                        String str5 = (String) entry2.getKey();
                        boolean zBooleanValue = ((Boolean) entry2.getValue()).booleanValue();
                        com.spotify.home.evopage.structureapi.DismissedEntity dismissedEntity2 = new com.spotify.home.evopage.structureapi.DismissedEntity(str5, com.spotify.home.evopage.structureapi.DismissedEntity.Type.MARKED_AS_PLAYED);
                        if (zBooleanValue) {
                            setO2.add(dismissedEntity2);
                        } else {
                            setO2.remove(dismissedEntity2);
                        }
                    }
                    nextA = Next.h(State.Content.copy$default(content6, chm0.a(model3, (ArrayList) null, o7h.p1(setO2), (Set) null, (List) null, (String) null, 61), false, (String) null, (String) null, (List) null, 30, (Object) null));
                }
            } else if (event instanceof Event.DismissSection) {
                Event.DismissSection dismissSection = (Event.DismissSection) event;
                State.Content content7 = state instanceof State.Content ? (State.Content) state : null;
                if (content7 == null) {
                    nextA = Next.j();
                } else {
                    chm0 model4 = content7.getModel();
                    Set setO3 = o7h.o1(model4.b);
                    setO3.add(dismissSection.getEntity());
                    nextA = Next.h(State.Content.copy$default(content7, chm0.a(model4, (ArrayList) null, o7h.p1(setO3), (Set) null, (List) null, (String) null, 61), false, (String) null, (String) null, (List) null, 30, (Object) null));
                }
            } else if (event instanceof Event.UndoDismissSection) {
                Event.UndoDismissSection undoDismissSection = (Event.UndoDismissSection) event;
                State.Content content8 = state instanceof State.Content ? (State.Content) state : null;
                if (content8 == null) {
                    nextA = Next.j();
                } else {
                    chm0 model5 = content8.getModel();
                    if (model5.b.contains(undoDismissSection.getEntity())) {
                        Set setO4 = o7h.o1(model5.b);
                        setO4.remove(undoDismissSection.getEntity());
                        nextA = Next.h(State.Content.copy$default(content8, chm0.a(model5, (ArrayList) null, setO4, (Set) null, (List) null, (String) null, 61), false, (String) null, (String) null, (List) null, 30, (Object) null));
                    } else {
                        nextA = Next.j();
                    }
                }
            } else if (event instanceof Event.ConnectivityChanged) {
                Event.ConnectivityChanged connectivityChanged = (Event.ConnectivityChanged) event;
                if (state instanceof State.Content) {
                    State.Content content9 = (State.Content) state;
                    z2 = content9.isOnline() != connectivityChanged.isConnected();
                    chm0 model6 = (!connectivityChanged.isConnected() || content9.getModel().a.isEmpty()) ? content9.getModel() : chm0.a(content9.getModel(), (ArrayList) null, (Set) null, (Set) null, list, (String) null, 47);
                    if (z2) {
                        setA = Effects.a(new Effect.LoadHomeStructure[]{new Effect.LoadHomeStructure(connectivityChanged.getLoadingStrategy(), (String) null, a.b(state), 2, (DefaultConstructorMarker) null)});
                    }
                    nextA = Next.i(State.Content.copy$default(content9, model6, connectivityChanged.isConnected(), (String) null, (String) null, (List) null, 28, (Object) null), setA);
                } else if ((state instanceof State.Error) && connectivityChanged.isConnected()) {
                    State.Error error2 = (State.Error) state;
                    nextA = Next.i(new State.Loading(error2.getSessionId()), Collections.singleton(new Effect.LoadHomeStructure(connectivityChanged.getLoadingStrategy(), (String) null, error2.getSessionId(), 2, (DefaultConstructorMarker) null)));
                } else {
                    nextA = Next.j();
                }
            } else if (event instanceof Event.GotOfflineItems) {
                Event.GotOfflineItems gotOfflineItems = (Event.GotOfflineItems) event;
                if (state instanceof State.Content) {
                    State.Content content10 = (State.Content) state;
                    if (content10.isOnline()) {
                        nextA = Next.j();
                    } else {
                        nextA = Next.h(State.Content.copy$default(content10, chm0.a(content10.getModel(), (ArrayList) null, (Set) null, (Set) null, gotOfflineItems.getOfflineHomeItems(), (String) null, 47), false, (String) null, (String) null, (List) null, 30, (Object) null));
                    }
                } else {
                    nextA = Next.j();
                }
            } else if (event instanceof Event.FailedToLoadOfflineItems) {
                nextA = Next.h(new State.Error(((Event.FailedToLoadOfflineItems) event).getError(), (String) null, a.b(state), 2, (DefaultConstructorMarker) null));
            } else if (event instanceof Event.GotHomeFeatureType) {
                Event.GotHomeFeatureType gotHomeFeatureType = (Event.GotHomeFeatureType) event;
                refreshToken = state instanceof State.Content ? (State.Content) state : null;
                if (refreshToken == null || gotHomeFeatureType.getHomeFeatureType() == null) {
                    nextA = Next.j();
                } else {
                    List list3 = refreshToken.getModel().a;
                    if ((gotHomeFeatureType.getHomeFeatureType() instanceof zbj1) || (gotHomeFeatureType.getHomeFeatureType() instanceof niu)) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : list3) {
                            jn60 jn60Var3 = (jn60) obj2;
                            if (!(jn60Var3 instanceof zbj1) && !(jn60Var3 instanceof niu)) {
                                arrayList4.add(obj2);
                            }
                        }
                        list3 = arrayList4;
                    }
                    ArrayList arrayList5 = new ArrayList(list3);
                    try {
                        arrayList5.add(gotHomeFeatureType.getInjectionIndex(), gotHomeFeatureType.getHomeFeatureType());
                    } catch (IndexOutOfBoundsException unused) {
                        arrayList5.add(gotHomeFeatureType.getHomeFeatureType());
                    }
                    nextA = Next.h(State.Content.copy$default((State.Content) state, chm0.a(refreshToken.getModel(), arrayList5, (Set) null, (Set) null, (List) null, (String) null, 62), false, (String) null, (String) null, (List) null, 30, (Object) null));
                }
            } else if (event instanceof Event.TempDismissedEntitiesChanged) {
                Event.TempDismissedEntitiesChanged tempDismissedEntitiesChanged = (Event.TempDismissedEntitiesChanged) event;
                State.Content content11 = state instanceof State.Content ? (State.Content) state : null;
                nextA = content11 == null ? Next.j() : Next.h(State.Content.copy$default(content11, chm0.a(content11.getModel(), (ArrayList) null, (Set) null, tempDismissedEntitiesChanged.getDismissedEntities(), (List) null, (String) null, 59), false, (String) null, (String) null, (List) null, 30, (Object) null));
            } else if (event instanceof Event$Foregrounded) {
                nextA = Next.i(state, Effects.a(new Effect.CheckForceReload[]{Effect.CheckForceReload.INSTANCE}));
            } else if (event instanceof Event$PageBecameFocused) {
                String strA = a.a();
                if (state instanceof State.Content) {
                    State.Content content12 = (State.Content) state;
                    contentCopy$default2 = State.Content.copy$default(content12, chm0.a(content12.getModel(), (ArrayList) null, (Set) null, (Set) null, (List) null, strA, 31), false, (String) null, (String) null, (List) null, 30, (Object) null);
                } else if (state instanceof State.Loading) {
                    contentCopy$default2 = ((State.Loading) state).copy(strA);
                } else {
                    if (!(state instanceof State.Error)) {
                        eg.o();
                        return null;
                    }
                    contentCopy$default2 = State.Error.copy$default((State.Error) state, (Throwable) null, (String) null, strA, 3, (Object) null);
                }
                nextA = Next.h(contentCopy$default2);
            } else if (event instanceof Event$ForceReloadChecked) {
                Event$ForceReloadChecked event$ForceReloadChecked = (Event$ForceReloadChecked) event;
                nextA = event$ForceReloadChecked.getShouldReload() ? Next.a(Effects.a(new Effect.LoadHomeStructure[]{new Effect.LoadHomeStructure(event$ForceReloadChecked.getLoadingStrategy(), (String) null, a.b(state), 2, (DefaultConstructorMarker) null)})) : Next.j();
            } else if (event instanceof Event$LoadMore) {
                if (state instanceof State.Content) {
                    State.Content content13 = (State.Content) state;
                    nextA = !ihc1.y0(content13.getPageToken()) ? Next.a(Effects.a(new Effect.LoadMoreHomeStructure[]{new Effect.LoadMoreHomeStructure(content13.getPageToken())})) : Next.j();
                } else {
                    nextA = Next.j();
                }
            } else if (event instanceof Event$FailedToLoadMoreHomeStructure) {
                nextA = Next.j();
            } else if (event instanceof ezz) {
                ezz ezzVar = (ezz) event;
                if (state instanceof State.Content) {
                    State.Content content14 = (State.Content) state;
                    nextA = Next.h(State.Content.copy$default(content14, chm0.a(content14.getModel(), o7h.N0(ezzVar.a, content14.getModel().a), (Set) null, (Set) null, (List) null, (String) null, 62), ezzVar.b, ezzVar.d, (String) null, (List) null, 24, (Object) null));
                } else {
                    nextA = Next.j();
                }
            } else if (event instanceof Event$Refresh) {
                String strA2 = a.a();
                boolean z9 = state instanceof State.Content;
                if (z9) {
                    State.Content content15 = (State.Content) state;
                    str = strA2;
                    contentCopy$default = State.Content.copy$default(content15, chm0.a(content15.getModel(), (ArrayList) null, (Set) null, (Set) null, (List) null, str, 31), false, (String) null, (String) null, (List) null, 30, (Object) null);
                } else {
                    str = strA2;
                    if (state instanceof State.Loading) {
                        contentCopy$default = ((State.Loading) state).copy(str);
                    } else {
                        if (!(state instanceof State.Error)) {
                            eg.o();
                            return null;
                        }
                        contentCopy$default = State.Error.copy$default((State.Error) state, (Throwable) null, (String) null, str, 3, (Object) null);
                        str = str;
                    }
                }
                if (z9) {
                    refreshToken = ((State.Content) state).getRefreshToken();
                } else if (state instanceof State.Error) {
                    refreshToken = ((State.Error) state).getRefreshToken();
                }
                nextA = Next.i(contentCopy$default, Collections.singleton(new Effect.LoadHomeStructure(ice0Var2, refreshToken, str)));
            } else {
                if (!(event instanceof Event$VideoSettingsChanged)) {
                    eg.o();
                    return null;
                }
                nextA = Next.a(Effects.a(new Effect.LoadHomeStructure[]{new Effect.LoadHomeStructure(ice0Var2, (String) null, a.b(state), 2, (DefaultConstructorMarker) null)}));
            }
        }
        if (z) {
            Set<Effect.LoadHomeStructure> setB = nextA.b();
            if (!(setB instanceof Collection) || !setB.isEmpty()) {
                for (Effect.LoadHomeStructure loadHomeStructure : setB) {
                    if ((loadHomeStructure instanceof Effect.LoadHomeStructure) && loadHomeStructure.getLoadingStrategy() != ice0Var) {
                        LinkedHashSet linkedHashSetX0 = dm61.x0(new Effect() { // from class: com.spotify.home.evopage.mobius.Effect$RefreshPromptCta
                            public boolean equals(Object other) {
                                return this == other || (other instanceof Effect$RefreshPromptCta);
                            }

                            public int hashCode() {
                                return -1617391498;
                            }

                            public String toString() {
                                return "RefreshPromptCta";
                            }
                        }, nextA.b());
                        if (!nextA.d()) {
                            nextA = Next.a(linkedHashSetX0);
                            break;
                        }
                        nextA = Next.i(nextA.g(), linkedHashSetX0);
                        break;
                    }
                }
            }
        }
        String strBreadcrumb = event.breadcrumb();
        String strBreadcrumb2 = state.breadcrumb();
        String strBreadcrumb3 = nextA.d() ? ((State) nextA.g()).breadcrumb() : "empty";
        StringBuilder sbN = gvg.n("EvoPage :: event: ", strBreadcrumb, ", oldModel: ", strBreadcrumb2, ", newModel: ");
        sbN.append(strBreadcrumb3);
        Logger.b(sbN.toString(), new Object[0]);
        return nextA;
    }
}
